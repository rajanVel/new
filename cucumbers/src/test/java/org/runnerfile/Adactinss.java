package org.runnerfile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.bclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"src/test/java/featurefiles/example1.feature"},
glue = {"org.stepdef"},
plugin = { "pretty", "json:C:\\Users\\Raja\\OneDrive\\Desktop/Cucumber.json" },
monochrome = true,
dryRun = false)

public class Adactinss {
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		 driver = bclass.Browserlaunch("chrome");
		
	}
	@AfterClass
	public static void teadown() {

		//driver.close();
	}
		

}
