package Tests;

import org.example.Pages.FindJobPage;
import org.example.Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class FindJobTest extends TestBase{

    HomePage homePage;
    FindJobPage findJobPage;

    @Test
    public void findJob () throws InterruptedException {
        homePage = new HomePage(driver);
        // Go to find job page:
        scroll("0","1050");
        homePage.clickFindJobBtn();

        // In Find Job Page:
        Thread.sleep(5000);
        findJobPage = new FindJobPage(driver);
        scroll("0","2000");
        findJobPage.clickApplyBtn();
        scroll("0","3500");
        findJobPage.clickJobBtn();
        findJobPage.clickStartFormBtn();
        Thread.sleep(5000);
    }
}
