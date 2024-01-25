package RotingPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import RoutingPageTest1.HomePage;
import org.testng.annotations.Test;

public class HomePageTest {
    WebDriver driver;
    WebDriverWait wait;
    HomePage homePage;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qaroutingtest.ccbp.tech/");
        homePage=new HomePage(driver);
    }
    @Test(priority = 1)
    public void HomePageUI(){
        Assert.assertTrue(homePage.imagevisibile(),"Home image is not displayed");
        Assert.assertEquals(homePage.Homeheading(),"Home","Heading text does not match");
    }
    @AfterMethod
    public void CloseBrowser(){
       // driver.quit();
    }
}
