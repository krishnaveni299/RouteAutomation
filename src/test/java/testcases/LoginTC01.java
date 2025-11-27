package testcases;

import base.BaseClass;
import utils.ConfigReader;
import org.testng.annotations.*;
import pages.LoginPage;


public class LoginTC01 extends BaseClass {


    @Test
    public void loginwithvalidcredentials() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setUserName(prop.getProperty("username"));
        loginPage.setPassWord(prop.getProperty("password"));
        loginPage.clickButton();


    }
//    @DataProvider(name="logintestdata")
//     Object[][] getData() {
//         Object[][] testdata = {{"irisidea@gmail.com", "irisidea@"}, {"Sales@routeeye.io", "sales@"}, {" ", "irisidea@"}};
//         return testdata;
//     }
}
