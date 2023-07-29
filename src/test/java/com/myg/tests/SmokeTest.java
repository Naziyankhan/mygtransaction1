package com.myg.tests;

import com.myg.pages.HomePage;
import com.myg.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static utils.ExtentTestManager.startTest;

public class SmokeTest {
    static WebDriver driver;

    @BeforeTest
    public void launchLogin() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        LoginPage.login(driver);
    }

    @Test
    public void addBranch(Method method) throws InterruptedException {
        startTest("", "");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.enterBranchDetails(driver);
    }

    @Test
    public void addBranchwithmandatoryfields(Method method) throws InterruptedException {
        startTest("", "");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.addbranchwithmandatoryfields(driver);
    }

    @Test
    public void verifyphonenumber(Method method) throws InterruptedException {
        startTest("", "");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifyphonenumber(driver);
    }

    @Test
    public void verifybranchcode(Method method) throws InterruptedException {
        startTest("", " ");

        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifybranchcode(driver);
    }

    @Test
    public void verifybranchname(Method method) throws InterruptedException {
        startTest("", " ");

        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifybranchname(driver);
    }

    @Test
    public void verifygst(Method method) throws InterruptedException {
        startTest("", "");

        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifygst(driver);
    }

    @Test
    public void verifyradiobutton(Method method) throws InterruptedException {
        startTest("", " ");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifyradiobutton(driver);
    }

    @Test
    public void verifycalender(Method method) throws InterruptedException {
        startTest("", " ");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifycalender(driver);
    }

    @Test
    public void verifyservicenumber(Method method) throws InterruptedException {
        startTest("Verify that the service number accepts only numbers", "Service number");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifyservicenumber(driver);
    }

    @Test
    public void verifystaticip(Method method) throws InterruptedException {
        startTest("Verify that the Static IP accepts valid Ip address or not", "verifystaticip");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifystaticip(driver);
    }

    @Test
    public void verifylatitude(Method method) throws InterruptedException {
        startTest("Verify that latitude field accepts decimal value or not", "latitude");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifylatitude(driver);
    }

    @Test
    public void verifylongitude(Method method) throws InterruptedException {
        startTest("Verify that the longitude field accepts decimal value or not", "Longitude");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifylongitude(driver);
    }

    @Test
    public void verifypincode(Method method) throws InterruptedException {
        startTest("Verify that the pincode field accepts six digit number", "pincode");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifypincode(driver);
    }

    @Test
    public void verifydefaultdate(Method method) throws InterruptedException {
        startTest("Verify that default date is present", "default date");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.verifydefaultdate(driver);
    }

    @Test
    public void afterrefresh(Method method) throws InterruptedException {
        startTest("Verify that after refresh the left alignment is the same as before", "alignment error");
        HomePage.clickOnMaster(driver);
        MasterPage.clickOnAddBranch(driver);
        AddBranchPage.afterrefresh(driver);
    }


    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
