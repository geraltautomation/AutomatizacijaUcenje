package TestScripts;

import static org.testng.Assert.fail;

import java.io.IOException;
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
	
	public static String fileToRead;
	
	public static String initializeConfigFile(String enterFileName) {
		fileToRead = enterFileName;
		return fileToRead;
	}

	public static WebElement findElement(String xpathExpression) throws IOException {
		WebElement element = driver.findElement(By.xpath(Locator.testConfig(xpathExpression, fileToRead)));
		return element;
	}
	
	public static void clickOnElement(String xPathvalue) throws IOException {
		
		//driver.findElement(By.xpath(xPathvalue));
		
		if(findElement(xPathvalue) == null) {
			System.out.println("Fail - Element by name " + findElement(xPathvalue).getText() + " has not been found.");
		} else {
			//System.out.println("Pass - Element by name \"" + driver.findElement(By.xpath(xPathvalue)).getText() + "\" has been found.");
			System.out.println("Clicking on element \"" + findElement(xPathvalue).getText()+"\"");
			findElement(xPathvalue).click();
			
		}
	}
	
	public static void verifyElementAppears(String xPathValue) throws IOException {
		if(findElement(xPathValue).isDisplayed()) {
			System.out.println("Pass - Element by name \"" + findElement(xPathValue).getText() + "\" has been found.");
		}else {
			System.out.println("Fail - Element by name " + findElement(xPathValue).getText() + " has not been found.");
			fail("Element is not appearing");
		}
		
	}
	
	public static void verifyElementAppearsUsingVariables(String xPathValue) {
		WebElement element = driver.findElement(By.xpath(xPathValue));
		if(element.isDisplayed()) {
			System.out.println("Pass - Element by name \"" + element.getText() + "\" has been found.");
		}else {
			System.out.println("Fail - Element by name " + element.getText() + " has not been found.");
			fail("Element is not appearing");
		}
		
	}
	
	public static void openNewTab(String xPathValue) {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		try {
			findElement(xPathValue).sendKeys(selectLinkOpeninNewTab);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void mouseHoverElement(String xPathValue) throws IOException {
		WebElement element = findElement(xPathValue);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void enterText(String xPathValue, String enterValue) throws IOException {
		WebElement textField = findElement(xPathValue);
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
	
	public static void verifyOptionsIsPresentInDropDown(String xpathExpression, String valueToVerify) throws IOException{
		WebElement elementToFind = findElement(xpathExpression);
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
	
	public static void SelectOptionDropDown(String xpathExpression, String valueToSelect) throws IOException {
		Select dropdown = new Select(findElement(xpathExpression));
		dropdown.selectByValue(valueToSelect);
		
	}
}
