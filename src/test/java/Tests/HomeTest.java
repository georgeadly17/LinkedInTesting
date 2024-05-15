package Tests;

import org.example.Pages.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends TestBase{
    HomePage homePage;

    @Test
    public void TestHome (){
        homePage = new HomePage(driver);
        ;
    }
}
