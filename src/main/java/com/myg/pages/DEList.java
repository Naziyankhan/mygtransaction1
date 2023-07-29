package com.myg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DEList {
    static By From_Date = By.name("fromDate");
    static By Date_from = By.xpath("//td[@aria-label='1 July 2023']");
    static By To_Date = By.name("toDate");
    static By Ok = By.xpath("//button[contains(text(),'OK')]");
    static By VIEW = By.xpath("(//a[@class='ng2-smart-action ng2-smart-action-custom-custom ng-star-inserted'])[24]");


    public static void clickOnEnquiry(WebDriver driver)
    {
        driver.findElement(From_Date).click();
        driver.findElement(Date_from).click();
        driver.findElement(Ok).click();
        driver.findElement(VIEW).click();


    }
}
