package testcases;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTC01 extends BaseClass {
    @Test
    public void loginwithvalidcredentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("username");
        Thread.sleep(3000);
        loginPage.setPassWord("password");
        Thread.sleep(3000);
        loginPage.clickButton();
        Assert.assertEquals(loginPage.getActualHeader(),loginPage.setExpectedHeader());

    }

    @Test
    public void loginwithinvalidcredentials() throws InterruptedException {
        LoginPage loginPage1 = new LoginPage(driver);
        loginPage1.setUserName("invalid_username" );
        Thread.sleep(3000);
        loginPage1.setPassWord("password");
        Thread.sleep(3000);
        loginPage1.clickButton();

    }
       @Test
    public void loginwithblankcredentials() throws InterruptedException {
        LoginPage loginPage2 = new LoginPage(driver);
        loginPage2.setUserName("blank_username" );
        Thread.sleep(3000);
        loginPage2.setPassWord("blank_password");
        Thread.sleep(3000);
        loginPage2.clickButton();

    }
}