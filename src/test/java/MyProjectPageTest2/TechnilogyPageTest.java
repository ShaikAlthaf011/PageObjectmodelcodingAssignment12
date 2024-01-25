package MyProjectPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MyProjectPageTest1.TechnologyPage;

public class TechnilogyPageTest {
    WebDriver driver;
    TechnologyPage technologyPage;
    @BeforeMethod
    public void OPenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qamyprojects.ccbp.tech/");
        technologyPage=new TechnologyPage(driver);
    }
    @Test(priority=1)
    public void TechnologyPageui(){
    technologyPage.ClickonTechnologypage();
    Assert.assertEquals(technologyPage.headingadvanced(),"Advanced Technologies","Title text does not match");
    Assert.assertEquals(technologyPage.paragraphadvanced(),"Machinery and equipment developed from the application of scientific knowledge.","Description text does not match");
    Assert.assertEquals(technologyPage.Textlearnmore(),"Learn more","Button text does not match");
    }
    @Test(priority = 2)
    public void Backbutton(){
        technologyPage.ClickonTechnologypage();
        technologyPage.button();
        String str1="https://qamyprojects.ccbp.tech/";
        String str2=driver.getCurrentUrl();
        if(str2.equals(str1)){
            Assert.assertTrue(technologyPage.image(),"Back button not working as expected");
        }
    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }
}
