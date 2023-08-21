package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KiwiPage {

    public KiwiPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[text()='Kabul et']")
    public WebElement kiwicookies;

    @FindBy(xpath = "//button[@data-test='RegionalSettingsButton']")
    public WebElement langhwichbutton;

    @FindBy(xpath = "//option[text()='Türkçe']")
    public WebElement turkishwahlbutton;

    @FindBy(xpath = "//select[@data-test='LanguageSelect']")
    public WebElement langwichselectionreinbutton;



    
}
