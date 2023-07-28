package com.qa.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {


   public  WebDriver driver;
   public Properties prop;
   public  FileInputStream fis;


   public WebDriver driver_init() throws IOException {

        prop = new Properties();
        fis = new FileInputStream("/Users/tohidur/IdeaProjects/OctoberSession22Framwork/src/main/java/con/qa/orangehrm/config/config.properties");

           prop.load(fis);
           ///prop.getProperty("BrowserName");
           ///prop.getProperty("Url");


       //String browser_Name ="chrome";//j
       String browser_Name = prop.getProperty("BrowserName");

       if (browser_Name.equalsIgnoreCase("Chrome")){
           ///Users/tohidur/Downloads/chromedriver-mac-x64
           System.setProperty("webdriver.chrome.driver","/Users/tohidur/Downloads/chromedriver-mac-x64/chromedriver");
           ChromeOptions co = new ChromeOptions()   ;
           co.setBinary("/Users/tohidur/Downloads/chrome-mac-x64/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
            driver = new ChromeDriver(co);
       } else if (browser_Name.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
       } else if (browser_Name.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
       } else if (browser_Name.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
       } else{
           System.out.println("please provide current browser name");
       }
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       driver.get(prop.getProperty("Url"));
       return driver;




   }

    public static void main(String[] args) throws IOException {


        TestBase f = new TestBase();
        f.driver_init();

        //Webtable
        //Calender
        //Data parameterization
        //Task( 2D,3D array )

    }


}
