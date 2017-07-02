package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class SignUpPageFinalStep extends BasePage {

    @AndroidFindBy(xpath = "") //TODO: check
    @iOSFindBy(accessibility = "LOG IN")
    private MobileElement loginButton;

    public SignUpPageFinalStep(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
