package Tests;

import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage;

    @Test
    public void Login() throws InterruptedException {
        // Go to sign up page
        homePage= new HomePage(driver);
        homePage.LoginIn();
        homePage.sendKeysEmail("gorgeadly126@gmail.com");
        homePage.sendKeysPassword("George55557777@@#");

        Thread.sleep(20000);
        homePage.clickLoginBtn();
    }
}
