import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Joobyapp {
    //rahul
    //rahul@2021
    @Test
        public void Openbrowser () {
            System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://qajobbyapp.ccbp.tech/login");
            driver.manage().window().maximize();
            WebElement l1= driver.findElement(By.xpath("//input[@id='userNameInput']"));
            l1.sendKeys("rahul");
            WebElement l2= driver.findElement(By.xpath("//input[@id='passwordInput']"));
            l2.sendKeys("rahul@2021");
            WebElement l3= driver.findElement(By.xpath("//button[@class='login-button']"));
            l3.click();

        }
    }


