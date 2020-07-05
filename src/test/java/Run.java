import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="." ,dryRun = false , strict = true ,format = {"pretty","html:test-out","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"})
public class Run {
}
