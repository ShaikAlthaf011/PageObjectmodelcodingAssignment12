package MeetUpAppPageTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="#registerButton")
    public WebElement Register;
    @FindBy(css="#root > img")
    public WebElement Visibilelogo;
    @FindBy(css="#root > div > div > div.RegisterImageContainer-sc-sr3jcr-2.iGDhry > img")
    public WebElement  Registelogo;
    @FindBy(css="#root > div > div > div.LetUsJoinContainer-sc-sr3jcr-4.JEiRX > h1")
    public WebElement HeadingRegister;
    @FindBy(css="#root > div > div > div.LetUsJoinContainer-sc-sr3jcr-4.JEiRX > form > div:nth-child(1) > label")
    public WebElement LabelName;
    @FindBy(css="#root > div > div > div.LetUsJoinContainer-sc-sr3jcr-4.JEiRX > form > div:nth-child(2) > label")
    public WebElement LabelTopics;
    @FindBy(css="#root > div > div > div.LetUsJoinContainer-sc-sr3jcr-4.JEiRX > form > button")
    public WebElement register;
    @FindBy(css="#root > div > div > div.LetUsJoinContainer-sc-sr3jcr-4.JEiRX > form > p")
    public WebElement errormessage;
    @FindBy(css="#name")
    public WebElement name;
    @FindBy(css="Select[id='topic']")
    public WebElement select;
    @FindBy(css="#root > div > div > div > h1")
    public WebElement Heading;
    @FindBy(css="#root > div > div > div > p")
    public WebElement paragraph;
    public RegistrationPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
public void Clickonregister(){
        Register.click();
}
public boolean visibileimg(){
        return Visibilelogo.isDisplayed();
}
public boolean logoregister(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div > div > div.RegisterImageContainer-sc-sr3jcr-2.iGDhry > img")));
        return Registelogo.isDisplayed();
}
public String Heading(){
        return HeadingRegister.getText();
}
public String NameLabel(){
        return LabelName.getText();
}
public String TopicsLabel(){
        return LabelTopics.getText();
}
public void RegisterNow(){
        register.click();
}
public String Error(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div > div > div.LetUsJoinContainer-sc-sr3jcr-4.JEiRX > form > p")));
        return errormessage.getText();
}
public void Enetername(String Name){
     name.sendKeys(Name);
}
public void Enterselect(String Text){
        select.sendKeys(Text);
}
public String HelloJack(){
        return Heading.getText();
}
public String text(){
        return paragraph.getText();
}
}
