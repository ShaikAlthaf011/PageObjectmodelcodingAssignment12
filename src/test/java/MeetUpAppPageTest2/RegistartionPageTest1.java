package MeetUpAppPageTest2;

import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import MeetUpAppPageTest1.RegistrationPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistartionPageTest1 extends RegistartionPageTest{
    WebDriver driver;
    RegistrationPage registrationPage;
    public Object[][]Dataset={
            {"Jack","Arts and Culture"},
            {"Jerry","Career and Business"},
            {"John","Education and Learning"},
            {"Jim","Fashion and Learning"},
            {"Jane","Games"},

    };
    @DataProvider
    public Object[][] AddList(){
        return Dataset;
    }
    @Test(priority=1)
    public void RegistartionPage(){
        driver=new ChromeDriver();
        driver.get("https://qameetup.ccbp.tech/");
        registrationPage=new RegistrationPage(driver);
        registrationPage.Clickonregister();
        Assert.assertTrue(registrationPage.visibileimg(),"App logo is not displayed");
        Assert.assertTrue(registrationPage.logoregister(),"Register image is not displayed");
        Assert.assertEquals(registrationPage.Heading(),"Let us join","Heading text does not match");
        Assert.assertEquals(registrationPage.NameLabel(),"NAME","Name label text does not match");
        Assert.assertEquals(registrationPage.TopicsLabel(),"TOPICS","Topics label text does not match");
    }
    @Test(priority=2)
    public void RegistrationPageEmptyInput(){
        driver=new ChromeDriver();
        driver.get("https://qameetup.ccbp.tech/");
        registrationPage=new RegistrationPage(driver);
        registrationPage.Clickonregister();
        registrationPage.RegisterNow();
        Assert.assertEquals(registrationPage.Error(),"Please enter your name","Error text with empty input field does not match");
    }
    @Test(priority=3,dataProvider = "AddList")
    public void RegistrationPageValidInput(String Name,String Text){
        driver=new ChromeDriver();
        driver.get("https://qameetup.ccbp.tech/");
        registrationPage=new RegistrationPage(driver);
        registrationPage.Clickonregister();
        registrationPage.Enetername(Name);
        registrationPage.Enterselect(Text);
        registrationPage.RegisterNow();
        String str1="https://qameetup.ccbp.tech/";
        String str2= driver.getCurrentUrl();
        Assert.assertEquals(str1,str2,"URLs do not match");
            }

}
