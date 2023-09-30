import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber.html"},
        features = "C:\\LSA\\Projects\\MYFIRSTREPOSITORY\\AUGNEW23\\src\\test\\java\\feature",
        glue = {"browserControl","stepDefinitions"}, tags = "@hemali"


)

public class TestRunnerClass {

}
