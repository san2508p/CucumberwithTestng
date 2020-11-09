package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BaseClass;
import com.qa.util.MyUIUtils;

public class RegistrationPage extends BaseClass{
	
	
	@FindBy(xpath="//*[text()='Create account']")
	
	public WebElement Createaccount_link;
	
@FindBy(xpath="//*[@id= 'title']")
	
	public WebElement title_textbox;

@FindBy(xpath="//*[@id= 'firstname']")

public WebElement Fname_textbox;


@FindBy(xpath="//*[@id= 'lastname']")

public WebElement lname_textbox;


@FindBy(xpath="//*[@id= 'emailaddress']")

public WebElement regemail_textbox;


@FindBy(xpath="//*[@id= 'regpassword']")

public WebElement reg_pwd;


@FindBy(xpath="//*[@id= 'confirmpassword']")

public WebElement cnfrm_pwd;


@FindBy(xpath="//*[@id= 'agreeTermsAndConds']")

public WebElement Terms_cond_box;


@FindBy(xpath="//div[@class='field no-margin float-right']")

public WebElement Submit_link;

@FindBy(xpath="//*[text()='Create your profile']")

public WebElement create_Profile;
	
	
	public RegistrationPage() {
		
		
			
			PageFactory.initElements(driver, this);
		}
		
public void click_createaccount() throws IOException, InterruptedException {
			
			Thread.sleep(5000);
			MyUIUtils.click(Createaccount_link);
			
		}
		
public void enter_title() throws IOException, InterruptedException{
			
			MyUIUtils.Input(title_textbox, "Mr.");
			
		}
		
public void enter_Fname() throws IOException, InterruptedException{
			
			MyUIUtils.Input(Fname_textbox, "santu");
			
		}
public void enter_Lname() throws IOException, InterruptedException{
	
	MyUIUtils.Input(lname_textbox, "kumar");
	
}
 
public void enter_email() throws IOException, InterruptedException{
		
	MyUIUtils.Input(regemail_textbox, "sanjayu111@yopmail.com");
	
}
 
public void enter_password() throws IOException, InterruptedException{
		
		MyUIUtils.Input(reg_pwd, "sanjayu11@yopmail.com");
		
	}
 
public void enter_confirmpassword() throws IOException, InterruptedException{
	
	MyUIUtils.Input(cnfrm_pwd, "sanjayu11@yopmail.com");
	
}

public void check_termsandcondition() throws IOException, InterruptedException{
	
	MyUIUtils.click(Terms_cond_box);
	
}

public void click_submitregistration() throws IOException, InterruptedException {
	
	MyUIUtils.click(Submit_link);
}

public boolean after_registrationPage() {
	 
	 String class1 = create_Profile.getAttribute("class");
	 
	 if(class1.contains("button button--brand")) {
		 System.out.println(class1);
		 return true ;
	 }
	 
	 else {
		 return false ;
	 
	 }

	 }}
 
 