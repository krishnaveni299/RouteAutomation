package pages;
import org.apache.poi.ss.formula.functions.Address;
import org.openqa.selenium.By;
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

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Register Now']")
    WebElement registerLink;
    @FindBy(xpath = "//input[@name=\"organizationName\"]")
    WebElement organizationname;
    @FindBy(xpath = "//input[@name='organizationWebsite']")
    WebElement organizationwebsite;
//    @FindBy(xpath = "(//div[@role=\"combobox\"])[1]")
//    WebElement oragnizationcountry;"
//    @FindBy(xpath = "//*[@id=\"menu-country\"]/div[3]")
//    List<WebElement> countryOptions;
    @FindBy(xpath = " li[@role=\"option\"")//common for all the options
    List<WebElement> countrylist;
    @FindBy(xpath = "//*[@id=\":r3:\"]")
    WebElement oragnizationcountry;
    @FindBy(xpath = "//span[normalize-space()='Select Country']")
  //  @FindBy(xpath ="(//div[@role=\\\"combobox\\\"])[1]" )
    WebElement countryOptions;
    @FindBy(xpath = "//span[normalize-space()='Select State']")
    WebElement state;
//    @FindBy(xpath = "//li[@role=\"option\"]")
//   List<WebElement> statelist;
    @FindBy(xpath = "//input[@name=\"city\"]")
    WebElement city;
    @FindBy(xpath = "//input[@name=\"address\"]")
    WebElement address;
    @FindBy(xpath = "//input[@name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath = "//input[@name=\"contactName\"]")
    WebElement contactname;
    @FindBy(xpath = "//input[@name=\"phoneNumber\"]")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@name=\"email\"]")
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
        js.executeScript("arguments[0].scrollIntoView(true);", registerLink);
        js.executeScript("arguments[0].click();", registerLink);

    }

    public void setOrganizationwebsite()
    {
        organizationwebsite.sendKeys("xyz.com");
    }

    public void setOrganizationcountry()
    {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(countryOptions)).click();
        List<WebElement> countrylist1=driver.findElements(By.xpath("//li[@role=\"option\"]"));

        for(WebElement country : countrylist1)
        {
           String countryname= country.getText();
            if(countryname.equals("India"))
            {
                country.click();
                break;
            }
        }


    }

    public void setOrganizationstate()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(state)).click();
        List<WebElement> statelist=driver.findElements(By.xpath("//li[@role=\"option\"]"));
        for(WebElement stateoption : statelist)
        {
            String statename= stateoption.getText();
            if(statename.equals("India"))
            {
                stateoption.click();
                break;
            }
        }


    }
    public void setOrganizationcity()
    {
        city.sendKeys("Bangalore");
        // countryOptions.click();

    }
    public void setAddress()
    {
        address.sendKeys("aaa");
        // countryOptions.click();

    }
    public void setPincode()
    {
        pincode.sendKeys("560098");
    }
    public void setPhoneNumber()
    {
        phoneNumber.sendKeys("9807654377");
    }
    public void setEmail()
    {
        email.sendKeys("sam@yopmail.com");
    }
    public void clickregisterbutton()
    {
        registerbutton.click();
    }
    public void setContactname()
    {
        contactname.sendKeys("lmn");
    }



}

