package uk.co.barclays.testBase;/*
 *Vinay Creation
 *Date of Creation
 */

import uk.co.barclays.basepage.BasePage;
import uk.co.barclays.browserselector.BrowserSelector;
import uk.co.barclays.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterMethod
    public void closeBrowser() {
        // driver.quit();
    }

}
