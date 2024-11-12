package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingPageTest extends BaseTest{

    @Test
    public void testBookingPage() throws InterruptedException {
        bookingPage.setFirstName("Aswinee");
        bookingPage.setLastName("Kesavan");
        bookingPage.setMobileNumber("9940123399");
        bookingPage.setEmailId("aswineek7@gmail.com");
        //bookingPage.setCountryMenu();
        bookingPage.setTownCity("Chennai");
        //Adding passenger details
        bookingPage.setF_Name("Yaashus");
        bookingPage.setL_Name("Mathu");
        bookingPage.setM_Number("9994077789");
        //bookingPage.setClickNext();
        bookingPage.setContinue();
        Thread.sleep(3000);
        Thread.sleep(6000);
        //WebDriverWait wait = new  WebDriverWait (driver, Duration.ofSeconds(40));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("img"))).click();
        String str = driver.getCurrentUrl();
        Assert.assertEquals(str, "https://www.spicejet.com/booking/addons");
    }
}
