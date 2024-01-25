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

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
  @FindBy(css="img[class='logo']")
  @CacheLookup
  public WebElement logo;
  @FindBy(css="h1[class='home-heading']")
  @CacheLookup
  public WebElement HomText;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
   public boolean imagevisibile(){
        wait.until(ExpectedConditions.visibilityOf(logo));
        return logo.isDisplayed();
   }
 public String Homeheading(){
        return HomText.getText();
 }
}
