package base;

import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import utils.ConfigReader;
import utils.ExtentManager;

public class BaseClass {

//    public static WebDriver driver;
//    public static Properties prop;
    public static WebDriver driver;
    public static Properties prop;

    @BeforeClass
    public void setup() {

        prop = ConfigReader.initProperties();
        String browser = prop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver=new EdgeDriver();


        }
        else
        {
         driver=new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
