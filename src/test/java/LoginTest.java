import api.HttpRunner;
import org.junit.Assert;
import org.testng.annotations.Test;
import pageobjects.DisclaimerPage;
import pageobjects.LoginPage;
import pageobjects.MainPage;
import pageobjects.TutorialPages;
import java.io.IOException;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class LoginTest extends BaseTest {

    private static String EMAIL1 = "maventests+patient+1@gmail.com";
    private static String EMAIL2 = "maventests+patient+2@gmail.com";
    private static String EMAIL3 = "maventests+patient+3@gmail.com";
    private static String EMAIL4 = "maventests+patient+4@gmail.com";
    private static String EMAIL5 = "maventests+patient+5@gmail.com";
    private static String PASSWORD = "Password11";

    @Test
    public void LoginWithValidCredentials() throws IOException {

        HttpRunner runner = new HttpRunner();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeEmail(EMAIL5);
        loginPage.typePassword(PASSWORD);
        loginPage.clickLoginButton();
        DisclaimerPage disclaimerPage = new DisclaimerPage(driver);
        if (runner.CheckMustConfirmSafetyInfo(EMAIL5, PASSWORD) == true) {
            disclaimerPage.clickAgreeButton();
        }

        TutorialPages tutorialPages = new TutorialPages(driver);
        tutorialPages.clickSkip();
        tutorialPages.clickSkip();

        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.overviewTabDisplayed());
    }
}
