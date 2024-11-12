package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtendReportGenerator extends BaseTest{

    ExtentSparkReporter extentSparkReporter;
    ExtentReports extentReports;
    ExtentTest extentTest;

    @BeforeTest
    public void startReport(){
        extentReports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter("reports/index.html");
        extentReports.attachReporter(extentSparkReporter);
        extentSparkReporter.config().setDocumentTitle("Regression Test");
        extentSparkReporter.config().getReporter();

    }

    @Test
    public void test(){
        extentTest = extentReports.createTest("Verify the testcases");
        extentTest.log(Status.PASS,"TestCase is Pass");
    }

    @AfterMethod
    public void afterMethod(){
        String path = BaseTest.takeScreenshots("test");
        extentTest.addScreenCaptureFromPath(path);
        extentTest.fail("TestCase is Fail");
    }

    @AfterTest
    public void afterTest(){
        extentReports.flush();
    }
}
