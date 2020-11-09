package com.qa.stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.Pages.NavigationPage;
import com.qa.util.BaseClass;
import com.qa.util.ConfigDataProvider;
import com.qa.util.MyUIUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class NavigationSteps extends BaseClass {
	
	public WebDriver driver;
	public NavigationPage np ;
	 public static ConfigDataProvider config;
	
	@Given("^User opens Chrome browser and enter URL$")
	public void user_opens_Chrome_browser_and_enter_URL() throws Throwable {
	   BaseClass.setup();
	   np = new NavigationPage();
	   config= new ConfigDataProvider();
	}

	@When("^User clicks on Home link$")
	public void user_clicks_on_Home_link() throws Throwable {
	   np.click_HomeLink();
	}

	@Then("^User should successfully move to Home page$")
	public void user_should_successfully_move_to_Home_page() throws Throwable {
	 Assert.assertEquals(np.getcurrenturl(),config.getHomeUrl());
	 
	}

	@Then("^User clicks on Find a Job link$")
	public void user_clicks_on_Find_a_Job_link() throws Throwable {
	    np.click_findjobLink();
	}

	@Then("^User should successfully move to jobs page$")
	public void user_should_successfully_move_to_jobs_page() throws Throwable {
		 Assert.assertEquals(np.getcurrenturl(),config.getFindjobUrl());
	}

	@Then("^User clicks on Job alerts link$")
	public void user_clicks_on_Job_alerts_link() throws Throwable {
	    np.click_jobalertsLink();
	}

	@Then("^User should successfully move to newalert page$")
	public void user_should_successfully_move_to_newalert_page() throws Throwable {
		 Assert.assertEquals(np.getcurrenturl(),config.getJobAlertsUrl());
	}

	@Then("^User clicks on Search recruiters link$")
	public void user_clicks_on_Search_recruiters_link() throws Throwable {
	   np.click_searchrecruitersLink();
	}

	@Then("^User should successfully move to employers page$")
	public void user_should_successfully_move_to_employers_page() throws Throwable {
		Assert.assertEquals(np.getcurrenturl(),config.getSearchRecruitersUrl());
	}

	@Then("^User clicks on Jobs blog link$")
	public void user_clicks_on_Jobs_blog_link() throws Throwable {
	   np.click_jobsblogLink();
	}

	@Then("^User should successfully move to careers page$")
	public void user_should_successfully_move_to_careers_page() throws Throwable {
		Assert.assertEquals(np.getcurrenturl(),config.getJobsBlogUrl());
	}
	
	@Then("^User should close the browser$")
	public void user_should_close_the_browser() throws Throwable {
	    BaseClass.TearDown();
	}


}
