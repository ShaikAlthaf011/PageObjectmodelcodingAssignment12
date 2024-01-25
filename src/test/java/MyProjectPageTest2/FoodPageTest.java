package MyProjectPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MyProjectPageTest1.FoodPage;

import java.time.Duration;

public class FoodPageTest {
    WebDriver driver;
    FoodPage foodPage;

    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qamyprojects.ccbp.tech/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        foodPage=new FoodPage(driver);
    }
    @Test(priority=1)
    public void FoodPageUI(){
    foodPage.Food();
    Assert.assertEquals(foodPage.Headingfood(),"Happy Meals","Title text does not match");
    Assert.assertEquals(foodPage.Textparagraph(),"Discover the best foods over the 1,000 restaurants","Description text does not match");
    Assert.assertEquals(foodPage.booktext(),"Book Now","Button text does not match");
    }
    @Test(priority=2)
    public void BackButton(){
        foodPage.Food();
        foodPage.clickbackbutton();
        String str1="https://qamyprojects.ccbp.tech/";
        String str2=driver.getCurrentUrl();
        if(str1.equals(str2)){
            Assert.assertTrue(foodPage.tr(),"Back button not working as expected");
        }
    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }
}
