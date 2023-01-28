package com.qa.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//page factory model
//a[@name ="username"]
//driver.fielement.by.xpath
      private  WebDriver driver;
    @FindBy(name = "username")
   public WebElement userName;
    @FindBy(xpath = "//input[contains(@name,'password')]")
   public WebElement passWord;
    @FindBy(xpath = "//button[contains(@class,'oxd-button oxd')]")
   public  WebElement loginBtn;
    @FindBy(xpath = "//p[text()='Forgot your password? ']")
    public WebElement forgotPassWordLink;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public DeshboardPage doLogin(String uName, String pwd ){
        userName.clear();
        userName.sendKeys(uName);
        passWord.clear();
        passWord.sendKeys(pwd);
        loginBtn.click();
        return new DeshboardPage(driver);
    }

//DeshboardPage deshboardPage = new DeshboardPage();



}
