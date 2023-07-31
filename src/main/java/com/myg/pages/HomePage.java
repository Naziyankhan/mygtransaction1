package com.myg.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
         static By Invoice = By.xpath("//span[@class='hide-menu' and text()='Invoice']");

  //  static By Invoice = By.xpath("//span[normalize-space()='Invoice']");
     public static void clickOnInvoice(WebDriver driver) throws InterruptedException
     {
         Thread.sleep(300);
         driver.findElement(Invoice).click();
         Thread.sleep(300);
     }
}







