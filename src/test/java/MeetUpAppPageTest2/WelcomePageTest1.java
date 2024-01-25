package MeetUpAppPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import MeetUpAppPageTest1.WelcomePage;

public class WelcomePageTest1 extends WelcomePageTest{
    WebDriver driver;
    WelcomePage welcomePage;

    @Test(priority=1)
    public void Welcomepage(){
      driver=new ChromeDriver();
      driver.navigate().to("https://qameetup.ccbp.tech/");
      welcomePage=new WelcomePage(driver);
        Assert.assertTrue(welcomePage.image(),"App logo is not displayed");
        Assert.assertEquals(welcomePage.heading(),"Welcome to Meetup","Heading text does not match");
       Assert.assertEquals(welcomePage.paragraph(),"Please register for the topic","Description text does not match");
       Assert.assertTrue(welcomePage.image1(),"Meetup image is not displayed");
    }
    @Test(priority=2)
    public void FuncationalityPage(){
        driver=new ChromeDriver();
        driver.navigate().to("https://qameetup.ccbp.tech/");
        welcomePage=new WelcomePage(driver);
        welcomePage.Click();
        String str1="https://qameetup.ccbp.tech/register";
        String str2= driver.getCurrentUrl();
        Assert.assertEquals(str1,str2,"URLs do not match");
    }
}
