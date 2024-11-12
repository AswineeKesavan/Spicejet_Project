package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckInPage {
    WebDriver driver;
    public CheckInPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='check-in']")
    WebElement CheckInButton;

    @FindBy(xpath = "(//input[@type='text'][1])")
    WebElement PnrNum;

    @FindBy(xpath = "//input[@placeholder='john.doe@spicejet.com']")
    WebElement EmailId;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
    WebElement SearchButton;

    // Method to fill out the Check-In Page

    public void setCheckInButton() throws Exception{
    	Thread.sleep(2000);
    	CheckInButton.click();
    }

    public void setPnrNum(String pnrNum){
        PnrNum.sendKeys(pnrNum);
    }

    public void setEmailId(String emailId){
        EmailId.sendKeys(emailId);
    }

    public void setSearchButton(){
        SearchButton.click();
    }
}
