package uk.co.barclays.pages;/*
 *Vinay Creation
 *Date of Creation
 */

public class HomePage {
    // initiate log4j properties
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    // mouseHover on link
    @FindBy(linkText = "Bank")
    WebElement _bankDropDownLink;
    //clicking on current account
    @FindBy(xpath = "//div[@class='nav-l3']//a[contains(text(),'Current accounts')]")
    WebElement _currentAccountsLink;
    @FindBy(xpath = "//span[contains(text(),'Find a branch')]")
    WebElement _findABranchLink;


    public void mouseHoverBankDropDownLink(){
        Reporter.log("mouse hover on element"+_bankDropDownLink.toString()+"<br>");
        mouseHoverToElement(_bankDropDownLink);
        log.info("mouse hover on element"+_bankDropDownLink.toString());
    }
    public void clickOnCurrentAccountLink(){
        Reporter.log("click on current account"+_currentAccountsLink.toString()+"<br>");
        clickOnElement(_currentAccountsLink);
        log.info("click on current account"+_currentAccountsLink.toString());
    }
    public void clickOnFindABranchLink(){
        Reporter.log("click on find a branch link"+_findABranchLink.toString()+"<br>");
        clickOnElement(_findABranchLink);
        log.info("click on find a branch link"+_findABranchLink.toString());
    }

}

