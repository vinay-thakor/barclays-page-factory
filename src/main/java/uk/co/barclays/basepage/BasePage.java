package uk.co.barclays.basepage;/*
 *Vinay Creation
 *Date of Creation
 */

public class BasePage {

    public static WebDriver driver;

    public BasePage() {
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/uk/co/barclays/resources/properties/log4j.properties");
        PageFactory.initElements(driver, this);
    }

}
