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

public class ContactPage {
    WebDriver driver;
    WebDriverWait wait;
   @FindBy(css="ul[class='nav-items-list']>li:nth-child(3)")
   @CacheLookup
   public WebElement Contact;
   @FindBy(css="div[class='contact-container']>img")
   @CacheLookup
   public WebElement contactvisbileimage;
   @FindBy(css="h1[class='contact-heading']")
   @CacheLookup
   public WebElement ContactText;
    public ContactPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
    public void clickcontactlink(){
        Contact.click();
    }
    public boolean contactimage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='contact-container']>img")));
        return contactvisbileimage.isDisplayed();
    }
    public String getcontact(){
        return ContactText.getText();
    }
}
