package StepDefinitions4;

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
//set the correct path to features


//run many features with many stepDefinition files:
//@CucumberOptions(features="src/test/resources/Features/",
//path of my step definitions file
//glue={"StepDefinitions4","StepDefinitions"},

@CucumberOptions(features="src/test/resources/Features/Datatable2.feature",
//path of my step definitions file
glue={"StepDefinitions4"},
//get readable logs, delete the djang characters
monochrome=true,
//dryrun is used to help debug 
//dryRun=false,
//display report
plugin = {"pretty","html:target/HtmlReports"}
//plugin = {"pretty","json:target/JSONReport/report.json"}
//plugin = {"pretty","junit:target/JuNITReports/report.xml"}
//tags="@smoke"
	)
public class TestRunner {
}