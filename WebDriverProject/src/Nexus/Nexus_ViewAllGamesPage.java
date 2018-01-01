package Nexus;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;

import TestScripts.Base;


public class Nexus_ViewAllGamesPage {
	
	public static void verifyViewAllGamesPageOpened() {
		Base.verifyElementAppears("//h1[text()='Our games']");
	}
	
	public static void FilterByNameField(String enterValue) {
		Base.enterText("//input[@id='f_name']", enterValue);
	}
	
	public static void selectSkyrim() {
		Base.clickOnElement("//li[@id='game-tile-110']");
	}
	
	
	public static void mouseHoverPlus() {
		Base.mouseHoverElement("//li[@id='game-tile-110']//ul[@class='btnexpand btnoverlay inline-flex']");
	}
	
	public static void verifyViewModsIsDisplayed() {
		Base.verifyElementAppears("//a[text()='View mods']");
	}
	
	public static void verifyAddToFavoritesIsDisplayed() {
		Base.verifyElementAppears("//a[text()='Add to favourites']");
	}
	
	public static void clickViewMods() {
		if(Base.findElement("//span[@class='view-content']").isDisplayed()) {
			Base.clickOnElement("//span[@class='view-content']");
		}
		else {
			System.out.println("Element could not be found!!!!!");
			fail("Element "+ Base.findElement("//span[@class='view-content']").getTagName() +" could not be found!!!!!");
		}
	}
	
	public static void mouseHoverSkyrim() {
		Base.mouseHoverElement("//a[text()='View mods']");
	}
	
	public static void verifyFirstOptionInSortByDropdown() {
		Base.verifyOptionsIsPresentInDropDown("//select[@id='sort_by']", "Mod count");
	}
	
	public static void verifySecondOptionInSortByDropdown() {
		Base.verifyOptionsIsPresentInDropDown("//select[@id='sort_by']", "Name");
	}
	
	public static void verifyThirdOptionInSortByDropdown() {
		Base.verifyOptionsIsPresentInDropDown("//select[@id='sort_by']", "Date added");
	}
	
	public static void verifyFourthOptionInSortByDropdown() {
		Base.verifyOptionsIsPresentInDropDown("//select[@id='sort_by']", "Download count");
	}
	
	public static void verifyOptionsInSortByDropdown() {
		verifyFirstOptionInSortByDropdown();
		verifySecondOptionInSortByDropdown();
		verifyThirdOptionInSortByDropdown();
		verifyFourthOptionInSortByDropdown();
	}
	
	public static void selectOptionFromSortByDropdown(String optionToSelect) {
		Base.SelectOptionDropDown("//select[@id='sort_by']", optionToSelect);
	}
	
}
