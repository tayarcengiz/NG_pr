package T2_Cengiz;
import Pages.QualitydemyPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestbaseCross;

public class US_09_01_sepeteEklenenKursuSilmek extends TestbaseCross {

   @Test
    public void test01(){
        //1.https://www.qualitydemy.com/ sayfasina git kullanıcı bilgileri ile siteye giris yap.
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        if (qualitydemyPage.Cookies.isDisplayed()) { qualitydemyPage.Cookies.click();}
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu1.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        ReusableMethods.bekle(2);
        qualitydemyPage.Loginkutusu.click();
        ReusableMethods.bekle(5);

        //2. kullanici sectigi kursu sapete ekler sepette gorundugunu test eder.
        //2.a Free steps yazma kursunu tıklar
        Driver.getDriver().get("https://www.qualitydemy.com/home/course/steps-yazma/62");
       // qualitydemyPage.freestepsyazmakursu.click();
        //2.b  free kursu sepete ekler
        if (qualitydemyPage.Cookies.isDisplayed()) { qualitydemyPage.Cookies.click();}
        qualitydemyPage.sepeteeklemekutusu.click();


        ReusableMethods.bekle(5);
        // eklenen kursun sepete eklendigini test eder
        qualitydemyPage.shoppingkartsepeti.click();
        //kursun eklendigini test etmek:
        Assert.assertTrue(qualitydemyPage.freestepyazmakursukutusu.isDisplayed());
        ReusableMethods.bekle(3);
        // eklenen kursu silmek:
        qualitydemyPage.kursremovebutonu.click();
        if (qualitydemyPage.Cookies.isDisplayed()) { qualitydemyPage.Cookies.click();}
        ReusableMethods.bekle(2);
        qualitydemyPage.shoppingkartsepeti.click();
        ReusableMethods.bekle(2);


        WebElement aramaSonucuElementi = qualitydemyPage.mevcutkurssayisiyazisi ;

        String expectedKelime = "0 Courses in cart";
        String actualAramaSonucu = aramaSonucuElementi.getText();

        //eklenen kursun silindigini test etmek:
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
        ReusableMethods.bekle(2);

        Driver.closeDriver();
    }


}


