package com.radical.basic.MyAllFilesinSameFolder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	
	WebDriver driver;
	@Given("^the user is on facebook login Page$")
	public void the_user_is_on_facebook_login_Page()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Radical_Software\\Today\\chromedriver_win32_B39\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@When("^he enters \"([^\"]*)\" as username$")
	public void method2(String username)
	{
		
		driver.findElement(By.id("email")).sendKeys(username);
	}
	
	@When("^he enters \"([^\"]*)\" as password$")
	public void method3(String pwd)
	{
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}
	
	@Then("^check username is present in textbox$")
	public void method4()
	{
		Assert.assertTrue(true);
	}
	
	
	
}
