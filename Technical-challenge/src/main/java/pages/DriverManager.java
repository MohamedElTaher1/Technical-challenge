package pages;

import com.shaft.driver.SHAFT;
import coreElements.Alerts;
import coreElements.Element;
import coreElements.Text;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DriverManager {
    public static SHAFT.GUI.WebDriver driver;
@BeforeMethod
    public static void startDriverSession(){
        String siteURL = "https://www.saucedemo.com/";
        String siteTitle = "Swag Labs";
        // Create new driver object
        driver = new SHAFT.GUI.WebDriver();
        Element.setDriver(driver);
        Text.setDriver(driver);
        Alerts.setDriver(driver);
        // Go to the website
        driver.browser().navigateToURL(siteURL);
        // To ensure that the site loaded and there is no problem in the connection
        driver.verifyThat().browser().title().isEqualTo(siteTitle).perform();
    }
@AfterMethod
    public static void EndDriverSession(){
        // Quit the WebDriver instance
        driver.quit();
    }
}
