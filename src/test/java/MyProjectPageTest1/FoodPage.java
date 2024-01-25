package MyProjectPageTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FoodPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="#sectionMyProjectsHome > div > div:nth-child(5) > img:nth-child(1)")
    public WebElement FoodPage;
    @FindBy(css="h1[class='order-card-heading']")
    public WebElement foodheading;
    @FindBy(css="#sectionFoodOrder > div > div > p")
    public WebElement paragraph;
    @FindBy(css="button[class*='order']")
    public WebElement BookNow;
    @FindBy(css="button[class*='btn']")
    public WebElement Backbutton;
    @FindBy(css="#sectionMyProjectsHome > div > img")
    public WebElement visibileimage;
    public FoodPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
   public void Food(){
        FoodPage.click();
   }
   public String Headingfood(){
        return foodheading.getText();
   }
public String Textparagraph(){
        return paragraph.getText();
}
public String booktext(){
        return BookNow.getText();
}
public void clickbackbutton(){
        Backbutton.click();
}
public boolean tr(){
        return visibileimage.isDisplayed();
}
}
