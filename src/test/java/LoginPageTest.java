import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.DeshboardPage;
import com.qa.orangehrm.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {
        driver = driver_init();

    }


    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userName.sendKeys("Admin");
        loginPage.passWord.sendKeys("admin123");
        loginPage.loginBtn.click();
    }

    @Test
    public void validLoginTestOptimize() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userName.sendKeys(prop.getProperty("UserName"));
        loginPage.passWord.sendKeys(prop.getProperty("PassWord"));
        loginPage.loginBtn.click();
        DeshboardPage deshboardPage = new DeshboardPage(driver);
       // deshboardPage.successLoginMsg.isDisplayed();
        Assert.assertTrue(deshboardPage.successLoginMsg.isDisplayed());


    }

    @Test
    public void forgotPassWordLinkExistTest() {
        LoginPage loginPage = new LoginPage(driver);
        boolean b = loginPage.forgotPassWordLink.isDisplayed();
        Assert.assertTrue(b);

    }

    @Test
    public void pageTitleTest() {
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "OrangeHRM";
        System.out.println("Actual page title is : --> " + actualPageTitle);
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        //boolean b = actualPageTitle.equals(expectedPageTitle);
        // Assert.assertTrue(b);

    }


    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
