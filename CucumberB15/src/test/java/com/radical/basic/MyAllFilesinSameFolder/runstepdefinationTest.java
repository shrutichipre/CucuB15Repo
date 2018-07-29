package com.radical.basic.MyAllFilesinSameFolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = {"src/test/resources/b15demo/cucumberpath.feature"},
			glue={"com/b15demo/CucumberpathStepDefination.java"}
			
			)
	
	public class runstepdefinationTest {
		
		
}
