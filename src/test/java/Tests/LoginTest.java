package Tests;

import org.example.Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage;

   @Test
   public void Login() throws InterruptedException {
       loginPage = new LoginPage(driver);
       loginPage.sendKeyToEmail("georgeAdly@gmail.com");

       Thread.sleep(3000);
   }
}
