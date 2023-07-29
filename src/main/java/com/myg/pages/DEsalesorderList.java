package com.myg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DEsalesorderList {

    static By payment = By.xpath("//u[contains(text(),'Make Payments')]");
    static By cash = By.id("cash");
    static By save1 = By.xpath("(//button[@type='submit'])[4]");
    static By BUYBACK= By.xpath("(//td[@class='text-right width8 ng-star-inserted'])[1]");

    public static void verify_to_add_buyback (WebDriver driver) {
        driver.findElement(BUYBACK).sendKeys("100");
       // driver.findElement();


    }
}