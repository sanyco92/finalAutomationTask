package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class TutorialPages extends BasePage {

    @AndroidFindBy(xpath = "") //TODO: check
    @iOSFindBy(accessibility = "Skip")
    private MobileElement skipButton;


    public TutorialPages(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickSkip() {
        skipButton.click();
    }

}
