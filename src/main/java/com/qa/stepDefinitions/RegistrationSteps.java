package com.qa.stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.qa.Pages.LoginPage;
import com.qa.Pages.RegistrationPage;
import com.qa.util.BaseClass;
import com.qa.util.ConfigDataProvider;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegistrationSteps {
	
	public static WebDriver driver;
	 public RegistrationPage regisObj;
	 public static ConfigDataProvider config;
	
	
	
	@Given("^User open chrome browser and navigate to application$")
	public void user_open_chrome_browser_and_navigate_to_application() throws Throwable {
		 BaseClass.setup();
		 config= new ConfigDataProvider();
		 regisObj = new RegistrationPage();
	}

	@When("^Click on Create account link$")
	public void click_on_Create_account_link() throws Throwable {
		
		regisObj.click_createaccount();
		   
	}

	@Then("^Enter title$")
	public void enter_title() throws Throwable {
		regisObj.enter_title();
	   
	}

	@Then("^Enter First name$")
	public void enter_First_name() throws Throwable {
	   regisObj.enter_Fname();
	}

	@Then("^Enter Last name$")
	public void enter_Last_name() throws Throwable {
	    regisObj.enter_Lname();
	}

	@Then("^Enter Email id$")
	public void enter_Email_id() throws Throwable {
	    regisObj.enter_email();
	}

	@Then("^Enter Password$")
	public void enter_Password() throws Throwable {
	  regisObj.enter_password();
	}

	@Then("^Enter Confirm Password$")
	public void enter_Confirm_Password() throws Throwable {
	    regisObj.enter_confirmpassword();
	}

	@Then("^Check Terms and condition$")
	public void check_Terms_and_condition() throws Throwable {
	   regisObj.check_termsandcondition();
	}

	@Then("^Submit the registration$")
	public void submit_the_registration() throws Throwable {
	 regisObj.click_submitregistration();
	}

	
	@Then("^Verify registration successfull$")
	public void verify_registration_successfull() throws Throwable {
	
		Assert.assertTrue(regisObj.after_registrationPage());
		
		}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		BaseClass.TearDown();
	   
	}
	
	
	

}
