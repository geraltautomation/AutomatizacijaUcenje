package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestScripts.*;
import FirstSite.*;

public class FirstTest  {
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException {
		Browser.useChrome("http://www.w3schools.com");
	}

		
		@Test
		public void test1() throws InterruptedException {
			HomePage.clickSignInLink();
			//HomePage.openSignInNewTab();
			Thread.sleep(2000);
			HomePage.verifyCSSpageOpened();
			HomePage.clickHomeButton();
			Thread.sleep(2000);
			HomePage.verifyHTMLpageOpened();

		
		}
		
	@AfterMethod
	public void closeBrowser() {
		Browser.closeBrowser();
	}
	

}
