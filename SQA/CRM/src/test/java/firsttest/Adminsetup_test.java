package firsttest;

import basetest.*;
import com.aventstack.extentreports.ExtentTest;


import com.aventstack.extentreports.Status;

import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.junit.Test;
import org.openqa.selenium.By;

public class Adminsetup_test extends Base_test {


    String fullName = "Mazhar";
    String lastName = "Shanto";
    String cellPhone = "0123456789";
    String email = "shanto.datavanced@test.com";
    String phoneNumber = "1234567890";
    String userName = "shanto_new_user";
    String patient_name = "Mazhar Shanto";

    String aide_name = "Mazhar Shanto";

    String password = "1234";

    String role = "Admin";

    String TaskName = "new Task";
    String name = "Annaa";
    String dueDate = "12/12/22";
    String RelatedTo = "patient";
    String menu_sub_item= "[class='menu-sub-item']";
    String menu1 = "/html/body/app-root/app-login-layout/app-home-layout/app-sidebar-layout/div/div/div[2]/ul/li[2]/ul/li[";

    String menu2 = "]/a";
    String submenu = "/html/body/app-root/app-login-layout/app-home-layout/app-sidebar-layout/div/div/div[2]/ul/li[2]/ul/li";
    String patient_column = "[col-id='FirstName']";

    String department_column = "department-card";

    String taglist = "tag-card";
    String dpt_btn1 = "/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/div/div[2]/app-admin-setup-tags/div/div/div/div[";
     String   dpt_btn2 =   "]/div[2]/div/span";
     String position = "";

    String dpt_list = "dropdown-menu";




    @Test
    public void createSystemUser() throws InterruptedException {
        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Admin setup Set User Test", "This is a test to Go to Admin setup page and create user form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();
        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoAdminSetup();

//        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/ul/li[1]/a")));

        Adminsetup_page adminSetupPage = newInstance(Adminsetup_page.class);
        adminSetupPage.Setuserpage(extentTest);

        Setuser_page setuser_page = newInstance(Setuser_page.class);
        setuser_page
                .Addnew()
                .completeuserform(extentTest, fullName, email, phoneNumber,
                        userName, password, role, true)
                .Submit();


        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(5000);
    }

    @Test

    public void deletesystemuser() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest(" User Delete  Test", "This is a test to Go to Admin setup page and Delete System  user form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();
        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoAdminSetup();

//        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/ul/li[1]/a")));

        Adminsetup_page adminSetupPage = newInstance(Adminsetup_page.class);
        adminSetupPage.Setuserpage(extentTest);

        Setuser_page setuser_page = newInstance(Setuser_page.class);
        setuser_page
                .deletesystemuser(userName);

        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(5000);


    }

    @Test
    public void createRole() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Set permission Test", "This is a test to Go to Admin setup page and Delete System  user form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();
        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoAdminSetup();

//        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/ul/li[1]/a")));

        Adminsetup_page adminSetupPage = newInstance(Adminsetup_page.class);
        adminSetupPage.Setpermission(extentTest);

        Thread.sleep(5000);

        SetPermision_page setPermision_page = newInstance(SetPermision_page.class);
        setPermision_page
                .getcreaterole()
                .createnewrole("Create role test");


        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(5000);

    }


    @Test
    public void deleteRole() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Set permission Delete Role Test", "This is a test to Go to Admin setup page and Delete System  user form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();
        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoAdminSetup();

//        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-login-layout/app-home-layout/main/div/app-admin-setup/div/div/ul/li[1]/a")));

        Adminsetup_page adminSetupPage = newInstance(Adminsetup_page.class);
        adminSetupPage.Setpermission(extentTest);

        Thread.sleep(5000);

        SetPermision_page setPermision_page = newInstance(SetPermision_page.class);
        setPermision_page
                .deleterole("Create role test");

        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(5000);


    }

    @Test
    public void Createmarketingform() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Marketing Department", "This is a test to Create New Patient Form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();

        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoPatient();

        P_SubMenu p_subMenu = newInstance(P_SubMenu.class);
        p_subMenu.gotoMarketing(extentTest);

        Thread.sleep(5000);

        Marketing marketing = newInstance(Marketing.class);
        marketing
                .Homepage().AddNew().Createpatientform(extentTest, fullName, lastName, cellPhone);

        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(5000);


    }

    @Test
    public void deletepatientname() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Marketing Department", "This is a test to Create New Patient Form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();

        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoPatient();

        P_SubMenu p_subMenu = newInstance(P_SubMenu.class);
        p_subMenu.gotoMarketing(extentTest);

        Thread.sleep(10000);

        Marketing marketing = newInstance(Marketing.class);
        marketing
                .deletepatient(patient_name);

        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(10000);

    }

    @Test
    public void PatientList() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Marketing Department", "This is a test to Create New Patient Form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();

        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoPatient();

        FluentList<FluentWebElement> elementFluentList =find(By.cssSelector(menu_sub_item));
        Utils utils = newInstance(Utils.class);

        for (int i= 0; i < elementFluentList.size(); i++) {


            int serial = i+1;

           FluentWebElement element = elementFluentList.get(i);

           System.out.println(element.text());

            Thread.sleep(5000);
            System.out.println( el(By.xpath(menu1 + serial + menu2)).click());

            el(By.xpath(menu1 + serial + menu2)).click();

            Thread.sleep(30000);

            FluentList<FluentWebElement> elements1 = find(By.cssSelector(patient_column));

            utils.printPatientList(elements1);

        }
        Thread.sleep(5000);

    }

    @Test
    public void departmentlist() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Marketing Department", "This is a test to Create New Patient Form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

         login();

        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoAdminSetup();
        Thread.sleep(10000);

        Adminsetup_page adminSetupPage = newInstance(Adminsetup_page.class);
        adminSetupPage.Setdepartment(extentTest);
        Thread.sleep(10000);

        FluentList<FluentWebElement> elements = find(By.className(department_column));
        System.out.println("elements: "+ elements.texts());

       for (int i = 0; i < elements.size(); i++) {

        System.out.println("department name: "+elements.find(By.xpath("./div[1]")).get(i).text());
           System.out.println("department description: "+elements.find(By.xpath("./div[2]")).get(i).text());
        }


    }

    @Test
    public void Taglist() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Marketing Department", "This is a test to Create New Patient Form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();

        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoAdminSetup();
        Thread.sleep(20000);

        Adminsetup_page adminSetupPage = newInstance(Adminsetup_page.class);
        adminSetupPage.tags(extentTest);

        Thread.sleep(20000);
        FluentList<FluentWebElement> elements = find(By.className(taglist));


        for (int i = 0; i < elements.size(); i++) {

            System.out.println("Tags  name: " + i + elements.find(By.xpath("./div[1]")).get(i).text());
            System.out.println("department : " + elements.find(By.xpath("./div[2]")).get(i).text());

            try {
                find(By.xpath(dpt_btn1 + (i + 1) + dpt_btn2)).click();
                Thread.sleep(2000);
                System.out.println("department list: " + elements.find(By.xpath("./div[2]/div/span/ul/li")).texts());


            }
            catch (Exception e){
                System.out.println("somthing wrong");
            }

        }
    }

    @Test
    public void CreateLeadform() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Lead Department", "This is a test to Create New Patient Form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();

        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoCaregiver();

        Thread.sleep(5000);

        C_SubMenu c_subMenu = newInstance(C_SubMenu.class);
        c_subMenu.gotoLead(extentTest);


        Thread.sleep(5000);

        Lead lead = newInstance(Lead.class);
        lead
                .homepage().addnew().Createnewform(extentTest, fullName, lastName, phoneNumber, email);


        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(5000);

    }


    @Test
    public void deleteaide() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Lead Department", "This is a test to Create New Patient Form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();

        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoCaregiver();

        Thread.sleep(5000);

        C_SubMenu c_subMenu = newInstance(C_SubMenu.class);
        c_subMenu.gotoLead(extentTest);


        Thread.sleep(5000);

        Lead lead = newInstance(Lead.class);
        lead
                .deleteAide(aide_name);


        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(10000);

    }



    @Test
    public void CreateTaskform() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Task Department", "This is a test to Create New Patient Form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();

        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoTask(extentTest);
        Thread.sleep(5000);

        Task task = newInstance(Task.class);
        task
                .main().addNew().newform(extentTest, TaskName, name, dueDate, RelatedTo);

        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(5000);

    }


    @Test
    public void Createnewcontactform() throws InterruptedException {

        // Start a new test and log test details
        Base_test.extentTest = Base_test.extentReports.createTest("Task Department", "This is a test to Create New Patient Form");
        extentTest.log(Status.INFO, "Test started");
        extentTest.log(Status.INFO, "Test data<br>Name: '" + fullName + "'<br>mail: '" + email + "'<br>number:'" + phoneNumber + '"');

        login();


        SideMenu sideMenu = newInstance(SideMenu.class);
        sideMenu.gotoMessaging(extentTest);
        Thread.sleep(5000);

        Messaging messaging = newInstance(Messaging.class);
        messaging.Contactlist(extentTest);
        Thread.sleep(5000);


        Contact contact = newInstance(Contact.class);
        contact
                .home_page().AddContact().createnewcontact(extentTest, fullName, lastName,  email, phoneNumber);

        // Log test status and details
        extentTest.log(Status.PASS, "Test passed");

        // Wait for the page to finish loading
        Thread.sleep(5000);
    }
}






