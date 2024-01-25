package MyProjectPageTest2;

import org.checkerframework.checker.guieffect.qual.SafeType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MyProjectPageTest1.HomePage;

public class HomePageTest {
    WebDriver driver;
    HomePage homePage;
    @BeforeMethod
    public void OpenBrowser(){
    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
    driver=new ChromeDriver();
    driver.navigate().to("https://qamyprojects.ccbp.tech/");
    homePage=new HomePage(driver);
    }
    @Test()
    public void HomePageUI(){
        Assert.assertTrue(homePage.image(),"Software developer image is not displayed");
        Assert.assertEquals(homePage.Headingmyproject(),"My Projects","Heading text does not match");
       Assert.assertEquals(homePage.Paragraph(),"These are a few of my Static Website projects that I have developed using HTML, CSS and Bootstrap","Description text does not match");
    }
@AfterMethod
    public void CloseBrowser(){
       // driver.quit();
}
}
