package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class SignUpPageStep2 extends BasePage {

    @AndroidFindBy(xpath = "") //TODO: check
    @iOSFindBy(accessibility = "Alternative email")
    private MobileElement altEmail;

    @AndroidFindBy(id = "") //TODO: check
    @iOSFindBy(accessibility = "Alternative phone number")
    private MobileElement altPhone;

    @AndroidFindBy(id = "") //TODO: check
    @iOSFindBy(accessibility = "Date of birth")
    private MobileElement dateOfBirth;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "Gender")
    private MobileElement genderField;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "Address")
    private MobileElement addressField;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "City")
    private MobileElement cityField;

    @AndroidFindBy(xpath = "") //TODO: check
    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Sign Up\"]/XCUIElementTypeButton")
    private MobileElement backButton;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "SIGN UP")
    private MobileElement signUpButton;


    public SignUpPageStep2(AppiumDriver<MobileElement> driver) {
        super(driver);

    }

    public void typeAlternativeEmail(String email) {
        altEmail.sendKeys(email);
    }

    public void typeAlternativePhone(String phone) {
        altPhone.sendKeys(phone);
    }

    public void selectDateOfBirth(String date) {
        dateOfBirth.sendKeys(date);
    }

    public void selectGender(String gender) {
        genderField.click();
        driver.findElementByAccessibilityId(gender).click();
    }

    public void typeAddress(String address) {
        addressField.sendKeys(address);
    }

    public void typeCity(String city) {
        cityField.sendKeys(city);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }
}
