package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;

public class Setuser_page extends Base_page {

    String search_bar = "Search_text";

    String add_new = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-ag-grid-layout/div/div[1]/div[3]/button";


    String full_name_field = "fullName";

    String email_field = "email";

    String phone_number_field = "phoneNumber";

    String username_field = "userName";

    String password_field = "password";

    String confirm_password_field = "confirmPassword";


    String role_field = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-systemuser-form-sidebar/div/form/div[1]/div[6]/div[1]/div/select";

    String task_capacity = "taskcapacity";

    String user_status_toggle = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-systemuser-form-sidebar/div/form/div[1]/div[7]/div/div/label/span[1]";

    String organization = "organization permission";

    String first_org = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-systemuser-form-sidebar/div/form/div[1]/div[9]/div[1]/div/div[1]/div/label";

    String second_org = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-systemuser-form-sidebar/div/form/div[1]/div[9]/div[1]/div/div[2]/div/label";
    String third_org = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-systemuser-form-sidebar/div/form/div[1]/div[9]/div[1]/div/div[3]/div/label";
    String fourth_org = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-systemuser-form-sidebar/div/form/div[1]/div[9]/div[1]/div/div[4]/div/label";
    String fifth_org = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-systemuser-form-sidebar/div/form/div[1]/div[9]/div[1]/div/div[5]";
    String sixth_org = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-systemuser-form-sidebar/div/form/div[1]/div[9]/div[1]/div/div[6]/div/label";

    String save_button = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-systemuser-form-sidebar/div/form/div[2]/button[2]";

    String username_column = "[col-id='UserName']";
    String delete_btn1 = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-user/app-ag-grid-layout/div/div[2]/ag-grid-angular/div/div[2]/div[2]/div[3]/div[3]/div[";
    String delete_btn2 = "]/div/app-action-cell-renderer/div/button[2]" ;
    String confirm_btn = "/html/body/modal-container/div[2]/div/app-modal-layout/div[3]/button[2]";


    public  Setuser_page Addnew() {

        el(By.xpath(add_new)).click();
        return this;
    }

    public Setuser_page completeuserform(ExtentTest extentTest, String fullName, String email, String phoneNumber,
                                         String userName, String password, String role, Boolean User_status) throws InterruptedException {
        el(By.id(full_name_field)).fill().with(fullName);
        el(By.id(email_field)).fill().with(email);
        el(By.id(phone_number_field)).fill().with(phoneNumber);
        el(By.id(username_field)).fill().with(userName);
        el(By.id(password_field)).fill().with(password);
        el(By.id(confirm_password_field)).fill().with(password);
        el(By.xpath(role_field)).fillSelect().withText(role);

        el(By.xpath(first_org)).click();
        el(By.xpath(second_org)).click();
        el(By.xpath(third_org)).click();
        el(By.xpath(fourth_org)).click();
        el(By.xpath(fifth_org)).click();
        el(By.xpath(sixth_org)).click();


        if (User_status) {
            el(By.xpath(user_status_toggle)).click();
            Thread.sleep(5000);
        }

        return this;
    }
    public void Submit() throws InterruptedException {
        el(By.xpath(save_button)).click();
        Thread.sleep(5000);


}
    public void deletesystemuser(String username) throws InterruptedException {
        FluentList<FluentWebElement> users = find(By.cssSelector(username_column));
        Utils utils = newInstance(Utils.class);
        java.lang.String user_position = utils.getPositionInList(users,username);

        el(By.xpath(delete_btn1 + user_position + delete_btn2)).click();

        Thread.sleep(5000);
        el(By.xpath(confirm_btn)).click();

    }
}
