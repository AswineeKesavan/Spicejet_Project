package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {

    WebDriver driver;

    public BookingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
    WebElement Gender;

    @FindBy(xpath = "(//input[@type='text'][1])")
     WebElement FirstName;

    @FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
     WebElement LastName;

    @FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
     WebElement MobileNumber;

    @FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
     WebElement EmailId;

    @FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[4]/div[2]/div[2]/div/div[2]")
    WebElement CountryMenu;

    @FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
    WebElement TownCity;

    @FindBy(xpath = "//div[text()='Retain my details for the next visit.']")
     WebElement RetainMyDetails;
    //Adding the passenger details
    @FindBy(xpath = "//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[1]/div[2]/div/div[2]")
    WebElement Gender1;

    @FindBy(xpath = "//input[@data-testid='traveller-0-first-traveller-info-input-box']")
     WebElement F_Name;

    @FindBy(xpath = "//input[@data-testid='traveller-0-last-traveller-info-input-box']")
     WebElement L_Name;

    @FindBy(xpath = "//input[@data-testid='sc-member-mobile-number-input-box']")
     WebElement M_Number;

    @FindBy(xpath = "//div[text()='Next']")
    WebElement ClickNext;

    @FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
     WebElement Continue;

    @FindBy(xpath = "(//div[@data-testi='add-ons-continue-footer-button'])[3]")
      WebElement ClickContinue;

    @FindBy(xpath = "//input[@id='card_number']")
     WebElement CardNumber;

    @FindBy(xpath = "//input[@id='name_on_card']")
     WebElement NameOnCard;

    @FindBy(xpath = "//input[@id='card_exp_month']")
     WebElement ExpMonth;

    @FindBy(xpath = "//input[@id='card_exp_year']")
     WebElement ExpYear;

    @FindBy(xpath = "//input[@id='security_code']")
     WebElement Cvv;

    @FindBy(xpath = "//div[@data-testid='common-proceed-to-pay']")
     WebElement ProceedToPay;


    public void setGender() {
        Select select = new Select(Gender);
        select.selectByIndex(1);
    }
    public void setFirstName(String fName) {
        FirstName.sendKeys(fName);
    }
    public void setLastName(String lName) {
        LastName.sendKeys(lName);
    }
    public void setMobileNumber(String mNum) {
        MobileNumber.sendKeys(mNum);
    }
    public void setEmailId(String email) {
        EmailId.sendKeys(email);
    }
    public void setCountryMenu() {
        Select select1 = new Select(CountryMenu);
        select1.selectByVisibleText("India");
    }
    public void setTownCity(String town) {
        TownCity.clear();
        TownCity.sendKeys(town);
    }
    public void setRetainMyDetails() {
        RetainMyDetails.click();
    }


    public void setGender1() {
        Select select2 = new Select(Gender1);
        select2.selectByIndex(1);
    }
    public void setF_Name(String fstName) {
        F_Name.sendKeys(fstName);
    }
    public void setL_Name(String lstName) {
        L_Name.sendKeys(lstName);
    }
    public void setM_Number(String mobNum) {
        M_Number.sendKeys(mobNum);
    }

    public void setClickNext(){
        ClickNext.click();
    }
    public void setContinue() {
        Continue.click();
    }
    public void setClickContinue() {
        ClickContinue.click();
    }


    public void setCardNumber(String crdNum) {
        CardNumber.sendKeys(crdNum);
    }
    public void setNameOnCard(String nameOnCard) {
        NameOnCard.sendKeys(nameOnCard);
    }
    public void setExpMonth(String expMon) {
        ExpMonth.sendKeys(expMon);
    }
    public void setExpYear(String expYr) {
        ExpYear.sendKeys(expYr);
    }
    public void setCvv(String cvvNum) {
        Cvv.sendKeys(cvvNum);
    }
    public void setProceedToPay() {
        ProceedToPay.click();
    }
}
