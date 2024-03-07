package firsttest;

import basetest.Base_page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestListener;
import junit.framework.TestResult;
import org.fluentlenium.adapter.junit.After;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class Base_test extends FluentTest {

    public static ExtentTest extentTest;
    @Page
    Base_page base_page;

    // Create an instance of ExtentReports
    static ExtentReports extentReports = new ExtentReports();

    String Username = "Shanto";
    String Password = "1234";
    private ExtentTest test;



    @Override
    public WebDriver newWebDriver() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Optionally, maximize the window
        return new ChromeDriver(options);
    }
    @Before
    public void BeforeTest() {
        // Create an instance of ExtentSparkReporter and attach it to the ExtentReports instance
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("report/report.html");
        extentReports.attachReporter(sparkReporter);

        // Optionally, configure additional settings for the report
        sparkReporter.config().setDocumentTitle("Passioncare Test Report");
        sparkReporter.config().setReportName("Passioncare Test Results");
    }

@Test

public void login () throws InterruptedException {

       Base_test.extentTest = Base_test.extentReports.createTest("Login test" ,"This is a test to check if the login is working");
      extentTest.log(Status.INFO, "Login Test");
     extentTest.log(Status.INFO, "Test data<br>Username: '" + Username + "'<br>Password: '" + Password + "'");

    goTo(base_page).getloginpage().login(Username,Password,extentTest).verifyLoginAndUser(extentTest);


    // Log test status and details
    extentTest.log(Status.PASS, "Test passed");
//        test.log(Status.FAIL, "Test failed");
//        test.log(Status.SKIP, "Test skipped");

    // Wait for the page to finish loading

    Thread.sleep(5000);

  }





}

