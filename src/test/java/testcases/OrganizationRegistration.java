package testcases;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class OrganizationRegistration extends BaseClass {
//

    @Test
    public void registrationdetails() throws InterruptedException {

        RegistrationPage registeration=new RegistrationPage(driver);
        registeration.clickregisterlink();
        registeration.setOrganizationname();
        registeration.setOrganizationwebsite();
       registeration.setOrganizationcountry();
      registeration.setOrganizationstate();
//       registeration.setOrganizationcity();
//       registeration.setPhoneNumber();
//       registeration.setAddress();
//       registeration.setPincode();
//        registeration.setContactname();
//       registeration.setEmail();
//       registeration.clickregisterbutton();


    }

}