import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.SignUpPage;
import pageobjects.SignUpPageFinalStep;
import pageobjects.SignUpPageStep2;

import java.util.Random;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class SignUpTest extends BaseTest {

    public static int MAX_RANDOM_VALUE = 100;
    public static String FIRST_NAME = "TestFirstName";
    public static String LAST_NAME = "TestLastName";
    public static String EMAIL = "@gmail.com";
    public static String ALT_EMAIL = "@gmail.com";
    public static String PASSWORD = "Qqqqqqq1";
    public static String MOBILE_NUMBER = "0505555555";
    public static String DIAGNOSIS = "Hemophilia A";
    public static String COUNTRY = "Ukraine";
    public static String ALT_MOBILE_NUMBER = "0504444444";
    public static String GENDER = "Male";
    public static String ADDRESS = "Name St. 24";
    public static String CITY = "Kyiv";


    @Test
    public User PositiveFullSignUp() {
        int randomNumber = generateRandomNumber();
        User user = new User(
                randomNumber,
                FIRST_NAME,
                LAST_NAME,
                EMAIL,
                PASSWORD,
                MOBILE_NUMBER,
                ALT_EMAIL,
                ALT_MOBILE_NUMBER,
                ADDRESS,
                CITY);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickCreateAccountButton();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.typeFirstName(user.getFirstName() + randomNumber);
        signUpPage.typeLastName(user.getLastName() + randomNumber);
        signUpPage.typeEmail(user.getFirstName() + randomNumber + user.getEmail());
        signUpPage.typePassword(user.getPassword());
        signUpPage.setDiagnosis(DIAGNOSIS);
        signUpPage.setCountry(COUNTRY);
        signUpPage.typeMobileNumber(user.getMobileNumber());
        signUpPage.clickContinueButton();

        SignUpPageStep2 signUpPageStep2 = new SignUpPageStep2(driver);
        signUpPageStep2.typeAlternativeEmail(user.getFirstName() + generateRandomNumber() + user.getAltEmail());
        signUpPageStep2.typeAlternativePhone(user.getAltPhoneNumber());
        signUpPageStep2.selectGender(GENDER);
        signUpPageStep2.typeAddress(user.getAddress());
        signUpPageStep2.typeCity(user.getCity());
        signUpPageStep2.clickSignUpButton();

        SignUpPageFinalStep signUpPageFinalStep = new SignUpPageFinalStep(driver);
        signUpPageFinalStep.clickLoginButton();
        Assert.assertEquals(loginPage.getLogoText(), "Maven");
        return user;
    }

    @Test
    public User PositivePartialSignUp() {
        int randomNumber = generateRandomNumber();
        User user = new User(
                randomNumber,
                FIRST_NAME,
                LAST_NAME,
                EMAIL,
                PASSWORD,
                MOBILE_NUMBER,
                ALT_EMAIL,
                ALT_MOBILE_NUMBER,
                ADDRESS,
                CITY);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickCreateAccountButton();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.typeFirstName(FIRST_NAME + randomNumber);
        signUpPage.typeLastName(LAST_NAME + randomNumber);
        signUpPage.typeEmail(FIRST_NAME + randomNumber + EMAIL);
        signUpPage.typePassword(PASSWORD);
        signUpPage.setDiagnosis(DIAGNOSIS);
        signUpPage.setCountry(COUNTRY);
        signUpPage.typeMobileNumber(MOBILE_NUMBER);
        signUpPage.clickContinueButton();

        SignUpPageStep2 signUpPageStep2 = new SignUpPageStep2(driver);
        signUpPageStep2.clickSignUpButton();

        SignUpPageFinalStep signUpPageFinalStep = new SignUpPageFinalStep(driver);
        signUpPageFinalStep.clickLoginButton();
        Assert.assertEquals(loginPage.getLogoText(), "Maven");
        return user;
    }

    public Integer generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_RANDOM_VALUE);
    }
}
