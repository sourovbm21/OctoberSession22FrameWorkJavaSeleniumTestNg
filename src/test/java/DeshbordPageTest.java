import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.DeshboardPage;
import com.qa.orangehrm.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


public class DeshbordPageTest extends TestBase {


    public WebDriver driver;


    @BeforeMethod
    public void setUp() throws IOException {
//    TestBase tb = new TestBase();
//    tb.driver_init();
        driver = driver_init();
        LoginPage loginPage = new LoginPage(driver);
        //loginPage.userName.sendKeys(prop.getProperty("UserName"));
//        loginPage.passWord.sendKeys(prop.getProperty("PassWord"));
//        loginPage.loginBtn.click();
        //loginPage.doLogin("Admin","adimn123");
       //deshboardPage = new DeshboardPage(driver);
        loginPage.doLogin(prop.getProperty("UserName"),prop.getProperty("PassWord"));

    }


    @Test
    public void test1() throws InterruptedException {
        DeshboardPage deshboardPage = new DeshboardPage(driver);
        Thread.sleep(2000l);
        String actualAccountTag = deshboardPage.myActionsTag.getText();
        System.out.println(actualAccountTag);
        Assert.assertEquals(actualAccountTag, "My Actions");
    }


    @Test
    public  void tearDown(){
        driver.quit();
    }


}
