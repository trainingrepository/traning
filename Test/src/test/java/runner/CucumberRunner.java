package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue="steps", 
monochrome=true,
publish=true,
tags="@regression and @smoke")

public class CucumberRunner extends BaseClass{

}
