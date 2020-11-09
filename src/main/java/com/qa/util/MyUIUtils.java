package com.qa.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MyUIUtils {
	
	WebDriver driver;
	
	
	public MyUIUtils(WebDriver driver){
		this.driver=driver;
	}
	
	public static void Input(WebElement we, String ValueToInput) throws IOException, InterruptedException{
		//WebElement we= getWebElement(ORElementName);
		we.clear();
	//String ValueToInput=getTestData(ORElementName);
		we.sendKeys(ValueToInput);
	}
	
	public static void click(WebElement we) throws IOException, InterruptedException{
//		WebElement we=getWebElement(ORElementName);
		//System.out.println(we.getText());
		we.click();
	}
	
	public void click(List<WebElement> we){
		 // we=MyUIUtils.getListWebElement("Standard_Division_SelectAllDivisionGroup2");
		  int count= we.size();
		  System.out.println(count);
		  for(int i=1;i<=count-1;i++){
			  WebElement webelement= we.get(i);
			  webelement.click();
		}
	}	
}		

