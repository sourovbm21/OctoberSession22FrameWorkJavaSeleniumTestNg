package com.qa.orangehrm.pages;

import com.qa.orangehrm.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {


    private WebDriver driver;
    public CommonUtils commonUtils;

    By userName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By employeeName = By.cssSelector("input[placeholder='Type for hints...']");

    By userSName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By userAName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By userTName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By userNName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By userOName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");


    public AdminPage(WebDriver driver){
        this.driver = driver;
        commonUtils = new CommonUtils(driver);
    }

    public void userNameEditBox(String name){
       // CommonUtils commonUtils = new CommonUtils(driver);
        commonUtils.doSendKeys(userName,name);
//        driver.findElement(userName).clear();
//        driver.findElement(userName).sendKeys(name);

    }
    public void employeeNameEditBox(String name){
        commonUtils.doSendKeys(employeeName,name);
    }




}
