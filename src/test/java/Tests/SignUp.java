package Tests;

import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import org.example.Pages.SignupPage;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SignUp extends TestBase{
    HomePage homePage;
    SignupPage signupPage;

   @Test
    public void sinUp (){

       // Go to sign up page
       homePage= new HomePage(driver);
       homePage.LoginIn();
       homePage.createAccount();

       // send last and first name
       signupPage = new SignupPage(driver);
       signupPage.sendKeysFirstName("George");
       signupPage.sendKeysLastName("Kamel");

       // send email and password
       signupPage.sendKeysEmail("georgeadlykamel@gmail.com");



   }



}
