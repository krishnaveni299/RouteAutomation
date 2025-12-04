package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;

import java.time.Duration;

public class LoginPage {
    public WebDriver driver;
    WebDriverWait wait;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailId;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement enterPassword;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/form/button")
    WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/span")
    WebElement actual_header;
    public String getActualHeader()
    {
        // String header= actual_header.getText();
        return actual_header.getText();

    }
    public String setExpectedHeader()
    {
        String expected="Dashboard";
        return expected;
    }



    public void setUserName(String username) {
        wait.until(ExpectedConditions.visibilityOf(emailId));

        emailId.sendKeys(ConfigReader.getProperty(username));


    }

    public void setPassWord(String password) {
        wait.until(ExpectedConditions.visibilityOf(enterPassword));
        enterPassword.sendKeys(ConfigReader.getProperty(password));


    }
    public void clickButton() {
        signInButton.click();
    }
}