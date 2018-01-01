package FirstSite;

import TestScripts.Base;

public class HomePage{

	public static void clickSignInLink() {
		Base.clickOnElement("//a[@href='/css/default.asp'][text()='Learn CSS']");
	}
	
	public static void openSignInNewTab() {
		Base.openNewTab("//a[@href='/css/default.asp'][text()='Learn CSS']");
	}
	
	public static void verifyCSSpageOpened() {
		Base.verifyElementAppears("//h1[text()='CSS ']");
	}
	
	public static void clickHomeButton() {
		Base.clickOnElement("//a[@class='w3-left w3-btn']");
	}
	
	public static void verifyHTMLpageOpened() {
		Base.verifyElementAppears("//h1[text()='HTML']");
	}
}
