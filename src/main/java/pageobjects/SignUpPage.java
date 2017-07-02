package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class SignUpPage extends BasePage {

    @AndroidFindBy(xpath = "") //TODO: check
    @iOSFindBy(accessibility = "First Name")
    private MobileElement firstNameField;

    @AndroidFindBy(id = "") //TODO: check
    @iOSFindBy(accessibility = "Last Name")
    private MobileElement lastNameField;

    @AndroidFindBy(id = "") //TODO: check
    @iOSFindBy(accessibility = "Email")
    private MobileElement emailField;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "Password")
    private MobileElement passwordField;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "Confirm Password")
    private MobileElement confirmPasswordField;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "Diagnosis")
    private MobileElement diagnosis;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "Country")
    private MobileElement country;

    @AndroidFindBy(xpath = "") //TODO: check
    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Country\"]/XCUIElementTypeButton")
    private MobileElement backButton;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "Mobile Number")
    private MobileElement mobileNumberField;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "CONTINUE")
    private MobileElement continueButton;


    public SignUpPage(AppiumDriver<MobileElement> driver) {
        super(driver);

    }

    public void typeFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void typeLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void typeEmail(String email) {
        emailField.sendKeys(email);
    }

    public void typePassword(String password) {
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
    }

    public void setDiagnosis(String diagnosisValue) {
        diagnosis.click();
        driver.findElementByAccessibilityId(diagnosisValue).click();
    }

    public void setCountry(String countryValue) {
        country.click();
        driver.findElementByAccessibilityId(countryValue).click();
        backButton.click();
    }

    public void typeMobileNumber(String mobileNumber) {
        mobileNumberField.sendKeys(mobileNumber);
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
