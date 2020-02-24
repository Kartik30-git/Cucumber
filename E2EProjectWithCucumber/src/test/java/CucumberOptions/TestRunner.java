package CucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;   //I DON'T KNOW FOR WHAT REASON ECLIPSE CANNTO AUTO IMPORT THIS PACKAGE
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith and @CucumberOptions are used. Location of Feature Files and Step Definitions needs to be passed to Cucumber Options.
//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features", glue = "StepDefinitions") // You need to specify the whole path
																				// for Features. Mention the file name
																				// also if you want to run specific
																				// feature file. Only the package name
																				// needs to be passed for Step
																				// Definitions
public class TestRunner extends AbstractTestNGCucumberTests{

}
