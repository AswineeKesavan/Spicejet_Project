package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightStatusPage {

    WebDriver driver;

    public FlightStatusPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locator For all the element
    @FindBy(xpath = "//div[text()='flight status']")
    WebElement FlightStatus;

    @FindBy(xpath = "//div[text()='Departure Date']")
    WebElement DepartureDate;

    @FindBy(xpath = "//div[text()='Today']")
    WebElement Today;


    @FindBy(xpath = "//div[text()='From']")
    WebElement From;

    @FindBy(xpath = "//div[text()='DEL']")
    WebElement SelectDel;

    @FindBy(xpath = "//div[text()='To']")
    WebElement To;

    @FindBy(xpath = "//div[text()='Agartala']")
    WebElement SelectMAA;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
    WebElement FlightSearch;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-1ah4tor r-1otgn73']")
    WebElement FlightTiming;

    //Method to fill out the Flight Status

    public void setFlightStatus(){
        FlightStatus.click();
    }

    public void setDepartureDate(){
        DepartureDate.click();
    }

    public void setToday(){
        Today.click();
    }

    public void setFrom(){
        From.click();
    }

    public void setSelectDel(){
        SelectDel.click();
    }

    public void setTo(){
        To.click();
    }

    public void setSelectMaa(){
        SelectMAA.click();
    }

    public void setFlightSearch(){
        FlightSearch.click();
    }

    public void setFlightTiming(){
        FlightTiming.getText();
    }
}
