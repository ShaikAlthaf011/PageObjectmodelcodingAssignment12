package MyProjectPageTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewsPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="#sectionMyProjectsHome > div > div:nth-child(5) > img:nth-child(2)")
    public WebElement NewsPaper;
    @FindBy(css="p[class='news-category']")
    public WebElement NewsHeading;
    @FindBy(css="#sectionNews > div > div > h1")
    public WebElement Bigheading;
    @FindBy(css="#sectionNews > div > div > p.news-description")
    public WebElement paragraph;
    @FindBy(css="#sectionNews > div > div > button.news-button")
    public WebElement readmore;
    @FindBy(css="#sectionNews > div > div > button.btn.btn-primary")
    public WebElement Back;
    @FindBy(css="#sectionMyProjectsHome > div > img")
    public WebElement image;
    public NewsPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
public void paper(){
        NewsPaper.click();
}
public String textnewsheading(){
        return NewsHeading.getText();
}
public String Trheading(){
        return Bigheading.getText();
}
public String GetParahraph(){
        return paragraph.getText();
}
public String getmore(){
        return readmore.getText();
}
public void buttonback(){
        Back.click();
}
public boolean visib(){
        return image.isDisplayed();
}
}
