import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.AdminPage;
import com.qa.orangehrm.pages.DeshboardPage;
import com.qa.orangehrm.pages.LoginPage;
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
    public void test01(){


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
