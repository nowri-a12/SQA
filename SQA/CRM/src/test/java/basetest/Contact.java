package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;

public class Contact extends Base_page {

    String messagepage = "/html/body/app-root/app-login-layout/app-home-layout/app-header-layout/div";

    String add_btn = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-messaging/div/div[2]/div[2]/div[2]/app-contact/div/div[2]/div[1]/app-ag-grid-layout/div/div[1]/div[2]/button";

    String first_name_filed = "firstName";

    String last_name_field = "lastName";

    String Email= "email";

    String phonenmbr_field = "phoneNumber";

    String save_btn = "/html/body/modal-container/div[2]/div/app-modal-layout/div[3]/button[2]";


    public Contact home_page()throws InterruptedException{

        Thread.sleep(5000);
        el(By.xpath(messagepage)).click();
        return this;
    }

    public Contact AddContact() throws InterruptedException{
        Thread.sleep(5000);
        el(By.xpath(add_btn)).click();
        return this;
    }


    public Contact createnewcontact(ExtentTest extentTest, String firstName, String lastName , String phoneNumber, String email) throws InterruptedException {

        el(By.id(first_name_filed)).fill().with(firstName);
        el(By.id(last_name_field)).fill().with(lastName);
        el(By.id(phonenmbr_field)).fill().with(phoneNumber);
        el(By.id(Email)).fill().with(email);

        el(By.xpath(save_btn)).click();

        Thread.sleep(5000);
        return this;

    }
}
