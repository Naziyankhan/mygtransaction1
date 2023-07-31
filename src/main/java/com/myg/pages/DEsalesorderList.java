package com.myg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DEsalesorderList {

    static By totalAmount = By.xpath("(//span[@class='float-right'])[1]");
//    static By payment = By.xpath("//u[contains(text(),'Make Payments')]");
//    static By cash = By.id("cash");
//    static By save1 = By.xpath("(//button[@type='submit'])[4]");
//    static By BUYBACK = By.xpath("(//td[@class='text-right width8 ng-star-inserted'])[1]");
    //static By discount = By.xpath("")
//    private static double calculateTotalPriceWithTax(double rate, double taxPercentage) {
//        double taxAmount = rate * (taxPercentage / 100);
//        return rate + taxAmount;
//    }
//
//    private static double calculateTotalPriceWithoutDiscount(double rate, double taxPercentage)
//    {
//        double taxAmount = 55000 * (18/100);
//        return 55000 + taxAmount;
//    }


    public static void verify_item_without_discount(WebDriver driver) {
        String amt1;
        double rate = 55000;
        double taxPercentage = 18;
        double expectedTotalPrice= (.18 * rate)+ rate;
        amt1 = driver.findElement(totalAmount).getText();
        double actualTotalPrice = Double.parseDouble(amt1);
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Total price without discount is incorrect.");

    }

}