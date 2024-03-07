package basetest;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;

public class Task extends Base_page {

   String mainpage = "/html/body/app-root/app-login-layout/app-home-layout/app-header-layout/div";

   String addnew = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-task/div[2]/app-ag-grid-layout/div/div[1]/div[2]/button";
   String task_name = "TaskName";
   String related_to = "/html/body/modal-container/div[2]/div/app-modal-layout/div[2]/form/div[3]/div[1]";
   String patient = "name";
   String Date = "dueDate";
   String Add_btn = "/html/body/modal-container/div[2]/div/app-modal-layout/div[3]/button[2]";


   public Task main(){
      el(By.xpath(mainpage)).click();
      return this;

   }

   public Task addNew(){
      el(By.xpath(addnew)).click();

      return this;
   }

   public  Task newform(ExtentTest extentTest , java.lang.String taskName, String TaskName , String name , String dueDate){

      el(By.id(task_name)).fill().with(TaskName);
      el(By.xpath(related_to)).click();
      el(By.id(patient)).fill().with(name);
      el(By.id(Date)).fill().with(dueDate);


      el(By.xpath(Add_btn)).click();
      return this;



   }

}
