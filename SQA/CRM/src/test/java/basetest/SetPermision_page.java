package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;

public class SetPermision_page extends Base_page{


    String Create_role = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-permission/div/div[1]/div/div/a";
    String role_name_field = "roleName";
    String role_list = "[class='role-item']";
    String add_button = "/html/body/modal-container/div[2]/div/app-modal-layout/div[3]/button[2]";

    String delete_btn1 =  "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-permission/div/div[1]/div/ul/li[";
    String delete_btn2 = "]/div[2]/button[2]" ;
    String confirm_btn = "/html/body/modal-container/div[2]/div/app-modal-layout/div[3]/button[2]";


    public SetPermision_page getcreaterole()throws InterruptedException{
        Thread.sleep(5000);
        el(By.xpath(Create_role)).click();
        return this;

    }

    public SetPermision_page createnewrole(String roleName) throws InterruptedException{

        el(By.id(role_name_field)).fill().with(roleName);
        Thread.sleep(5000);
        el(By.xpath(add_button)).click();
        return this;
    }

    public void deleterole(String roleName) throws InterruptedException {
        FluentList<FluentWebElement> roles = find(By.cssSelector(role_list));
        Utils utils = newInstance(Utils.class);
        java.lang.String role_position = utils.getPositionInList(roles,roleName);

        System.out.println("role_position "+role_position);

        el(By.xpath(delete_btn1 + role_position + delete_btn2)).click();

        Thread.sleep(5000);
        el(By.xpath(confirm_btn)).click();


    }
}

