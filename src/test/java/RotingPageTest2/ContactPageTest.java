package RotingPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import RoutingPageTest1.ContactPage;

public class ContactPageTest {
    WebDriver driver;
    WebDriverWait wait;
    ContactPage contactPage;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qaroutingtest.ccbp.tech/");
        driver.manage().window().maximize();
        contactPage=new ContactPage(driver);
    }
    @Test(priority=1)
    public void ContactPageui(){
        contactPage.clickcontactlink();
        Assert.assertTrue(contactPage.contactimage(),"Contact image is not displayed");
       Assert.assertEquals(contactPage.getcontact(),"Contact","Heading text does not match");
    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }
}
