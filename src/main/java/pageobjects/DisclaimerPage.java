package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class DisclaimerPage extends BasePage {

    @AndroidFindBy(xpath = "") //TODO: ckeck
    @iOSFindBy(accessibility = "I disagree (Log me out)")
    private MobileElement disagreeButton;

    @AndroidFindBy(xpath = "") //TODO: check
    @iOSFindBy(accessibility = "I agree")
    private MobileElement agreeButton;

    public DisclaimerPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickAgreeButton() {
        agreeButton.click();
    }

    public void clickDisagreeButton() {
        disagreeButton.click();
    }

}
