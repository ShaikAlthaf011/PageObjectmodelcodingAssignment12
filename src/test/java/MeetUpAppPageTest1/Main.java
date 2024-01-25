package MeetUpAppPageTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {
    @Test(priority =1 )
    public  void open_brower(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com");
        driver.manage().window().maximize();

    }
    @Test(priority = 2)
    public void seond_browser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com");
        driver.manage().window().maximize();
    }

}
