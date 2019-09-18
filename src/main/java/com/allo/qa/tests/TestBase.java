package com.allo.qa.tests;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.allo.qa.utill.TestUtill;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;


    //	public TestBase() {
//	try  {
//		Properties prop = new Properties();
//		FileInputStream ip = new FileInputStream("com/allo/qa/config/config.properties");
//		prop.load(ip);
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//}
    @BeforeSuite
    public void initialization() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get("https://allo.ua");
    }
    @AfterSuite
    public void TearDown()
    {
        TestBase.driver.quit();
    }
}