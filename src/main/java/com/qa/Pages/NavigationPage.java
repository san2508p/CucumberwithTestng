package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BaseClass;
import com.qa.util.MyUIUtils;

public class NavigationPage extends BaseClass{
	
	
	@FindBy(xpath="//a[text()='Home']")
	public WebElement Home_link;
	
	
	@FindBy(xpath="//a[text()='Find a job']")
	public WebElement Findajob_link;
	
	@FindBy(xpath="//a[text()='Job alerts']")
	public WebElement Jobalerts_link;
	
	@FindBy(xpath="//a[text()='Search recruiters']")
	public WebElement Search_recruiters_link;
	
	@FindBy(xpath="//a[text()='Jobs blog']")
	public WebElement  jobsblog_link;
	
public NavigationPage(){
		
		
		PageFactory.initElements(driver, this);
	}

public void click_HomeLink() throws IOException, InterruptedException {
	
	MyUIUtils.click(Home_link);
}

public void click_findjobLink() throws IOException, InterruptedException {
	
	MyUIUtils.click(Findajob_link);
}

public void click_jobalertsLink() throws IOException, InterruptedException {
	
	MyUIUtils.click(Jobalerts_link);
}

public void click_searchrecruitersLink() throws IOException, InterruptedException {
	
	MyUIUtils.click(Search_recruiters_link);
}

public void click_jobsblogLink() throws IOException, InterruptedException {
	
	MyUIUtils.click(jobsblog_link);
}

public String getcurrenturl() throws IOException, InterruptedException {
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	  return url;
	
	
}

}
