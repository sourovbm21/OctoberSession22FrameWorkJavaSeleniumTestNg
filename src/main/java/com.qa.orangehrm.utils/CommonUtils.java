package com.qa.orangehrm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtils {




    public WebDriver driver;


    public CommonUtils(WebDriver driver){
        this.driver =driver;
    }

    public void doSendKeys(By locator, String s){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(s);
    }



}
