package com.myg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage {

    static By Invoice = By.linkText("Invoice");
    static By DE =By.xpath("//span[contains(text(),'DE Sales Order List')]");
    static By CE =By.xpath("//span[contains(text(),'CE Sales Order List')]");



    public static void clickOnDEorderList(WebDriver driver) throws InterruptedException {
        driver.findElement(Invoice).click();
        Thread.sleep(200);
        driver.findElement(DE).click();

    }

    public static void clickOnCEorderList(WebDriver driver) throws InterruptedException {
        driver.findElement(Invoice).click();
        Thread.sleep(300);
        driver.findElement(CE).click();
    }
}
