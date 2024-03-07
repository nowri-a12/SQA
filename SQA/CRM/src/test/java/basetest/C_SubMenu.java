package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;

public class C_SubMenu extends Base_page {

   String menu1 = "/html/body/app-root/app-login-layout/app-home-layout/app-sidebar-layout/div/div/div[2]/ul/li[3]/ul/li[";

    String menu2 = "]/a";

    String sub_menu_item = "/html/body/app-root/app-login-layout/app-home-layout/app-sidebar-layout/div/div/div[2]/ul/li[3]/ul/li";


    String sub_menu_position = "";

   private String getCaregivermenu(String submenu_item_name){

      FluentList<FluentWebElement> submenu_items = find(By.xpath(sub_menu_item));
       Utils utils = newInstance(Utils.class);
       return utils.getPositionInList2(submenu_items , submenu_item_name);

    }
  public C_SubMenu gotoLead(ExtentTest extentTest){
       sub_menu_position = getCaregivermenu("Lead");

        System.out.println(menu1 + sub_menu_position+ menu2);

      el(By.xpath(menu1 + sub_menu_position+ menu2)).click();

    return this;
    }

}
