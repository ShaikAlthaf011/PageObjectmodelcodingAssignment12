package MyProjectPageTest2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
@Test
        public void setup(){
    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();
      // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Watches");
        WebElement l=driver.findElement(By.xpath("//div[contains(text(),'Samsung Galaxy S21 FE 5G with Snapdragon 888 (Lavender, 256 GB)')]"));
    }
}
