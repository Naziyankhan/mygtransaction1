package com.myg.tests;

import com.myg.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static utils.ExtentTestManager.startTest;

public class SmokeTest {
    static WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }


    @BeforeMethod
    public void launchLogin() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        LoginPage.login(driver);
    }

    @Test
    public void verifyitemwithoutdiscount(Method method) throws InterruptedException {
        startTest("verify that the item without discount", "");
        HomePage.clickOnInvoice(driver);
        TransactionPage.clickOnDEsalesorderList(driver);
        DEList.clickOnEnquiry(driver);
        DEsalesorderList.verify_item_without_discount(driver);
    }



    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
