package com.qa.stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.qa.Pages.LoginPage;
import com.qa.util.BaseClass;
import com.qa.util.ConfigDataProvider;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass {
	
	public WebDriver driver;
	 public LoginPage loginObj;
	 public static ConfigDataProvider config;
	
	@Given("^User opens Chrome browser$")
	public void user_opens_Chrome_browser() throws Throwable {
	    BaseClass.setup();
	    config= new ConfigDataProvider();
	    loginObj = new LoginPage();
	    
	}

	@When("^User enter username and password and login$")
	public void user_enter_username_and_password_and_login() throws Throwable {
		
		//loginObj = new LoginPage();
		//loginObj=  PageFactory.initElements(driver, LoginPage.class);
		loginObj.ValidLogin();
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {

	System.out.println("User logged in ");
	   
	}

	@Then("^validate user login successfully$")
	public void validate_user_login_successfully() throws Throwable {

    	// loginObj=  PageFactory.initElements(driver, LoginPage.class);
    	 loginObj = new LoginPage();
    	 Assert.assertTrue(loginObj.display_signoutlink());
    	

	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
	  BaseClass.TearDown();
	}

	
	
	@When("^User enter invalid username and password and login$")
	public void user_enter_invalid_username_and_password_and_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//	loginObj=  PageFactory.initElements(driver, LoginPage.class);
		loginObj = new LoginPage();
		loginObj.inValidLogin();
	   
	}

	@Then("^validate user not able to logged$")
	public void validate_user_not_able_to_logged() throws Throwable {
	   
		Thread.sleep(5000);
		Assert.assertTrue(config.getexpectedinvalidusererror().equalsIgnoreCase(loginObj.getinvalidusererror()));
	}

}
