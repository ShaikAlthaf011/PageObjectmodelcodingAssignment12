package MyProjectPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MyProjectPageTest1.DiwaliPage;

import java.lang.module.FindException;
import java.util.Arrays;

public class DiwaliPageTest {
    WebDriver driver;
    DiwaliPage diwaliPage;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qamyprojects.ccbp.tech/");
        diwaliPage=new DiwaliPage(driver);
    }
    @Test(priority=1)
    public void DiwaliPageUI() {
        diwaliPage.Diwali();
        Assert.assertEquals(diwaliPage.TextHeading(), "Celebrate Diwali with your friends", "Heading text does not match");
        Assert.assertTrue(diwaliPage.allimages(0),"Diwali item images are not displayed");
        String []str1={"Diwali Air Balloon", "Diwali - Lamp", "Sparklers", "Fire Cracker"};
        String []str2=new String[str1.length];
        for (int i = 0; i<diwaliPage.itemsdiwalinames(0); i++){
            Assert.assertEquals(diwaliPage.itemsdiwalinames(i),"Diwali item names and order does not match");
        }
        String[]str3={"Rs 369", "Rs 50", "Rs 150", "Rs 560"};
        String[]actualresult=new String[str3.length];
        for(int i=0;i< diwaliPage.pricelist(0);i++){
            Assert.assertEquals(diwaliPage.pricelist(i),"Diwali item prices and order does not match");
        }
}
@Test(priority = 2)
public void BackButton(){
    diwaliPage.Diwali();
    diwaliPage.sendback();
    String str5="https://qamyprojects.ccbp.tech/";
    String str6= driver.getCurrentUrl();
    if(str6.equals(str6)){
        Assert.assertTrue(diwaliPage.image(),"Back button not working as expected");
    }

}

    @AfterMethod
    public void CloseBrowser(){
        //driver.quit();
    }
}
