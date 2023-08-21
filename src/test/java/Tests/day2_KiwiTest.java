package Tests;

import Pages.KiwiPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class day2_KiwiTest {

    @Test
    public void kiwitest01(){

        // 1. www.kiwi.com     gehen zur Saite
        Driver.getDriver().get("http://www.kiwi.com");

        //2, Cookiesi akzeptieren
        KiwiPage kiwipage=new KiwiPage();
        if (kiwipage.kiwicookies.isDisplayed()) {
            kiwipage.kiwicookies.click();
        }

        //3, testen Sie ,ob der Title Kiwi enthalt
        String actueltittle= Driver.getDriver().getTitle();
        Assert.assertTrue(actueltittle.contains("Kiwi"));

        //4, machen Sie Language tr und Geld Tl
        kiwipage.langhwichbutton.click();
        Select dilkutusu=new Select(kiwipage.langwichselectionreinbutton);
       dilkutusu.selectByVisibleText("Türkçe");


        WebElement parabirimikutusu=Driver.getDriver().findElement(By.xpath("//select[@data-test='CurrencySelect']"));
        Select geldkutusu = new Select(parabirimikutusu);
        geldkutusu.selectByValue("try");

        WebElement savebutonu= Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        ReusableMethods.bekle(2);
        savebutonu.click();
        WebElement tryyazisi=Driver.getDriver().findElement(By.xpath("//div[text()='TRY']"));
        Assert.assertTrue(tryyazisi.isDisplayed());
        //tek yönu secin
        ReusableMethods.bekle(2);
       Driver.getDriver().findElement(By.xpath("//*[text()='Gidiş Dönüş']")).click();
       Driver.getDriver().findElement(By.xpath("//p[text()='Tek Yön']")).click();
       Driver.getDriver().findElement(By.xpath("//*[@class='Icon__StyledIcon-sc-1det6wr-0 hRQtyS closeIcon']")).click();
       Driver.getDriver().findElement(By.xpath("//input[@maxlength='120']")).sendKeys("ist");;

        ReusableMethods.bekle(2);
        Driver.getDriver().findElement(By.xpath(".//div[text()='SAW Sabiha Gökçen Havalimanı']")).click();

        //varis yeri secin
        WebElement varisNoktasiBox= Driver.getDriver().findElement(By.xpath("(//input[@data-test='SearchField-input'])[2]"));
        varisNoktasiBox.sendKeys("Varsova");
       // Driver.getDriver().findElement(By.xpath("(//div[@data-test='PlacePickerInputPlace-close'])[2]")).click();
       // Driver.getDriver().findElement(By.xpath("//div[@clss='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp _rotateTip']")).click();
       // Driver.getDriver().findElement(By.xpath("//p[text()='Aramanıza devam edin']")).click();
       // Driver.getDriver().findElement(By.xpath("//div[@clss='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp _rotateTip']")).sendKeys("mun");
      //  Driver.getDriver().findElement(By.xpath("//div[@class='PlacePickerstyled__PlacePickerItemName-sc-1ialbal-3 fasyeN']")).click();
        ReusableMethods.bekle(2);

        // varis tarihi sec
        Driver.getDriver().findElement(By.xpath("//div[@class='Inputsstyled__Value-sc-1kyvy53-3 cSvTFY']"));
        Driver.getDriver().findElement(By.xpath("//div[@class='CalendarDaystyled__DateContent-sc-17hkeg7-9 jpSnSy']")).click();
        ReusableMethods.bekle(2);
        Driver.getDriver().findElement(By.xpath("//span[text='Rezervasyon yap']"));

        Driver.getDriver().findElement(By.xpath("//*[text()='Varşova, Polonya']")).click();

        // Gidis tarihi kismina erisim saglayarak gidecegimiz gunu secelim ve booking i iptal edelim
        Driver.getDriver().findElement(By.xpath("//input[@data-test='SearchFieldDateInput']")).click();
       ReusableMethods.bekle(4);
        Driver.getDriver().findElement(By.xpath("//div[@data-value='2023-02-10']")).click();
        Driver.getDriver().findElement(By.xpath("//button[@data-test='SearchFormDoneButton']")).click();
        Driver.getDriver().findElement(By.xpath("//*[text()='Booking.com ile konaklama arayın']")).click();
        Driver.getDriver().findElement(By.xpath("//a[@data-test='LandingSearchButton']")).click();
        ReusableMethods.bekle(4);
        // Sadece aktarmasiz ucuslar olarak filtreleme yapalim ve en ucuz secenegine tiklayalim

        Driver.getDriver().findElement(By.xpath("(//div[@class='Radio__IconContainer-sc-crlwn1-1 ixtoRa'])[1]")).click();
        ReusableMethods.bekle(4);
        Driver.getDriver().findElement(By.xpath("//*[text()='En ucuz']")).click();
        // Filtreleme yaptigimiz en ucuz ucusun fiyatini getirerek 5000 tl den kucuk oldgunu dogurlayalim












        Driver.closeDriver();
















    }




}
