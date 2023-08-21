package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroWebAppPage {
    public ZeroWebAppPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(id="signin_button")
  public WebElement signinButon;

   @FindBy(id="user_login")
   public WebElement usernamekutusu;

    @FindBy(id="user_password")
    public WebElement passportkutusu;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement siginsubmitbutonu;




}