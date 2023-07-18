package com.qa.orangehrm.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class CommonUtils {




    public WebDriver driver;
    public JavascriptExecutor js;
    public Actions actions;


    public CommonUtils(WebDriver driver){
        this.driver =driver;
         js = (JavascriptExecutor)driver;
       actions = new Actions(driver);
    }

    public void doSendKeys(By locator, String s){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(s);
    }
    public void doSendKeysUsingFindBy(WebElement element, String s){
        element.clear();
        element.sendKeys(s);
    }
    public void moveToElement(By locator){
       WebElement element =  driver.findElement(locator);
       js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public void doKeyDown(int a){
        for (int i=0;i<a;i++){
            actions.keyDown(Keys.DOWN).perform();
        }
        actions.keyDown(Keys.TAB).perform();
    }




}
