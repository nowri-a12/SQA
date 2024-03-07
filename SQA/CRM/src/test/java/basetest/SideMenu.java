package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;

import java.util.List;

public class SideMenu extends Base_page {

String menu1 = "/html/body/app-root/app-login-layout/app-home-layout/app-sidebar-layout/div/div/div[2]/ul/li[";


String menu2 = "]/a";
String menu_item ="menu-item";
String menu_item_position = "";


    private String getmenupage(String menu_item_name ){

    FluentList<FluentWebElement> menu_items = find(By.className(menu_item));

        Utils utils = newInstance(Utils.class);

        return utils.getPositionInList2(menu_items, menu_item_name);
}

public SideMenu gotoDashboard(){

        menu_item_position = getmenupage("Dashboard");
        el(By.xpath(menu1 + menu_item_position + menu2)).click();
        return this;
}

public  SideMenu gotoAdminSetup(){

        menu_item_position = getmenupage("Admin Setup");
        System.out.println(menu1 + menu_item_position + menu2);
        el(By.xpath(menu1 + menu_item_position + menu2)).click();
        return this;
}

public  SideMenu gotoPatient (){

    menu_item_position = getmenupage("Patient");
    System.out.println(menu1 + menu_item_position + menu2);
    el(By.xpath(menu1 + menu_item_position + menu2)).click();
    return this;

}

    public  SideMenu gotoCaregiver (){

        menu_item_position = getmenupage("Caregiver");
        System.out.println(menu1 + menu_item_position + menu2);
        el(By.xpath(menu1 + menu_item_position + menu2)).click();
        return this;

    }


    public  SideMenu gotoTask(ExtentTest extentTest){

        menu_item_position = getmenupage("Task");
        System.out.println(menu1 + menu_item_position + menu2);
        el(By.xpath(menu1 + menu_item_position + menu2)).click();
        return this;

    }

    public SideMenu gotoMessaging(ExtentTest extentTest){

        menu_item_position = getmenupage("Messaging");
        System.out.println(menu1 + menu_item_position + menu2);
        el(By.xpath(menu1 + menu_item_position + menu2)).click();
        return this;
    }






}
