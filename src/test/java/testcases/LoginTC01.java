package testcases;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelUtil;

public class LoginTC01 extends BaseClass {
    @Test(dataProvider ="logindata")

    public void loginwithvalidcredentials(String Email,String Password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName(Email);
        Thread.sleep(3000);
        loginPage.setPassWord(Password);
        Thread.sleep(3000);
        loginPage.clickButton();
        Assert.assertEquals(loginPage.getActualHeader(),loginPage.setExpectedHeader());

    }

    @DataProvider
    Object[][] logindata()
    {
        return ExcelUtil.getTestData("LoginTest");
    }
}