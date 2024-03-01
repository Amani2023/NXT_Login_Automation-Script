package services;

import configs.Config;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.LoginPage;

public class LoginService {
    private WebDriver driver;
    private String driverPath="com.blackstone.web\\resources\\driver\\chromedriver.exe";
    private LoginPage loginPage;
    private Config config;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver=new ChromeDriver();
        loginPage=new LoginPage();
        config=new Config();
    }
    @Test
    public void loginService() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) driver;
        config.getBASE_URL();
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.findElement(loginPage.getLoginEmail()).sendKeys("nxttester");
        driver.findElement(loginPage.getLoginPassword()).sendKeys("nxt#qA@23");
        driver.findElement(loginPage.getLoginButton()).click();
        driver.findElement(loginPage.getskipLink()).click();
        Thread.sleep(2000);
        String actualHomeTitle= driver.getTitle();
        String expectedHomeTitle="Dashboard";
        Assert.assertEquals(actualHomeTitle,expectedHomeTitle);

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
