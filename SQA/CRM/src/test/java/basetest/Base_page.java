package basetest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import firsttest.Base_test;
import org.apache.commons.io.FileUtils;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;




@PageUrl("http://103.108.146.179:8021/#/login")

public class Base_page extends FluentPage {
    ExtentTest extentTest;

    private Class String;

    String PassionCare = "Homepage";
    String login_here_btn = "/html/body/app-root/app-login-layout/app-login/div/div/div[2]/div/a";
    String Username = "userName";
    String Password = "password";
    String login_btn = "/html/body/app-root/app-login-layout/app-login/div/div/div[4]/form/button";

    String first_field = "Patient";
    String patient = "/html/body/app-root/app-login-layout/app-home-layout/app-sidebar-layout/div/div/div[2]/ul/li[2]/a";
    String P_department = "Marketing";
    String marketing ="/html/body/app-root/app-login-layout/app-home-layout/app-sidebar-layout/div/div/div[2]/ul/li[2]/ul/li[1]/a";

    String M_department= "marketing_field";
    String department = "/html/body/app-root/app-login-layout/app-home-layout/main/div";
    String M_form = "Add_new";
    String addnew = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-patient/div[3]/app-ag-grid-layout/div/div[1]/div[2]/button[2]";
    String page_title = "/html/body/app-root/app-login-layout/app-home-layout/app-header-layout/div/div[1]/div";
    String logged_in_user = "/html/body/app-root/app-login-layout/app-home-layout/app-sidebar-layout/div/div/div[2]/div/div/div/div[2]/span[1]";

    String projectDir = System.getProperty("user.dir");


    public Base_page getloginpage() {
        el(By.className(PassionCare));
        el(By.xpath(login_here_btn)).click();

        return this;
    }
    public  Base_page login(String userName, String password , ExtentTest extentTest) throws InterruptedException{

        el(By.id(Username)).fill().with(userName);
        el(By.id(Password)).fill().with(password);

        // Capture a screenshot and attach it to the Extent report
        File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            String screenshotPath = projectDir + "/report/screenshot/login/loginData.png"; // Specify the screenshot file path
            FileUtils.copyFile(screenshot, new File(screenshotPath));

            extentTest.addScreenCaptureFromPath(screenshotPath);
            extentTest.log(Status.INFO, "Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (IOException e) {
            e.printStackTrace();
        }

        el(By.xpath(login_btn)).click();
        Thread.sleep(5000);

        return this;
    }
    public void verifyLoginAndUser(ExtentTest extentTest) throws InterruptedException {
        Thread.sleep(5000);
        String title = el(By.xpath(page_title)).textContent();
        String user = el(By.xpath(logged_in_user)).textContent();
        if(title.contains("Dashboard") && user.contains("Shanto")) {
            File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            try {
                String screenshotPath = projectDir + "/report/screenshot/login/loginData.png"; // Specify the screenshot file path
                FileUtils.copyFile(screenshot, new File(screenshotPath));
                extentTest.addScreenCaptureFromPath(screenshotPath);
                extentTest.log(Status.INFO, "Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
                extentTest.log(Status.PASS, "Successfully logged in as " + user + ".");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            try {
                String screenshotPath = projectDir + "/report/screenshot/login/loginData.png"; // Specify the screenshot file path
                FileUtils.copyFile(screenshot, new File(screenshotPath));
                extentTest.addScreenCaptureFromPath(screenshotPath);
                extentTest.log(Status.INFO, "Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
                extentTest.log(Status.FAIL, "Login failed.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public Base_page getnewpage() throws InterruptedException {
     el(By.className(first_field));
     Thread.sleep(2000);
     el(By.xpath(patient)).click();
        return this;
    }
    public Base_page departement() throws InterruptedException {

        el(By.className(P_department));
        el(By.xpath(marketing)).click();
        Thread.sleep(5000);
        return this;
    }
    public Base_page marketing_field() {
        el(By.className(M_department));
        el(By.xpath(department)).click();
        return this;
    }
    public Base_page Form() throws InterruptedException {
       el(By.className(M_form));
       el(By.xpath(addnew)).click();
        Thread.sleep(5000);
        return this;
    }

}



