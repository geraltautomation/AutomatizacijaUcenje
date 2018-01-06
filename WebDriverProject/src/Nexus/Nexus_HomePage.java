package Nexus;

import java.io.IOException;

import TestScripts.Base;
import TestScripts.Locator;

public class Nexus_HomePage  {
	
	public static void verifyHomePageOpens() throws IOException {
		Base.verifyElementAppears("welcomeToNexusMods");
	}
	
	public static void mouseHoverAllGames() throws IOException {
		Base.mouseHoverElement("allGames");
	}
	
	public static void clickViewAll() throws IOException {
		Base.clickOnElement("viewAll");
	}
	
	public static void clickLogIn() throws IOException {
		Base.clickOnElement("logIn");
	}
	
	public static void verifyLogInButtonIsDisplayed() throws IOException {
		Base.verifyElementAppears("logIn");
	}
	
	public static void usernameField(String username) throws IOException {
		Base.enterText("usernameField", username);
	}
	
	public static void passwordField(String password) throws IOException {
		Base.enterText("passwordField", password);
	}
	
	public static void clickSignInButton() throws IOException {
		Base.clickOnElement("signInButton");
	}
	
	public static void verifySingOutIsDisplayed() throws IOException {
		Base.verifyElementAppears("signOut");
	}
	
	public static void clickSignOut() throws IOException {
		Base.clickOnElement("signOut");
	}
	
	public static void verifyUsernameIsDisplayedCorrectly(String name) {
	
		Base.verifyElementAppearsUsingVariables("//nav[@id='usernav']//span[text()='"+name+"']");
	}
}
