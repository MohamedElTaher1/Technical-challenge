package pages;

import coreElements.*;

import static Locators.L01_Login.*;

public class P01_Login {

    public static FormField Username = new FormField(usernameField);

    public static FormField Password = new FormField(passwordField);
    public static Button Login = new Button(LoginButton);

    public static Text SwagLabsLogo = new Text(CheckSwagLab);
    public static Text CheckError = new Text(ErrorMessage);
    public static Text UserNameError = new Text(UserNameRequiredErrorMessage);
    public static Text PasswordError = new Text(PasswordRequiredErrorMessage);


}