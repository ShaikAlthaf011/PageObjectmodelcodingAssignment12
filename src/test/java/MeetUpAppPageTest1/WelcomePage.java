package MeetUpAppPageTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomePage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="#root > img")
    public WebElement visibileimage;
    @FindBy(css="h1[class*='WelcomeHeading']")
    public WebElement VerifyHeading;
    @FindBy(css="#root > div > div > div > p")
    public WebElement verifydescription;
    @FindBy(css="#root > div > div > img")
    public WebElement allimage;
    @FindBy(css="#registerButton")
    public WebElement Veifyclickon;
    public WelcomePage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
    public boolean image(){
        return visibileimage.isDisplayed();
    }
    public String heading(){
        return VerifyHeading.getText();
    }
    public String paragraph(){
        return verifydescription.getText();
    }
    public boolean image1(){
        return allimage.isDisplayed();
    }
    public void Click(){
        Veifyclickon.click();
    }
}
