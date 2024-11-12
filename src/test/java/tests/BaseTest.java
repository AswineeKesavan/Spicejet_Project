package tests;

import Pages.*;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {

   public static WebDriver driver;
   public BookingPage bookingPage;
   public CreateAccountPage createAccountPage;
   public FlightTrip flightTrip;
   public LoginPage loginPage;
   public CheckInPage checkInPage;
   public FlightStatusPage flightStatusPage;
   public ManageBookingPage manageBookingPage;

   @Parameters("browser")
   @BeforeMethod
   public void setUp(String browser){
       if(browser.equalsIgnoreCase("chrome")) {
           ChromeOptions options = new ChromeOptions();
          options.addArguments("--disable-notification");
           driver = new ChromeDriver();
      }else if (browser.equalsIgnoreCase("firefox")){
           FirefoxOptions options = new FirefoxOptions();
           options.addArguments("--disable-notification");
           driver = new FirefoxDriver(options);
       }
       driver.get("https://www.spicejet.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       bookingPage = new BookingPage(driver);
       createAccountPage = new CreateAccountPage(driver);
       flightTrip = new FlightTrip(driver);
       loginPage = new LoginPage(driver);
       checkInPage = new CheckInPage(driver);
       flightStatusPage = new FlightStatusPage(driver);
       manageBookingPage = new ManageBookingPage(driver);
   }

   @AfterMethod
    public void tearDown(){
       driver.quit();
   }

   public static String takeScreenshots(String testCaseName){
       TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
       File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

       File destinationFile = new File("Screenshots/"+ testCaseName + ".png");
       try {
           FileUtils.copyFile(srcFile,destinationFile);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       String path = "<img src = " + destinationFile.getAbsolutePath() + "width = 200px height = 200px/>";
       Reporter.log(path);
       return destinationFile.getAbsolutePath();
   }

}
