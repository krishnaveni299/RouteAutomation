package testcases;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class OrganizationRegistration extends BaseClass {
//

    @Test
    public void registrationdetails()
    {

        RegistrationPage registeration=new RegistrationPage(driver);
        registeration.clickregisterlink();
        registeration.setOrganizationname();
        registeration.setOrganizationwebsite();
       registeration.setOrganizationcountry();
    }

}