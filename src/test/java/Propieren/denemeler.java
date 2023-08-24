package Propieren;

import org.junit.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class denemeler {
   @Test
    public void googledeneme() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
                // get("www.google.com");"www.google.com"
       Driver.getDriver().get("https://www.amazon.com");
        System.out.println(Driver.getDriver().getTitle());
             // title: Google
             //Amazon.com. Spend less. Smile more.
    }
}
