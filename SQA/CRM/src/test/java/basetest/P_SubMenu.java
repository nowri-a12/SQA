package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;

public class P_SubMenu extends Base_page {


 String menu1 = "/html/body/app-root/app-login-layout/app-home-layout/app-sidebar-layout/div/div/div[2]/ul/li[2]/ul/li[";

 String menu2 = "]/a";

 String menu_sub_item= "[class='menu-sub-item']";

 String submenu_item_position = "";

 String patient_column = "[col-id='FirstName']";

 private String getsubmenu(String submenu_item_name) {

  FluentList <FluentWebElement> submenu_items = find(By.cssSelector(menu_sub_item));
  Utils utils = newInstance(Utils.class);
  return utils.getPositionInList2(submenu_items , submenu_item_name);

 }




 public P_SubMenu gotoMarketing(ExtentTest extentTest){


  submenu_item_position = getsubmenu("Marketing");
  el(By.xpath(menu1 + submenu_item_position + menu2)).click();
  return this;


 }

 public P_SubMenu gotoEnrolment(ExtentTest extentTest){

  submenu_item_position = getsubmenu("Enrolment");
  el(By.xpath(menu1 + submenu_item_position + menu2)).click();
  return this;

 }



}
