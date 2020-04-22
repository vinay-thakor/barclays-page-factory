package uk.co.barclays.browserselector;/*
 *Vinay Creation
 *Date of Creation
 */

import uk.co.barclays.basepage.BasePage;

public class BrowserSelector extends BasePage {

    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser){

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",projectPath + "/drivers/chromedriver.exe");
            log.info("Launching Chrome Browser");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",projectPath + "/drivers/geckodriver.exe");
            log.info("Launching Firefox Driver");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver",projectPath + "/drivers/IEDriverServer.exe");
            log.info("Launching internet Explorer");
            driver = new InternetExplorerDriver();
        }else
            System.out.println("wrong browser selected");

    }

}
