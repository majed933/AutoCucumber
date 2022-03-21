package StepDefinitions;

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
//set the correct path to features
@CucumberOptions(features="src/test/resources/Features/Facebook.feature",
//path of my step definitions file
glue={"StepDefinitions"},
//get readable logs, delete the djang characters
monochrome=true,
//dryrun is used to help debug 
//dryRun=false,
//display report
plugin = {"pretty","html:target/HtmlReports"}
//plugin = {"pretty","json:target/JSONReport/report.json"}
//plugin = {"pretty","junit:target/JuNITReports/report.xml"}
//tags="@smoketest"
	)
public class TestRunner {
}