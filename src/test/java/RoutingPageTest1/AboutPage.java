package RoutingPageTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ValueRange;

public class AboutPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="ul[class='nav-items-list']>li:nth-child(2)")
    @CacheLookup
    public WebElement aboutlink;
    @FindBy(css="img[class='about-img']")
    @CacheLookup
    public WebElement Vefifyimageabout;
    @FindBy(css="h1[class='about-heading']")
    @CacheLookup
    public WebElement Headingabout;
   @FindBy(css="p[class='about-paragraph']")
   public WebElement PagraphText;
    public AboutPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
    public void About(){
        aboutlink.click();
    }
    public boolean aboutimage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[class='about-img']")));
        return Vefifyimageabout.isDisplayed();
    }
    public String TextAbout(){
        return Headingabout.getText();
    }
    public String Paragraph(){
        return PagraphText.getText();
    }
}
