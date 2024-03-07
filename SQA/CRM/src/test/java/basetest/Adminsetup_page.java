package basetest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Adminsetup_page extends Base_page{

String set_user = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/ul/li[1]/a";

String set_permission = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/ul/li[2]/a";
String set_department = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/ul/li[3]/a";
String tags = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/ul/li[4]/a";
String hhax_setting = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/ul/li[5]/a";


public  Adminsetup_page Setuserpage(ExtentTest extentTest) throws InterruptedException {
Thread.sleep(5000);
    el(By.xpath(set_user)).click();


    File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
    try {
        String screenshotPath = projectDir + "/report/screenshot/adminSetup/setUserPage.png"; // Specify the screenshot file path
        FileUtils.copyFile(screenshot, new File(screenshotPath));
        extentTest.addScreenCaptureFromPath(screenshotPath);
        extentTest.log(Status.INFO, "Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
    } catch (IOException e) {
        e.printStackTrace();
    }
        return this;
    }




public Adminsetup_page Setpermission(ExtentTest extentTest) throws InterruptedException {
Thread.sleep(5000);
    System.out.println("set_permission : "+set_permission);
    el(By.xpath(set_permission)).click();
    return this;
}
public Adminsetup_page Setdepartment (ExtentTest extentTest) throws InterruptedException {

    System.out.println("set_department : "+set_department);
    Thread.sleep(10000);
    el(By.xpath(set_department)).click();
    return this;
}
public Adminsetup_page tags (ExtentTest extentTest) throws InterruptedException {

    Thread.sleep(10000);
    el(By.xpath(tags)).click();
    return this;
}

public Adminsetup_page hhaxsettings (){
    el(By.xpath(hhax_setting)).click();
    return this;
}





}
