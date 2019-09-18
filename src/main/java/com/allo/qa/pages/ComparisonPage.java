package com.allo.qa.pages;


import com.allo.qa.tests.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ComparisonPage extends TestBase {

    @FindBy(css = "#compare-tab > tbody > tr > td:nth-child(1) > div > a")
    WebElement allInfo;
    @FindBy(css = ".last-cell")
    List<WebElement> tableElementsLastCell;
    @FindBy(css = "#attributes-all td:nth-child(2)")
    List<WebElement> tableElementsFirstCell;


    public ComparisonPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToAllInfo(){
        allInfo.click();
    }
    public void checkTable(){
        for(WebElement element: tableElementsLastCell)
            System.out.println(element.getText());
    }
    public void checkFirstTable(){
        for(WebElement element: tableElementsFirstCell)
            System.out.println(element.getText());
    }
}
