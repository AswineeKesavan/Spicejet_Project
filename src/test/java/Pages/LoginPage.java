package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    //Constructor to initialize the driver and web elements
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Locators for the elements on the Login page
    @FindBy(xpath = "//div[text()='Login']")
    WebElement LoginButton;

    @FindBy(xpath = "//div[text()='Email']")
    WebElement EmailRadioButton;

    @FindBy(xpath = "//input[@type='email']")
    WebElement Email;

    @FindBy(xpath = "//input[@type='password']")
    WebElement Password;

    @FindBy(xpath = "//div[@data-testid='login-cta']")
    WebElement SubmitButton;


    // Method to fill out the Login

    public void setLoginButton(){
        LoginButton.click();
    }

    public void setEmailRadioButton(){
        EmailRadioButton.click();
    }

    public void setEmail(String email){
        Email.sendKeys(email);
    }

    public void setPassword(String password){
        Password.sendKeys(password);
    }

    public void setSubmitButton(){
        SubmitButton.click();
    }
}
