package browserControl;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberHooks extends WebConnector {
    @Before
    public void setup() {
        openBrowser();
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take a screenshot
            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            // embed it in the report
            scenario.attach(screenshot, "image/png", scenario.getName().replace(" ", "_") + "_ErrorScreenshot");
        }
        closeBrowser();
    }
}

