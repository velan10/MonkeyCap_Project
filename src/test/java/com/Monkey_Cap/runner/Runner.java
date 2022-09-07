package com.Monkey_Cap.runner;

import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Monkey_Cap.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/Monkey_Cap/features/TestCases.feature", 
				  glue = "com/Monkey_Cap/stepDefinitions", 
				  plugin = {"html:target/cucumber-html-reports",
						    "json:target/cucumber-json.json", 
						    "junit:target/cucumber-reports/cucumber-xml.xml",
						    "pretty"},
				  monochrome = true, 
				  strict = true, 
				  dryRun = false
)

public class Runner extends Baseclass{
	protected static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		Baseclass.readPropertyFile();
		Baseclass.setExtentReport();
		Baseclass.setBrowser(Baseclass.prop.getProperty("browserName").toString());
		Baseclass.getUrl();
	}

	@AfterClass
	public static void report() {
		Baseclass.extent.flush();
		Baseclass.driver.quit();
	}
}
