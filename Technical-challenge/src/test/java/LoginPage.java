import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DriverManager;

import static pages.P01_Login.*;

public class LoginPage extends DriverManager {



   @Test
    public void CheckFieldsExist() {

        Username.validateCriticalElementExist();
        Password.validateCriticalElementExist();
        Login.validateCriticalElementExist();
    }

    @Test
    public void ValidCredentials(){
    Username.enterText("standard_user");
    Password.enterText("secret_sauce");
    Login.click();
    SwagLabsLogo.validateCriticalTextExists();
}
    @Test
    public void InValidCredentials(){
        Username.enterText("mohamed");
        Password.enterText("123");
        Login.click();
        CheckError.validateCriticalTextExists();
        
    }
    @Test
    public void EmptyCredentials(){
        Username.enterText("mohamed");
        Login.click();
        PasswordError.validateCriticalTextExists();
        Username.ClearText();
        Password.enterText("123");
        Login.click();
        UserNameError.validateCriticalTextExists();
        Password.ClearText();
    }
}