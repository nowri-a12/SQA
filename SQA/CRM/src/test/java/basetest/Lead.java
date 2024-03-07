package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;


public class Lead extends Base_page {


    String lead_page = "/html/body/app-root/app-login-layout/app-home-layout/app-header-layout/div";

    String addnew_btn = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-aide/div[3]/app-ag-grid-layout/div/div[1]/div[2]/button[2]";

    String first_name_filed = "firstName";

    String last_name_field = "lastName";

    String phonenmbr_field = "phoneNumber";

    String save_btn = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-aide/app-aide-form-sidebar/div/form/div[2]/button[2]";

    String Email= "email";

    String Aide_column = "[col-id='FullName']";
    String Delete1 = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-aide/div[3]/app-ag-grid-layout/div/div[2]/ag-grid-angular/div/div[2]/div[2]/div[3]/div[";
    String Delete2 = "]/div[15]/div/app-aide-action-cell-renderer/div/button[2]";
    String Confirm_btn = "/html/body/modal-container/div[2]/div/app-modal-layout/div[3]/button[2]";

    public Lead homepage()throws InterruptedException {
        Thread.sleep(5000);
        el(By.xpath(lead_page)).click();
        return this;
    }

    public Lead addnew() throws InterruptedException {
        Thread.sleep(5000);
        el(By.xpath(addnew_btn)).click();
        return this;
    }

    public Lead Createnewform(ExtentTest extentTest,String firstName, String lastName , String phoneNumber, String email){

        el(By.id(first_name_filed)).fill().with(firstName);
        el(By.id(last_name_field)).fill().with(lastName);
        el(By.id(phonenmbr_field)).fill().with(phoneNumber);
        el(By.id(Email)).fill().with(email);

        el(By.xpath(save_btn)).click();
        return this;

    }

    public void deleteAide (String aidename) throws InterruptedException{
        FluentList<FluentWebElement> aides = find(By.cssSelector(Aide_column));
        Utils utils = newInstance(Utils.class);
        java.lang.String name_position = utils.getPositionInList(aides, aidename);
        Thread.sleep(10000);

        el(By.xpath(Delete1 + name_position + Delete2)).click();

        Thread.sleep(10000);
        el(By.xpath(Confirm_btn)).click();
    }

}
