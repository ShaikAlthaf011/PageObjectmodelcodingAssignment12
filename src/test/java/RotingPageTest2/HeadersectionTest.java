package RotingPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import RoutingPageTest1.Headersection;

public class HeadersectionTest {
    WebDriver driver;
    Headersection headersection;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qaroutingtest.ccbp.tech/");
        driver.manage().window().maximize();
        headersection=new Headersection(driver);

    }
    @Test(priority = 1)
    public void HeadersectionUi(){
    headersection.logo();
    Assert.assertEquals(headersection.titletext(),"Wave","Title text does not match");
    }
    @Test(priority=2)
    public void Navbaraboutlink(){
        headersection.About();
        Assert.assertEquals(headersection.verifyabouturl(),driver.getCurrentUrl(),"URLs do not match");
    }
    @Test(priority = 3)
    public void NavbarContactlink(){
        headersection.Contact();
        Assert.assertEquals(headersection.Verifycontactirl(),driver.getCurrentUrl(),"URLs do not match");
    }
    @Test(priority = 4)
    public void NavbarHomelink(){
        headersection.About();
        headersection.Home();
        String str5="https://qaroutingtest.ccbp.tech/";
        String str6= driver.getCurrentUrl();
        Assert.assertEquals(str5,str6,"URLs do not match");
    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }
}
