package tests;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightStatusPageTest extends BaseTest{

    @Test
    public void testFlightPage() throws InterruptedException {

        flightStatusPage.setFlightStatus();
        flightStatusPage.setDepartureDate();
        flightStatusPage.setToday();
        Thread.sleep(3000);
        flightStatusPage.setFrom();
        Thread.sleep(3000);
        flightStatusPage.setSelectDel();
        Thread.sleep(3000);
        flightStatusPage.setTo();
        Thread.sleep(3000);
        flightStatusPage.setSelectMaa();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-1i10wst r-1eimq0t r-mk0yit r-xfkzu9 r-lnhwgy']")).sendKeys("78654");
        flightStatusPage.setFlightSearch();
        flightStatusPage.setFlightTiming();
        String str = driver.getCurrentUrl();
        Assert.assertEquals(str,"https://www.spicejet.com/flight-status/results?dateLabel=Today&source=DEL&destination=BOM");
    }
}
