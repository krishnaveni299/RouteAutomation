package pages;

import net.bytebuddy.implementation.bind.annotation.This;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailId;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement enterPassword;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/form/button")
    WebElement signInButton;


    public void setUserName(String userName) {
        emailId.sendKeys(userName);


    }

    public void setPassWord(String passWord) {
        enterPassword.sendKeys(passWord);


    }
    public void clickButton() {
        signInButton.click();


    }
}

