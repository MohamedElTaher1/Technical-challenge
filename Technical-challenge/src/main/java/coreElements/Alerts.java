package coreElements;

import com.shaft.driver.SHAFT;
import lombok.Setter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

public class Alerts {
    @Setter
    static SHAFT.GUI.WebDriver driver;

    private void WaitAlert(){
        Wait<WebDriver> wait =
                new FluentWait<>(driver.getDriver())
                        .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofMillis(300))
                        .ignoring(NoAlertPresentException.class);

        wait.until(
                d -> {
                    driver.getDriver().switchTo().alert();
                    return true;
                });
    }
    public void AcceptAlert(){
        WaitAlert();
        driver.getDriver().switchTo().alert().accept();
    }
    public void ConfirmAlertMessage(String expectedMessage){
        WaitAlert();
        Alert confirmAlert = driver.getDriver().switchTo().alert();
        String alertText = confirmAlert.getText();
        Assert.assertEquals(alertText,expectedMessage);
    }
}
