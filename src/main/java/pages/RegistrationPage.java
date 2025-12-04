package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class RegistrationPage {
    public WebDriver driver;

    public  RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Register Now']")
    WebElement registerLink;
    @FindBy(xpath = "//input[@name=\"organizationName\"]")
    WebElement organizationname;
    @FindBy(xpath = "//input[@name='organizationWebsite']")
    WebElement organizationwebsite;
    @FindBy(xpath = "//*[@id=\":r3:\"]")
    WebElement oragnizationcountry;
    @FindBy(xpath = "//span[normalize-space()='Select Country']")
    WebElement countryOptions;
    @FindBy(xpath = "//li[@data-value=\"India\"]")
    WebElement India;

    //*[@id="menu-country"]/div[3]
    @FindBy(xpath = "//*[@id=\":r8e:\"]")
    WebElement state;
    @FindBy(xpath = "//input[@name=\"city\"]")
    WebElement city;
    @FindBy(xpath = "//input[@name=\"address\"]")
    WebElement address;
    @FindBy(xpath = "//input[@name=\"pincode\"]")
    WebElement pincode;

    @FindBy(xpath = "//input[@name=\"phoneNumber\"]")
    WebElement phoneNumber;
    @FindBy(xpath = "email")
    WebElement email;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement registerbutton;

    public void setOrganizationname() {
        organizationname.sendKeys("xyz");


    }

    public void clickregisterlink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(registerLink));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        registerLink.click();

    }

    public void setOrganizationwebsite() {
        organizationwebsite.sendKeys("xyz.com");
    }

    public void setOrganizationcountry() {
//        for (WebElement option : countryOptions) {
//            if (option.getText().equals("India")) {
//                option.click();
//                break;
//            }
        countryOptions.click();
        India.click();

//        Select select=new Select(countryOptions);
//        List <WebElement> countrylist=select.getOptions();
//        for (WebElement country : countrylist)
//        {
//         String countryname=   country.getText();
//            if (countryname.equals("India")) {
//
//                country.click();
//                break;
//            }
//        }
//        for(WebElement countryname:countryOptions)
//        {
//           String countrylist= countryname.getText();
//            System.out.println(countrylist);
//        }
        }


    }

