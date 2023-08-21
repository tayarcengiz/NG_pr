package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath="//*[@id='login-email']")
    public WebElement kullaniciEmailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu1;

    @FindBy(xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginButonu;

    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement Cookies;

    @FindBy(xpath = "//button[text()='Login']")
   public WebElement Loginkutusu;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCoursesLinki;

    @FindBy(xpath = "(//img[@class='img-fluid'])[33]")
    public WebElement freestepsyazmakursu;

    @FindBy(xpath = "//i[@class='fas fa-shopping-cart']")
    public WebElement shoppingkartsepeti;
    @FindBy(xpath = "//a[@href='https://www.qualitydemy.com/home/course/steps-yazma/62']")
    public WebElement freestepyazmakursukutusu;

    @FindBy(xpath = "//button[@class='btn btn-buy-now']")
    public WebElement sepeteeklemekutusu;

    @FindBy(xpath = "//div[@onclick='removeFromCartList(this)']")
    public  WebElement kursremovebutonu;

    @FindBy(xpath = "//div[text()='0 Courses in cart']")
    public WebElement mevcutkurssayisiyazisi;
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement ilkLoginLinkiCE;

    @FindBy(id="login-email")
    public WebElement kullaniciEmailKutusuCE;

    @FindBy(id="login-password")
    public WebElement passwordKutusuCE;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonuCE;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCoursesLinkiCE;



    @FindBy(xpath = "//button[text()='Login']")
    public WebElement LoginkutusuCE;



    @FindBy(xpath = "(//img[@class='img-fluid'])[33]")
    public WebElement freestepsyazmakursuCE;

    @FindBy(xpath = "//i[@class='fas fa-shopping-cart']")
    public WebElement shoppingkartsepetiCE;
    @FindBy(xpath = "//a[@href='https://www.qualitydemy.com/home/course/steps-yazma/62']")
    public WebElement freestepyazmakursukutusuCE;

    @FindBy(xpath = "//button[@class='btn btn-buy-now']")
    public WebElement sepeteeklemekutusuCE;

    @FindBy(xpath = "//div[@onclick='removeFromCartList(this)']")
    public  WebElement kursremovebutonuCE;

    @FindBy(xpath = "//div[text()='0 Courses in cart']")
    public WebElement mevcutkurssayisiyazisiCE;

    @FindBy(xpath = "(//img[@*='img-fluid'])[3]")
    public WebElement englishkurs255dolarCE;

    @FindBy(xpath = "//div[text()='$127.5']")
    public WebElement sepettekitoplamfiyatindirimliCE ;

    @FindBy(xpath = "//div[@class='total-price']")
    public WebElement sepettekitoplamfiyatindirimsizCE ;

    @FindBy(xpath = "//input[@name='query']")
    public WebElement qdaramamotoruCE;

    @FindBy(xpath = "//input[@id='coupon-code']")
    public  WebElement indirimkuponukutusuCE;

    @FindBy(xpath = "//button[@onclick='applyCoupon()']")
    public WebElement ApplyindirimuygulabutonuCE;

    @FindBy(xpath = "//div[@class='current-price']")
    public  WebElement englishkursunormalfiyatiCE;

    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkoutkutusuCE;

    @FindBy(xpath = "//img[@class='payment-gateway-icon']")
    public WebElement paymentkutusuCE;

    @FindBy(xpath = "//a[text()='Instructor']")
    public  WebElement instructorkutusuCE;

    @FindBy(xpath = "//span[text()='Course manager']")
    public WebElement coursemanagerkutusuCE;

    @FindBy(xpath = "//textarea[@name='message']")
    public  WebElement mesajkutusuCE;

    @FindBy(xpath = "//span[text()='Message']")
    public  WebElement mesajbuttonu;

    @FindBy(xpath = "//button[@id='NewMessage']")
    public WebElement composekutusuCE;

    @FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
    public  WebElement odemebuttonuCE;

    @FindBy(xpath = "//button[text()='Pay with stripe']")
    public  WebElement paywithbuttonuCE;

    @FindBy(xpath = "//span[text()='Categories']")
    public WebElement categoriobuttonuCE;

    @FindBy(xpath = "//span[text()='Web Design Course']")
    public WebElement webdesingkursukategorisiCE;

    @FindBy(xpath = "(//img[@class='img-fluid'])[4]")
    public WebElement wordpresskursufreeCE;

    @FindBy(xpath = "//button[text()='Added to Cart']")
    public WebElement addedtocardbuttonuCE;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    public  WebElement addtocardbuttonuCE;

    @FindBy(xpath = "//a[text()='My courses']")
    public WebElement mycourseCE;

    @FindBy(xpath = "//a[@id='edit_rating_btn_3']")
    public WebElement editratingbuttonEnglishkursCE;

    @FindBy(xpath = "//a[@id='edit_rating_btn_10']")
    public WebElement editratingbutton10CE;

    @FindBy(xpath = "//select[@id='searchDropdownBox']\"")
    public WebElement englishkursuratingboxCE;

    @FindBy(xpath = "(//textarea[@name='review'])[3]")
    public WebElement englishkursuratingtextareaCE;

    @FindBy(xpath = "(//button[text()='Publish rating'])[3]")
    public WebElement englishkurspublishratingbuttonuCE;

    @FindBy(xpath = "//div[text()='$165']")
    public WebElement magickursuindirimlfiyati;

    @FindBy(xpath = "//span[text()='All courses']")
     public WebElement CategoriesAllkurses;

    @FindBy(xpath = "//a[text()='2']")
     public WebElement kursayfalari2incisayfa;











}
