package MyProjectPageTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DiwaliPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="#sectionMyProjectsHome > div > div:nth-child(4) > img:nth-child(2)")
    @CacheLookup
    public WebElement diwali;
    @FindBy(css="h1[class*='diwali-top']")
    @CacheLookup
    public WebElement Heading;
    @FindBy(css="div[class='diwali-bottom-section']>div>div>img")
    @CacheLookup
    public List<WebElement> list;
    @FindBy(css="h1[class='diwali-card-name']")
    @CacheLookup
    public List<WebElement> diwaliitems;
    @FindBy(css="p[class='diwali-card-price']")
    public List<WebElement> price;
    @FindBy(css="button[class*='btn']")
    public WebElement Backbutton;
    @FindBy(css="#sectionMyProjectsHome > div > img")
    public WebElement visbileimage;
    public DiwaliPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
     public void Diwali(){
        diwali.click();
     }
     public String TextHeading(){
        return Heading.getText();
     }
     public boolean allimages(int index){
        return list.get(index).isDisplayed();
     }
     public int itemsdiwalinames(int index){
         diwaliitems.get(index).getSize();
         return 0;
     }
     public int pricelist(int index){
        price.get(index).getSize();
        return 0;
     }
     public void sendback(){
        Backbutton.click();
     }
     public boolean image(){
        return visbileimage.isDisplayed();
     }
}
