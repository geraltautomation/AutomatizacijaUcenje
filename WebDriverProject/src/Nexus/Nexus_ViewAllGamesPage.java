package Nexus;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import TestScripts.Base;


public class Nexus_ViewAllGamesPage {
	
	public static void verifyViewAllGamesPageOpened() throws IOException {
		Base.verifyElementAppears("viewAllGamesPage");
	}
	
	public static void FilterByNameField(String enterValue) throws IOException {
		Base.enterText("filterByNameField", enterValue);
	}
	
	public static void selectSkyrim() throws IOException {
		Base.clickOnElement("selectSkyrim");
	}
	
	
	public static void mouseHoverPlus() throws IOException {
		Base.mouseHoverElement("plus");
	}
	
	public static void verifyViewModsIsDisplayed() throws IOException {
		Base.verifyElementAppears("viewMods");
	}
	
	public static void verifyAddToFavoritesIsDisplayed() throws IOException {
		Base.verifyElementAppears("addToFavorites");
	}
	
	public static void clickViewMods() throws IOException {
		Base.clickOnElement("plusViewMods");
	}
	
	public static void mouseHoverSkyrim() throws IOException {
		Base.mouseHoverElement("mouseHoverSkyrim");
	}
	
	public static void verifyFirstOptionInSortByDropdown() throws IOException {
		Base.verifyOptionsIsPresentInDropDown("sortByDropDown", "Mod count");
	}
	
	public static void verifySecondOptionInSortByDropdown() throws IOException {
		Base.verifyOptionsIsPresentInDropDown("sortByDropDown", "Name");
	}
	
	public static void verifyThirdOptionInSortByDropdown() throws IOException {
		Base.verifyOptionsIsPresentInDropDown("sortByDropDown", "Date added");
	}
	
	public static void verifyFourthOptionInSortByDropdown() throws IOException {
		Base.verifyOptionsIsPresentInDropDown("sortByDropDown", "Download count");
	}
	
	public static void verifyOptionsInSortByDropdown() throws IOException {
		verifyFirstOptionInSortByDropdown();
		verifySecondOptionInSortByDropdown();
		verifyThirdOptionInSortByDropdown();
		verifyFourthOptionInSortByDropdown();
	}
	
	public static void selectOptionFromSortByDropdown(String optionToSelect) throws IOException {
		Base.SelectOptionDropDown("sortByDropDown", optionToSelect);
	}
	
}
