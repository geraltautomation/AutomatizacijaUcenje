package FirstSite;

import java.io.IOException;

import TestScripts.Base;

public class HomePage{

	public static void clickSignInLink() throws IOException {
		Base.clickOnElement("//a[@href='/css/default.asp'][text()='Learn CSS']");
	}
	
	public static void openSignInNewTab() {
		Base.openNewTab("//a[@href='/css/default.asp'][text()='Learn CSS']");
	}
	
	public static void verifyCSSpageOpened() throws IOException {
		Base.verifyElementAppears("//h1[text()='CSS ']");
	}
	
	public static void clickHomeButton() throws IOException {
		Base.clickOnElement("//a[@class='w3-left w3-btn']");
	}
	
	public static void verifyHTMLpageOpened() throws IOException {
		Base.verifyElementAppears("//h1[text()='HTML']");
	}
}
