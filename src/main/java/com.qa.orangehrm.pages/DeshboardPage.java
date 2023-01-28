package com.qa.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeshboardPage {

   private WebDriver driver;

    @FindBy(xpath = "//p[text()='Paul Collings']")
   public WebElement successLoginMsg;
    @FindBy(xpath = "//p[text()='My Actions']")
    public WebElement myActionsTag;
    @FindBy(xpath = "//span[text()='Admin']")
    public WebElement adminBtn;



    public DeshboardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }




}
