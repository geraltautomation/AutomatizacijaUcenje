package TestScripts;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import TestScripts.*;

public class Base extends Browser {

	public static WebElement findElement(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}
	
	public static void clickOnElement(String xPathvalue) {
		
		driver.findElement(By.xpath(xPathvalue));
		
		if(driver.findElement(By.xpath(xPathvalue)) == null) {
			System.out.println("Fail - Element by name " + driver.findElement(By.xpath(xPathvalue)).getText() + " has not been found.");
		} else {
			//System.out.println("Pass - Element by name \"" + driver.findElement(By.xpath(xPathvalue)).getText() + "\" has been found.");
			System.out.println("Clicking on element \"" + driver.findElement(By.xpath(xPathvalue)).getText()+"\"");
			driver.findElement(By.xpath(xPathvalue)).click();
			
		}
	}
	
	public static void verifyElementAppears(String xPathValue) {
		if(driver.findElement(By.xpath(xPathValue)).isDisplayed()) {
			System.out.println("Pass - Element by name \"" + driver.findElement(By.xpath(xPathValue)).getText() + "\" has been found.");
		}else {
			System.out.println("Fail - Element by name " + driver.findElement(By.xpath(xPathValue)).getText() + " has not been found.");
			fail("Element is not appearing");
		}
		
	}
	
	public static void openNewTab(String xPathValue) {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		driver.findElement(By.xpath(xPathValue)).sendKeys(selectLinkOpeninNewTab);
	}
	
	public static void mouseHoverElement(String xPathValue) {
		WebElement element = driver.findElement(By.xpath(xPathValue));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void enterText(String xPathValue, String enterValue) {
		WebElement textField = driver.findElement(By.xpath(xPathValue));
		textField.click();
		textField.clear();
		textField.sendKeys(enterValue);
	}
	
//	public static void verifyOptionsIsPresentInDropDown(String xpathExpression, String valueToVerify, int elementNumber) {
//		Select dropdown = new Select(driver.findElement(By.xpath(xpathExpression)));
//		
//		//Boolean found = false;
//		
//		dropdown.selectByVisibleText(valueToVerify);
//		String value = dropdown.getOptions().get(elementNumber).getText();
//		
//		if(value.equals(valueToVerify)) {
//			System.out.println("Pass - Element " + dropdown.getOptions().get(elementNumber).getText() + " in dropdown is found");
//		} else {
//			System.out.println("Fail - Expected value was " + valueToVerify + " and actual value is " +  dropdown.getOptions().get(elementNumber).getText());
//			fail("Fail - Expected value was " + valueToVerify + " and actual value is " +  dropdown.getOptions().get(elementNumber).getText());
//		}
//	}
	
	public static void verifyOptionsIsPresentInDropDown(String xpathExpression, String valueToVerify){
		WebElement elementToFind = driver.findElement(By.xpath(xpathExpression));
		Boolean itemFound = false;
		if(elementToFind == null){
			System.out.println("Fail - element is not found");
			fail("Fail - element is not found");
		}
		else{
			List <WebElement> alloption = new Select(elementToFind).getOptions();
			
			for(WebElement eachOption: alloption){
				//System.out.println("Ovo je --" + eachOption.getText() + "--");
				if(eachOption.getText().contains(valueToVerify)){
					System.out.println("Pass - " + valueToVerify + " option has been found");
					itemFound=true;
				}
			}
			if(itemFound==false){
				//Reporter.log("Fail - " + valueToVerify + " se ne nalazi u "+ elementToFind);
				System.out.println("Fail - " + valueToVerify + " is not present in "+ elementToFind);
				fail("Fail - " + valueToVerify + " is not present in "+ elementToFind);
			}
		}
	}
	
	public static void SelectOptionDropDown(String xpathExpression, String valueToSelect) {
		Select dropdown = new Select(driver.findElement(By.xpath(xpathExpression)));
		dropdown.selectByValue(valueToSelect);
		
	}
}
