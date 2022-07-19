package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
features = {"C:\\Users\\MDSHKHAN\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\Feature\\LoginPage.feature"},
glue = {"C:\\Users\\MDSHKHAN\\eclipse-workspace\\CucumberMakeMyTrip\\src\\test\\java\\StepDefination\\LoginStep.java"},
monochrome = true,
dryRun=true,
plugin = {"pretty" ,
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
publish = true
)

public class MyTestRunner {

}
