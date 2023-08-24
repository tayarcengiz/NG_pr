package Propieren;

import Pages.AmazonPage;
import Pages.QualitydemyPage;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class Youtube_13_01_2022 {
/*
 String url2="https://www.google.com";
    //qualityDemy web sayfasina gidin
    // cookies i kabul edin
    // login linkine tiklayin
    // email ve password bilgilerini girerek login butonuna tiklayin
    // categories dropdown dan all courses secenegine tiklayin
    // acilan sayfada olan derslerden The English Master Course dersine tiklayin
    // dersi satin almak icin Buy now secenegine ve checkout butonuna tiklayin
    // stripe secenegini secerek pay with stripe e tiklayin
    // Email,card information gun ay yil cvc ve name on card bilgilerini doldurarak pay a tiklayin
 */
    @Test
   public void Qulitydemytest01(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.Cookies.click();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu1.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //ReusableMethods.waitForClickablility(qualitydemyPage.Loginkutusu,1);
        qualitydemyPage.Loginkutusu.click();
        Driver.closeDriver();





    }

    @Test
    public void Qulitydemytest02(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.Cookies.click();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        //qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu1.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //ReusableMethods.waitForClickablility(qualitydemyPage.Loginkutusu,1);
        qualitydemyPage.Loginkutusu.click();
        Driver.closeDriver();



    }

    @Test
    public void Amazontest03(){
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");
       // amazonPage.HomepageDildegisimiconu;
       // amazonPage.HomepageDildegisimiconu.click();
        WebElement mausElementi= amazonPage.HomepageDildegisimiconu;
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(mausElementi).perform();

        WebElement espaniol =amazonPage.espaniolconu;
        actions.moveToElement(espaniol).perform();
        espaniol.click();
        //actions.moveToElement(espaniol).click();


         ReusableMethods.bekle(2);
         Driver.getDriver().quit();
       // WebElement mausElementi= amazonPage.espaniolconu;
        //WebElement dropdownWebElementi= amazonPage.espaniolconu;

        // 2- Select class'indan obje olusturmak
        //Select select = new Select(dropdownWebElementi);

        // 3- select objesini kullanarak istedigimiz method/method'lari calistirin

        // select.selectByValue("search-alias=stripbooks-intl-ship");
        // select.selectByIndex(5);
        //select.selectByValue("en_US");

       // amazonPage.espaniolconu.sendKeys(Keys.ENTER);


       // Actions actions = new Actions(Driver.getDriver());
       // actions.moveToElement(mausElementi).perform();





    }
}
