package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Nexus.Nexus_HomePage;
import Nexus.Nexus_ViewAllGamesPage;
import TestScripts.*;

public class Nexus_HomePageTest {
	
	private static String username = "automationgeralt@yandex.com";
	private static String password = "temptest1234";
	private static String name = "Geralt2089";
	
	@BeforeMethod
	public static void goToNexus() throws InterruptedException {
		Browser.useChrome("https://rd.nexusmods.com/");
	}
	
	@Test
	public static void test1() throws InterruptedException {
		Nexus_HomePage.verifyHomePageOpens();
		Nexus_HomePage.mouseHoverAllGames();
		Nexus_HomePage.clickViewAll();
		Thread.sleep(2000);
		
		Nexus_ViewAllGamesPage.verifyViewAllGamesPageOpened();
		Nexus_ViewAllGamesPage.FilterByNameField("Skyrim");
		Thread.sleep(2000);
		Nexus_ViewAllGamesPage.mouseHoverSkyrim();
		Thread.sleep(2000);
		Nexus_ViewAllGamesPage.mouseHoverPlus();
		Nexus_ViewAllGamesPage.verifyViewModsIsDisplayed();
		Nexus_ViewAllGamesPage.verifyAddToFavoritesIsDisplayed();
		Nexus_ViewAllGamesPage.verifyOptionsInSortByDropdown();

		Nexus_ViewAllGamesPage.selectOptionFromSortByDropdown("name");
		Nexus_ViewAllGamesPage.FilterByNameField("Fallout");
		
		Nexus_HomePage.clickLogIn();
		Thread.sleep(2000);
		Nexus_HomePage.usernameField(username);
		Nexus_HomePage.passwordField(password);
		Nexus_HomePage.clickSignInButton();
		Thread.sleep(2000);
		Nexus_HomePage.verifyUsernameIsDisplayedCorrectly(name);
		Nexus_HomePage.verifySingOutIsDisplayed();
		Nexus_HomePage.clickSignOut();
		Thread.sleep(2000);
		Nexus_HomePage.verifyLogInButtonIsDisplayed();
		System.out.println("pushing to gitHub");
		
	}
	
	@AfterMethod
	public static void afterMethod() {
		Browser.closeBrowser();
	}
	
}
