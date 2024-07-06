package Locators;

import org.openqa.selenium.By;

public class L01_Login {

    /**
     * Fields
     * **/
    public static By usernameField = By.id("user-name");

    public static By passwordField = By.id("password");

    /**
     * Buttons
     * **/
    public static By LoginButton = By.id("login-button");

    public static By CheckSwagLab = By.xpath("//div[contains(text(), 'Swag Labs')]");
    public static By ErrorMessage = By.xpath("//div[contains(@class, 'error-message-container error')]/h3[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]");
    public static By UserNameRequiredErrorMessage = By.xpath("//div[contains(@class, 'error-message-container error')]/h3[contains(text(), 'Epic sadface: Username is required')]");
    public static By PasswordRequiredErrorMessage = By.xpath("//div[contains(@class, 'error-message-container error')]/h3[contains(text(), 'Epic sadface: Password is required')]");

}
