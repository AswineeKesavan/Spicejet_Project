package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

public class TestNgListeners implements ITestListener {

    ExtentSparkReporter extentSparkReporter;
    ExtentReports extentReports;
    ExtentTest extentTest;
    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

    @Override
    public void onStart(ITestContext context) {
        extentReports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter("reports/index.html");
        extentReports.attachReporter(extentSparkReporter);
        extentSparkReporter.config().setDocumentTitle("Regression Test");
        extentSparkReporter.config().getReporter();

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest("Verify the testcases" + result.getMethod().getMethodName());
        System.out.println("Test Started");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS,"TestCase is Pass");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testCaseName = result.getMethod().getMethodName();
        String path = BaseTest.takeScreenshots("test");
        extentTest.addScreenCaptureFromPath(path);
        extentTest.fail("TestCase is Fail");

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }
}
