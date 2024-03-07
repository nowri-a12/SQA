package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;

public class Messaging extends Base_page {

    String message = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-messaging/div/div[2]/div[1]/ul[1]/li[2]/a";

    String Contact = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-messaging/div/div[2]/div[1]/ul[1]/li[3]/a";

    String Autorply = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-messaging/div/div[2]/div[1]/ul[1]/li[4]/a";

    String  Template = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-messaging/div/div[2]/div[1]/ul[1]/li[5]/a";

    String Settings= "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-messaging/div/div[2]/div[1]/ul[1]/li[6]/a";

    String History = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-messaging/div/div[2]/div[1]/ul[1]/li[7]/a";


 public Messaging Contactlist(ExtentTest extentTest) throws InterruptedException  {

     Thread.sleep(5000);
     el(By.xpath(Contact)).click();
     return this;

 }




}
