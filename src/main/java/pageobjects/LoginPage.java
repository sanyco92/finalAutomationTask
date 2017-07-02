package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class LoginPage extends BasePage {

    @AndroidFindBy(xpath = "") //TODO: check
    @iOSFindBy(accessibility = "Email")
    private MobileElement emailField;

    @AndroidFindBy(id = "") //TODO: check
    @iOSFindBy(accessibility = "Password")
    private MobileElement passwordField;

    @AndroidFindBy(id = "") //TODO: check
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOG IN\"]")
    private MobileElement loginButton;

    @AndroidFindBy(id = "")
    @iOSFindBy(accessibility = "Create an account")
    private MobileElement createAccountButton;

    @AndroidFindBy(accessibility = "") //TODO: check
    @iOSFindBy(accessibility = "Maven")
    private MobileElement mavenLogo;

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void typeEmail(String email) {
        emailField.sendKeys(email);
    }

    public void typePassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public String getLogoText() {
        return mavenLogo.getText();
    }
}
