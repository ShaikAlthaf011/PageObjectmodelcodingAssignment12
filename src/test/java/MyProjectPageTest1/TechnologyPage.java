package MyProjectPageTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.ConstructorProperties;
import java.time.Duration;

public class TechnologyPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="div[class='d-flex flex-row justify-content-center']>img:nth-child(1)")
    @CacheLookup
    public WebElement Technologypage;
    @FindBy(css="h1[class='advanced-technologies-title']")
    @CacheLookup
    public WebElement Advancedheading;
    @FindBy(css="p[class='advanced-technologies-description']")
    @CacheLookup
    public WebElement Advanceddescription;
    @FindBy(css="button[class='advanced-technologies-learn-more-button']")
    @CacheLookup
    public WebElement learnmore;
    @FindBy(css="button[class='btn btn-primary']")
    @CacheLookup
    public WebElement back;
    @FindBy(css="#sectionMyProjectsHome > div > div:nth-child(4) > img:nth-child(1)")
    @CacheLookup
    public WebElement visibleimage;
    public TechnologyPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    public void ClickonTechnologypage(){
        Technologypage.click();
    }
    public String headingadvanced(){
        return Advancedheading.getText();
    }
    public String paragraphadvanced(){
        return Advanceddescription.getText();
    }
    public String Textlearnmore(){
        return learnmore.getText();
    }
    public void button(){
        back.click();
    }
    public boolean image(){
        return visibleimage.isDisplayed();
    }
}
