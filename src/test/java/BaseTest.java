import capabilities.Capabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class BaseTest {
    static AppiumDriver<MobileElement> driver;
    static WebDriverWait wait;
    public Platform platform = Platform.IOS;


    enum Platform {
        IOS,
        ANDROID
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        if (platform.equals(Platform.IOS)) {
            Capabilities capabilities = new Capabilities();
            driver = new IOSDriver<MobileElement>(capabilities.getServerURL(), capabilities.getIOSCapabilities());

        } else if (platform.equals(Platform.ANDROID)) {
            Capabilities capabilities = new Capabilities();
            driver = new AndroidDriver<MobileElement>(capabilities.getServerURL(), capabilities.getAndroidCapabilities());
        }
        driver.manage().timeouts().implicitlyWait(20, SECONDS);
        driver.findElementByAccessibilityId("Allow").click();
    }

    @AfterMethod
    public void tearDown() {
    }
}