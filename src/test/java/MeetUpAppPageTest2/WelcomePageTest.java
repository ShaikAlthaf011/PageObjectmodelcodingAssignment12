package MeetUpAppPageTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WelcomePageTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");

    }
    @AfterMethod
    public void CloseBrowser(){
       // driver.quit();
    }
}
