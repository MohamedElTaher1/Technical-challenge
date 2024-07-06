package coreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FormField extends Element{

    public FormField(By locator) {
        super(locator);
    }

    public void enterText(String text){
        driver.element().type(elementLocator, text);
    }
    public String getText(){
        return driver.element().getText(elementLocator);
    }
    public void validateCriticalField(String expectedValue){
        driver.assertThat().element(elementLocator).text()
                .isEqualTo(expectedValue).perform();
    }
    public void validateNonCriticalField(String expectedValue){
        driver.verifyThat().element(elementLocator).text()
                .isEqualTo(expectedValue).perform();
    }
    public void ClearText() {
        driver.element().keyPress(elementLocator, Keys.valueOf(Keys.chord(Keys.LEFT_ALT, "a", Keys.DELETE)));
    }
}
