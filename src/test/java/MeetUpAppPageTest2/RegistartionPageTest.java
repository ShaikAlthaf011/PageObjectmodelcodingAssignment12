package MeetUpAppPageTest2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class RegistartionPageTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }
}
