package com.allo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.allo.qa.tests.TestBase;

public class SearchPage extends TestBase {
//    JavascriptExecutor je = (JavascriptExecutor) driver;

    @FindBy(css = ".products-grid")
    WebElement tableResults;
    @FindBy(css = "#label-id-192439")
    WebElement firstResult;
    @FindBy(css ="#label-id-192439 div.buttons-block > div.link-compare-wrap")
    WebElement compareFirstIcon;
    @FindBy(css ="#label-id-192447 div.buttons-block > div.link-compare-wrap")
    WebElement compareSecondIcon;
    @FindBy(css = "div.block-content > div > a.button.sub")
    WebElement compare;

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public void Results() {
        tableResults.isDisplayed();
    }
    public void FirstResult() {
        firstResult.isDisplayed();
    }
    public void chooseToCompare() throws Exception {
//        compareFirstIcon.getLocation();
//        je.executeScript("arguments[0].scrollIntoView(true);", compareFirstIcon);
            compareFirstIcon.click();
        Thread.sleep(3000);
        compareSecondIcon.click();
        compare.click();
    }
}
