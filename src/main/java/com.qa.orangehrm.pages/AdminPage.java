package com.qa.orangehrm.pages;

import com.qa.orangehrm.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {


    private WebDriver driver;
    public CommonUtils commonUtils;
    public WebDriverWait wait;

    By userName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By employeeName = By.cssSelector("input[placeholder='Type for hints...']");

    By adminPageAddBtn = By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--secondary:nth-child(1)");
    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']//div//i[1]")
    public WebElement userRole;


    @FindBy(xpath = "//div[@role='listbox']//div[1]")
    public WebElement employeeNameList;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    public WebElement staTus;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passWord;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement confirmPassWord;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[text()=' Search ']")
    public WebElement searchButton;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    public WebElement deleteButton;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash oxd-button-icon']")
    public WebElement acceptDeleteMsg;
    @FindBy(xpath = "//button[text()=' Reset ']")
    public WebElement resetButton;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        commonUtils = new CommonUtils(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        PageFactory.initElements(driver,this);

    }

    public void userNameEditBox(String name) {
        // CommonUtils commonUtils = new CommonUtils(driver);
        commonUtils.doSendKeys(userName, name);
//        driver.findElement(userName).clear();
//        driver.findElement(userName).sendKeys(name);

    }

    public void employeeNameEditBox(String name) {
        commonUtils.doSendKeys(employeeName, name);
    }

    public void clickAddBtn() {

        driver.findElement(adminPageAddBtn).click();
    }


}
