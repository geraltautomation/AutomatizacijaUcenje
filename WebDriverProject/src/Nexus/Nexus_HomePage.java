package Nexus;

import TestScripts.Base;

public class Nexus_HomePage {
	
	public static void verifyHomePageOpens() {
		Base.verifyElementAppears("//h1[text() = 'Welcome to Nexus Mods']");
	}
	
	public static void mouseHoverAllGames() {
		Base.mouseHoverElement("//span[@class='currentgame']");
	}
	
	public static void clickViewAll() {
		Base.clickOnElement("//ul[@class='subnav-actions clearfix']//a[@href='/games/']");
	}
	
	public static void clickLogIn() {
		Base.clickOnElement("//div[@class='topnav']//a[@id='login']");
	}
	
	public static void verifyLogInButtonIsDisplayed() {
		Base.verifyElementAppears("//div[@class='topnav']//a[@id='login']");
	}
	
	public static void usernameField(String username) {
		Base.enterText("//input[@id='form-username']", username);
	}
	
	public static void passwordField(String password) {
		Base.enterText("//input[@id='form-password']", password);
	}
	
	public static void clickSignInButton() {
		Base.clickOnElement("//button[@class='btn signin']");
	}
	
	public static void verifySingOutIsDisplayed() {
		Base.verifyElementAppears("//nav[@id='usernav']//a[@id='sign-out']");
	}
	
	public static void clickSignOut() {
		Base.clickOnElement("//nav[@id='usernav']//a[@id='sign-out']");
	}
	
	public static void verifyUsernameIsDisplayedCorrectly(String name) {
		Base.verifyElementAppears("//nav[@id='usernav']//span[text()='"+name+"']");
	}
}
