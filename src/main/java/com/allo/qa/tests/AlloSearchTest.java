package com.allo.qa.tests;

import com.allo.qa.pages.ComparisonPage;
import org.openqa.selenium.support.PageFactory;

import com.allo.qa.pages.HomePage;
import com.allo.qa.pages.SearchPage;
import org.testng.annotations.Test;

public class AlloSearchTest extends TestBase {

    @Test
    public void init() throws Exception{
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.setSearch("Iphone 7");
        homepage.ClickSearchButton();

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        Thread.sleep(4000);
        searchPage.Results();
        searchPage.FirstResult();
        searchPage.chooseToCompare();

        ComparisonPage comparisonPage = PageFactory.initElements(driver, ComparisonPage.class);
        comparisonPage.goToAllInfo();
        Thread.sleep(4000);
        comparisonPage.checkTable();
        comparisonPage.checkFirstTable();

    }
}
