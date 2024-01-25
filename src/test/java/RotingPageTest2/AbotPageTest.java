package RotingPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import RoutingPageTest1.AboutPage;
import org.testng.annotations.Test;

public class AbotPageTest {
    WebDriver driver;
    WebDriverWait wait;
    AboutPage aboutPage;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qaroutingtest.ccbp.tech/");
        aboutPage=new AboutPage(driver);
    }
    @Test(priority=1)
    public void AboutPageui(){
    aboutPage.About();
    Assert.assertTrue(aboutPage.aboutimage(),"About image is not displayed");
    Assert.assertEquals(aboutPage.TextAbout(),"About","Heading text does not match");
    Assert.assertEquals(aboutPage.Paragraph(),"I love to create! I am a frontend web developer","Description text does not match");
    }
    @AfterMethod
    public void CloseBrowser(){
       // driver.quit();
    }
}
