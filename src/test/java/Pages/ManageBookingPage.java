package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageBookingPage {

    WebDriver driver;

    //Constructor to initialize the driver and web elements
    public ManageBookingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='manage booking']")
    WebElement ManageBooking;

    @FindBy(xpath = "(//input[@type='text'][1])")
    WebElement PNRNum;

    @FindBy(xpath = "//input[@placeholder='john.doe@spicejet.com / Doe']")
    WebElement EmailId;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
    WebElement SearchButton;

    public void setManageBooking(){
        ManageBooking.click();
    }

    public void setPNRNum(String pnrNum){
        PNRNum.sendKeys(pnrNum);
    }

    public void setEmailId(String emailId){
        EmailId.sendKeys(emailId);
    }

    public void setSearchButton(){
        SearchButton.click();
    }
}
