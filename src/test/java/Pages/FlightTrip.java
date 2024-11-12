package Pages;

import org.apache.poi.poifs.property.Child;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FlightTrip {

    WebDriver driver;

    //Constructor to initialize the driver and web elements
    public FlightTrip(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators for the elements on the Flight trip page

    //One Way Trip
    @FindBy(xpath = "//div[text()='one way']")
    private WebElement OneTrip;

    //Round Trip
    @FindBy(xpath = "//div[text()='round trip']")
    private WebElement RoundTrip;

    //Departure
    @FindBy(xpath = "(//input[@spellcheck='false'])[1]")
    private WebElement Departure;

    //Destination
    @FindBy(xpath = "(//input[@spellcheck='false'])[2]")
    private WebElement Destination;

    //Select Departure City
    @FindBy(xpath = "//div[text()='DEL']")
    private WebElement selectDelhi;

    //Select Destination City
    @FindBy(xpath = "//div[contains(text(),'BOM')]")
    private WebElement selectMumbai;

    @FindBy(xpath = "//div[text()='Departure Date']")
    private WebElement DepartureDate;

    //Choosing Departure day
    @FindBy(xpath = "//div[text()='31']")
    private WebElement DepartureDay;

    //Choosing Return Date
    @FindBy(xpath = "//div[text()='Select Date']")
    private WebElement ReturnDate;

    //Choosing Return Day
    @FindBy(xpath = "//div[text()='31']")
    private WebElement ReturnDay;

    //Choosing Passenger
    @FindBy(xpath = "//div[text()='Passengers']")
    private WebElement Passengers;

    //Choosing Adult
    @FindBy(xpath = "//div[@data-testid='Adult-testID-plus-one-cta']")
    private WebElement NoOfAdult;

    //Choosing Child
    @FindBy(xpath = "//div[@data-testid='Children-testID-plus-one-cta']")
    private WebElement NoOfChild;

    //Clicking button after selecting Adult and Child
    @FindBy(xpath = "//div[text()='Passengers']")
    private WebElement Passengers1;

    //Selecting Currency from dropdown
    @FindBy(xpath = "//div[text()='Currency']")
    private WebElement Currency;

    //Selecting Passenger type
    @FindBy(xpath = "//div[text()='Senior Citizen']")
    private WebElement SeniorCitizen;

    //Search Flight button
    @FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
    private WebElement SearchFlight;

    //Selecting Amount
    @FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1i10wst r-1kfrs79'])[4]")
    private WebElement select_Amt;

    //Discount Booking
    @FindBy(tagName = "rect")
    private WebElement DiscountBooking;

    //Continue Discount Booking
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
    private WebElement ContinueDiscount;

    //Flight Details
    @FindBy(xpath = "(//div[text()='Flight Details'])[1]")
    private WebElement flightDetail1;

    //Select ContinueButton
    @FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
    private WebElement continueButton;


    public void setOneTrip() {
        OneTrip.click();
    }

    public void setRoundTrip() {
        RoundTrip.click();
    }

    public void setDeparture() {
        Departure.click();
    }

    public void setSelectDelhi() {
        selectDelhi.click();
    }

    public void setDestination() {
        Destination.click();
    }

    public void setSelectMumbai() {
        selectMumbai.click();
    }

    public void setDepartureDate() {
        DepartureDate.click();
    }

    public void setDepartureDay() {
        DepartureDay.click();
    }

    public void setReturnDate(){
        ReturnDate.click();
    }

    public void setReturnDay(){
        ReturnDay.click();
    }

    public void setPassengers() {
        Passengers.click();
    }

    public void setNoOfAdult() {
        NoOfAdult.click();
    }

    public void setNoOfChild() {
        NoOfChild.click();
    }

    public void setPassengers1() {
        Passengers1.click();
    }

    public void setCurrency() throws InterruptedException {
        Select select = new Select(Currency);
        select.selectByIndex(1);
        Thread.sleep(3000);
    }

    public void setSeniorCitizen() {
        SeniorCitizen.click();
    }

    public void setSearchFlight() {
        SearchFlight.click();
    }

    public void setSelect_Amt() {
        select_Amt.click();
    }

    public void setDiscountBooking(){
        DiscountBooking.click();
    }

    public void setContinueDiscount(){
        ContinueDiscount.click();
    }

    public void setFlightDetail1() {
        flightDetail1.click();
    }

    public void setContinueButton() {
        continueButton.click();
    }

}
