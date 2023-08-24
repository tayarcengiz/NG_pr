package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='icp-nav-flyout']")
    public WebElement HomepageDildegisimiconu;

    @FindBy(xpath= "(//i[@class='icp-radio icp-radio-active'])[1]")
    public WebElement HomepageDeutschiconu;

    @FindBy(css= "div#nav-flyout-icp a:nth-child(4) > span > i")//(//i[@class='a-icon a-icon-radio'])[2]
    public WebElement espaniolconu;




}