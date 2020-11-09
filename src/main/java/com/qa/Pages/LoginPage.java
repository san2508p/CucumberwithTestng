package com.qa.Pages;


import java.io.IOException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ExcelDataProvider;
import com.qa.util.BaseClass;
import com.qa.util.MyUIUtils;

public class LoginPage extends BaseClass {
	
	

	@FindBy(xpath="//*[text()='Sign in']")
	public WebElement signin_link;
	
	@FindBy(xpath="//input[@id='signinemail']")
    public WebElement Login_UserName_ED;
	
	
    @FindBy(xpath="//input[@id='signinpassword']")
    public WebElement Login_Password_ED;
	
	

	@FindBy(xpath="//input[@class='button button--brand']")
    public WebElement Login_Login_BT;

	@FindBy(xpath="//div[@class='loader']")
	public WebElement Login_loader;
	
	//HomePage login
	@FindBy(xpath="//*[text()='Sign out']")
	public WebElement sign_out;
	
	@FindBy(xpath="//*[@class = 'message message--error icon-before']")
	public WebElement invalidusername_error;
	
	public LoginPage(){
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void ValidLogin() throws IOException, InterruptedException{
		Thread.sleep(5000);

		MyUIUtils.Input(Login_UserName_ED,ExcelDataProvider.getStringData("Login",0,0));
		MyUIUtils.Input(Login_Password_ED,ExcelDataProvider.getStringData("Login",0,1));
		Login_Login_BT.click();
	MyUIUtils.click(signin_link);
	MyUIUtils.Input(Login_UserName_ED,ExcelDataProvider.getStringData("Login",0,0));
	MyUIUtils.Input(Login_Password_ED,ExcelDataProvider.getStringData("Login",0,1));
	Login_Login_BT.click();
	Thread.sleep(5000);
	}
	
	
	public void inValidLogin() throws IOException, InterruptedException{
		Thread.sleep(5000);
		MyUIUtils.click(signin_link);
	MyUIUtils.Input(Login_UserName_ED,ExcelDataProvider.getStringData("Login",0,2));
	MyUIUtils.Input(Login_Password_ED,ExcelDataProvider.getStringData("Login",0,3));
	Login_Login_BT.click();
	Thread.sleep(5000);

	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean display_signoutlink() {
		
		try {
			
			sign_out.isDisplayed();
		}
		 catch(NoSuchElementException e) {
			 
			 return false  ;
		 }
		
		return true ;
		
		
		}
		
		public String getinvalidusererror() {
			
			String mess1 = invalidusername_error.getText();
			System.out.println(mess1);
			return mess1 ;
			
		}
		
	}


