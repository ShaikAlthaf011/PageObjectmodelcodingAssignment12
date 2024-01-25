package RoutingPageTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Headersection {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="img[class='logo']")
    @CacheLookup
    public WebElement Verifyvisibileimage;
    @FindBy(css="h1[class='title']")
    @CacheLookup
    public WebElement title;
    @FindBy(css="ul[class='nav-items-list']>li:nth-child(2)")
    @CacheLookup
    public WebElement aboutlink;
    @FindBy(css="ul[class='nav-items-list']>li:nth-child(3)")
    @CacheLookup
    public WebElement contactlink;
    @FindBy(css="ul[class='nav-items-list']>li:nth-child(1)")
    @CacheLookup
    public WebElement Homelink;

    public Headersection(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
public boolean logo(){
        return  Verifyvisibileimage.isDisplayed();
}
public String titletext(){
        return title.getText();
}
public void About(){
        aboutlink.click();
}
public String verifyabouturl(){
        String str1="https://qaroutingtest.ccbp.tech/about";
        wait.until(ExpectedConditions.urlToBe(str1));
        return str1;
}
public void Contact(){
        contactlink.click();
}
public String Verifycontactirl(){
        String str2="https://qaroutingtest.ccbp.tech/contact";
        wait.until(ExpectedConditions.urlToBe(str2));
        return str2;
}
public void Home(){
        Homelink.click();
}
}
