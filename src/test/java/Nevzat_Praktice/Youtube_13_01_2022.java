package Nevzat_Praktice;

import Pages.QualitydemyPage;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

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
        ReusableMethods.waitForClickablility(qualitydemyPage.Loginkutusu,1);
        qualitydemyPage.Loginkutusu.click();


        Actions action=new Actions(Driver.getDriver());
        //action.moveToElement(qualitydemyPage.categoriobuttonuCE).clickAndHold(qualitydemyPage.categoriobuttonuCE)
          //      .moveToElement(qualitydemyPage.CategoriesAllkurses).clickAndHold(qualitydemyPage.CategoriesAllkurses).perform();
        qualitydemyPage.categoriobuttonuCE.click();
        qualitydemyPage.CategoriesAllkurses.click();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
         ReusableMethods.waitForClickablility(qualitydemyPage.kursayfalari2incisayfa,3);
         action.moveToElement(qualitydemyPage.kursayfalari2incisayfa).clickAndHold();
        qualitydemyPage.kursayfalari2incisayfa.click();


    }
}
