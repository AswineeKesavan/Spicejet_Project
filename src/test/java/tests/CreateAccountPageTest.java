package tests;

import Pages.CreateAccountPage;
import io.opentelemetry.context.internal.shaded.WeakConcurrentMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Set;

public class CreateAccountPageTest extends BaseTest {

    @Test
    public void CreateAcc() throws InterruptedException {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        createAccountPage.setClickingSignupButton();
        //Storing the current window handel
        String mainWindowHandel = driver.getWindowHandle();
        //Switching to the new window
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandel : allWindows){
            if (!windowHandel.equals(mainWindowHandel)){
                driver.switchTo().window(windowHandel);
                createAccountPage.setSelectDropDown();
                createAccountPage.setFirstNameField("Aswinee");
                createAccountPage.setLastNameField("Kesavan");
                createAccountPage.setDobField();
                Thread.sleep(3000);
                //Selecting month
                WebElement dd = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
                Select select = new Select(dd);
                select.selectByVisibleText("May");
                Thread.sleep(3000);
                //Selecting Year
                WebElement dd1 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
                Select select1 = new Select(dd1);
                select1.selectByVisibleText("2000");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//div[text()='4']")).click();
                createAccountPage.setMobileNumberField("9940123399");
                Thread.sleep(2000);
                createAccountPage.setEmailField("aswinee2000@gmail.com");
                Thread.sleep(2000);
                createAccountPage.setCPasswordField("Aswinee@0412");
                Thread.sleep(2000);
                createAccountPage.setNewPasswordField("Aswinee@0412");
                Thread.sleep(2000);
                createAccountPage.setClickingCheckBox();
                Thread.sleep(2000);
                createAccountPage.setSubmitButton();
                Thread.sleep(2000);
                String str = driver.findElement(By.xpath("//label[text()='OTP Verification']")).getText();
                System.out.println(str);
                Assert.assertEquals(str,"OTP Verification");
                driver.close();
                driver.switchTo().window(mainWindowHandel);

            }
        }

    }


}
