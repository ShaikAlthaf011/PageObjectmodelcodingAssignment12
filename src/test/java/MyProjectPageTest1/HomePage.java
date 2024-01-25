package MyProjectPageTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="img[class='software-developer-image']")
    @CacheLookup
    public WebElement softwareimage;
    @FindBy(css="h1[class='my-projects-heading']")
    @CacheLookup
    public WebElement Verifymyproject;
    @FindBy(css="p[class='my-projects-description']")
    @CacheLookup
    public WebElement VerifyParagraph;
    public HomePage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
    public boolean image(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[class='software-developer-image']")));
        return softwareimage.isDisplayed();
    }
    public String Headingmyproject(){
        return Verifymyproject.getText();
    }
    public String Paragraph(){
        return VerifyParagraph.getText();
    }
}
