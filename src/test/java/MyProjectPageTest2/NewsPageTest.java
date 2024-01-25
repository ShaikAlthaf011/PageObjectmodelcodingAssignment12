package MyProjectPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MyProjectPageTest1.NewsPage;

public class NewsPageTest {
    WebDriver driver;
    NewsPage newsPage;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qamyprojects.ccbp.tech/");
        newsPage=new NewsPage(driver);
    }
    @Test(priority=1)
    public void NewsPageUI(){
    newsPage.paper();
    Assert.assertEquals(newsPage.textnewsheading(),"NEWS OF THE DAY","Category text does not match");
    Assert.assertEquals(newsPage.Trheading(),"All educational institutions in Assam to reopen from November 2","Title text does not match");
    Assert.assertEquals(newsPage.GetParahraph(),"Uttar Pradesh's Gautam Buddh Nagar recorded 107 new Covid-19 cases on Saturday, pushing the district's infection tally to 15,803, official data showed. The number of active cases came down further to 1,384 from 1,477 on Friday and 1,523 on Thursday, according to the data released by the UP Health Department for a 24-hour period.","Description text does not match");
    Assert.assertEquals(newsPage.getmore(),"Read more","Button text does not match");
    }
    @Test(priority = 2)
    public void BackButton(){
        newsPage.paper();
        newsPage.buttonback();
        String str1="https://qamyprojects.ccbp.tech/";
        String str2=driver.getCurrentUrl();
        if(str1.equals(str2)){
            Assert.assertTrue(newsPage.visib(),"Back button not working as expected");
        }
    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }
}
