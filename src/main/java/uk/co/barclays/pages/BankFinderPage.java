package uk.co.barclays.pages;

import uk.co.barclays.Utility.Utility;

public class BankFinderPage extends Utility {

    //initiate log4j property
    private static final Logger log = LogManager.getLogger(BranchFinderPage.class.getName());

    //send text to postcode field
    @FindBy(xpath = "//input[@id='location']")
    WebElement _enterTextToLocationField;
    // clicking on search
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement _clickOnSearchBtn;

    public void sendTextToLoactionField(String postCode){
        Reporter.log("enter text for location"+postCode+"to the field"+_enterTextToLocationField.toString()+"<br>");
        sendTextToElement(_enterTextToLocationField,postCode);
        log.info("enter text for location"+postCode+"to the field"+_enterTextToLocationField.toString());
    }
    public void clickOnSearchBtn(){
        Reporter.log("click on search btn"+_clickOnSearchBtn.toString()+"<br>");
        clickOnElement(_clickOnSearchBtn);
        log.info("click on search btn"+_clickOnSearchBtn.toString());
    }

}

