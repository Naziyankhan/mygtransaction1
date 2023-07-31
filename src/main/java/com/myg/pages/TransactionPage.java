package com.myg.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage {


   // static By DE =By.xpath("(//span[@class='hide-menu'])[23]");
    static By DE =By.xpath("//span[@class='hide-menu' and text()='DE Sales Order List']");

    static By CE =By.xpath("//span[contains(text(),'CE Sales Order List')]");



    public static void clickOnDEsalesorderList(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(DE).click();
        Thread.sleep(2000);

    }

    public static void clickOnCEsalesorderList(WebDriver driver) throws InterruptedException {
        Thread.sleep(300);
        driver.findElement(CE).click();
    }
}
