package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;

public class Marketing extends Base_page {

    String marketing_page = "/html/body/app-root/app-login-layout/app-home-layout/app-header-layout/div";
    String add_new = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-patient/div[3]/app-ag-grid-layout/div/div[1]/div[2]/button[2]";

    String first_name_filed = "firstName";

    String last_name_field = "lastName";

    String cellphone_field = "cellPhone";

    String save_button = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-patient/app-patient-form-sidebar/div/form/div[2]/button[2]";

    String patient_column = "[col-id='FirstName']";


    String delete1 = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-patient/div[3]/app-ag-grid-layout/div/div[2]/ag-grid-angular/div/div[2]/div[2]/div[3]/div[";

    String delete2= "]/div[1]/div/app-patient-action-cell-renderer/div/button[2]";

    String  confirm_btn = "/html/body/modal-container/div[2]/div/app-modal-layout/div[3]/button[2]";

    public Marketing Homepage(){
        el(By.xpath(marketing_page)).click();
        return this;
    }
    public Marketing AddNew() {

        el(By.xpath(add_new)).click();
        return this;

    }

    public Marketing Createpatientform(ExtentTest extentTest, String firstName,String lastName,String cellPhone){

        el(By.id(first_name_filed)).fill().with(firstName);
        el(By.id(last_name_field)).fill().with(lastName);
        el(By.id(cellphone_field)).fill().with(cellPhone);

        el(By.xpath(save_button)).click();
        return this;

    }

    public String getallpatientname(String patientname) throws InterruptedException{

        FluentList<FluentWebElement> names = find(By.cssSelector(patient_column));
        Utils utils = newInstance(Utils.class);
        return utils.getPositionInList2(names , patientname);

    }

    public void deletepatient (String patientname) throws InterruptedException{
        FluentList<FluentWebElement> patients = find(By.cssSelector(patient_column));
        Utils utils = newInstance(Utils.class);
        java.lang.String name_position = utils.getPositionInList(patients, patientname);
        Thread.sleep(10000);

        el(By.xpath(delete1 + name_position + delete2)).click();

        Thread.sleep(10000);
        el(By.xpath(confirm_btn)).click();
    }
}
