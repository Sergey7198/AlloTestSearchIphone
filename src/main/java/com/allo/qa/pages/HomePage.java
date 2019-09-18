package com.allo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.allo.qa.tests.TestBase;


public class HomePage extends TestBase {

    @FindBy(css ="#search")
    WebElement searchField;
    @FindBy(css= "#search_mini_form > button")
    WebElement searchButton;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public void setSearch(String strWord) {
        searchField.click();
        searchField.sendKeys(strWord);
    }
    public void ClickSearchButton() {
        searchButton.click();
    }
}