package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateAccountPage {

    WebDriver driver;

    // Constructor to initialize the driver and web elements

    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    // Locators for the elements on the Sign-Up page

    @FindBy(xpath = "//div[text()='Signup']")
    WebElement ClickingSignupButton;

    @FindBy(xpath = "//select[@class='form-control form-select ']")
    WebElement SelectDropDown;

    @FindBy(xpath = "//input[@id='first_name']")
    WebElement FirstNameField;

    @FindBy(xpath = "//input[@id='last_name']")
    WebElement LastNameField;

    @FindBy(xpath = "//input[@id='dobDate']")
    WebElement DobField;

    @FindBy(xpath = "//input[@class=' form-control']")
    WebElement MobileNumberField;


    @FindBy(xpath = "//input[@id='email_id']")
    WebElement EmailField;

    @FindBy(xpath = "//input[@id='new-password']")
    WebElement NewPasswordField;

    @FindBy(xpath = "//input[@id='c-password']")
    WebElement CPasswordField;

    @FindBy(xpath = "//input[@id='defaultCheck1']")
    WebElement ClickingCheckBox;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement SubmitButton;


    // Method to fill out the sign-up form

    public void setClickingSignupButton(){
        ClickingSignupButton.click();
    }

    public void setSelectDropDown(){
        Select select = new Select(SelectDropDown);
        select.selectByIndex(2);
    }

    public void setFirstNameField(String fName){
        FirstNameField.sendKeys(fName);
    }

    public void setLastNameField(String lName){
        LastNameField.sendKeys(lName);
    }

    public void setDobField(){
        DobField.click();
    }

    public void setMobileNumberField(String mobileNum){
        MobileNumberField.sendKeys(mobileNum);
    }

    public void setEmailField(String emailField){
        EmailField.sendKeys(emailField);
    }

    public void setNewPasswordField(String passwordField){
        NewPasswordField.sendKeys(passwordField);
    }

    public void setCPasswordField(String cPasswordField){
        CPasswordField.sendKeys(cPasswordField);
    }

    public void setClickingCheckBox(){
        ClickingCheckBox.click();
    }

    public void setSubmitButton(){
        SubmitButton.click();
    }
}
