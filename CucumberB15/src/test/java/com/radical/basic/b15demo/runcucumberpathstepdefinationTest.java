package com.radical.basic.b15demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = {"src/test/resources/b15demo/cucumberpath.feature"},
			glue={"com/radical/basic/b15demo/"}
			
			
			)
	
	public class runcucumberpathstepdefinationTest {
}
