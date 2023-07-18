import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.AdminPage;
import com.qa.orangehrm.pages.DeshboardPage;
import com.qa.orangehrm.pages.LoginPage;
import com.qa.orangehrm.utils.CommonUtils;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AdminPageTest extends TestBase {






    @BeforeMethod
    public void setUp() throws IOException {
        driver = driver_init();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin(prop.getProperty("UserName"),prop.getProperty("PassWord"));
        DeshboardPage deshboardPage = new DeshboardPage(driver);
        deshboardPage.adminBtn.click();
    }


    @Test
    public void validAddUserTest() throws InterruptedException {
        AdminPage adminPage = new AdminPage(driver);
        CommonUtils commonUtils = new CommonUtils(driver);
        Actions action = new Actions(driver);
        Thread.sleep(2000l);
        adminPage.addButton.click();
        Thread.sleep(2000l);
        adminPage.userRole.click();
        commonUtils.doKeyDown(1);
        Thread.sleep(2000l);
        action.sendKeys("O").perform();
        Thread.sleep(3000l);
        adminPage.employeeNameList.click();
        Thread.sleep(2000l);
        adminPage.staTus.click();
        Thread.sleep(2000l);
        commonUtils.doKeyDown(1);
        Thread.sleep(3000l);
        action.sendKeys("branding123").perform();
        Thread.sleep(3000l);
        adminPage.passWord.sendKeys("Shahana123!");
        Thread.sleep(3000l);
        adminPage.confirmPassWord.sendKeys("Shahana123!");
        Thread.sleep(2000l);
        adminPage.saveButton.click();
    }
    @Test
    public void test01(){
        AdminPage adminPage = new AdminPage(driver);
        adminPage.userNameEditBox("Sahana");
        adminPage.employeeNameEditBox("Microsoft");

    }

    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.quit();
    }




}
