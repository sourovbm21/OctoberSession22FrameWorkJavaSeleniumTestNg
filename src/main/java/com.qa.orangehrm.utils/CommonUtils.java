package com.qa.orangehrm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtils {




    public WebDriver driver;
    public JavascriptExecutor js;


    public CommonUtils(WebDriver driver){
        this.driver =driver;
         js = (JavascriptExecutor)driver;
    }

    public void doSendKeys(By locator, String s){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(s);
    }
    public void moveToElement(By locator){
       WebElement element =  driver.findElement(locator);
       js.executeScript("arguments[0].scrollIntoView();",element);
    }




}
