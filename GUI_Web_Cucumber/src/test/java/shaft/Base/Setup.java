package shaft.Base;

import com.shaft.driver.SHAFT;
import io.appium.java_client.touch.offset.ElementOption;
import org.testng.annotations.Test;

public class Setup {

    public static SHAFT.GUI.WebDriver driver;

    @Test
    public static SHAFT.GUI.WebDriver setUp(String url) {
     driver = new SHAFT.GUI.WebDriver();
    driver.browser().navigateToURL(url);
    driver.browser().getCurrentURL();
    return driver;
    }

}
