package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.ConfigReader;

import java.time.Duration;


public class BaseClass {
    public WebDriver driver;
    @BeforeMethod
    public void launchbrowser()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));
        //driver.get("https://dev.routeeye.io/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void quitbrowser()
    {
       // driver.quit();
    }


}