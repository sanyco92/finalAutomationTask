package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class MainPage extends BasePage {

    @AndroidFindBy(xpath = "") //TODO: ckeck
    @iOSFindBy(accessibility = "OVERVIEW")
    private MobileElement overviewTab;

    public MainPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public boolean overviewTabDisplayed() {
        return overviewTab.isDisplayed();
    }

}
