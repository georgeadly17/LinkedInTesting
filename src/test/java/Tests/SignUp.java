package Tests;

import org.example.Pages.LoginPage;
import org.example.Pages.SignupPage;
import org.testng.annotations.Test;

public class SignUp extends TestBase{
    LoginPage loginPage;
    SignupPage signupPage;

    @Test
    public void SignUP (){
        loginPage = new LoginPage(driver);
        loginPage.ClickSignButton();
        signupPage = new SignupPage(driver);
        signupPage.sendKeysToEmail("georgeadlykamel@gmail.com");
        signupPage.sendKeysToPassword("GeorgeAdly2002@@");
        signupPage.clickSubmit();
    }
}
