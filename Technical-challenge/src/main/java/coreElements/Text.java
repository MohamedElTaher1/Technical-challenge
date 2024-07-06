package coreElements;

import com.shaft.driver.SHAFT;
import lombok.Setter;
import org.openqa.selenium.By;

public class Text {
    @Setter
    static SHAFT.GUI.WebDriver driver;
    By elementLocator;
    public Text(By locator) {
        elementLocator = locator;
    }
    public void validateCriticalTextExists(){
        driver.assertThat().element(elementLocator).exists().perform();
    }
    public void validateNonCriticalTextExists(){
        driver.verifyThat().element(elementLocator).exists().perform();
    }
    public String GetText(){
        return driver.element().getText(elementLocator);
    }
    public void ValidateTextContains(String expectedtext){
        driver.assertThat().element(elementLocator).text().contains(expectedtext).perform();
    }
}
