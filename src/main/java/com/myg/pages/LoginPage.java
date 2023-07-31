package com.myg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    static By username = By.xpath("//input[@type='text']");
    static By password = By.id("password");
    static By loginbutton = By.xpath("//button[contains(text(),'Log In')]");
    static By OK = By.xpath("//button[@class='swal2-confirm swal2-styled']");

    public  static void login(WebDriver driver) throws InterruptedException {
        driver.get("http://101.53.144.103:2031/#/login/userlogin");
        WebElement txtUsername = driver.findElement(username);
        txtUsername.sendKeys("MYGE-597");
        WebElement txtpassword = driver.findElement(password);
        txtpassword.sendKeys("india@2022");
        Thread.sleep(3000);
        driver.findElement(loginbutton).click();
        Thread.sleep(3000);
        driver.findElement(OK).click();
    }
}
