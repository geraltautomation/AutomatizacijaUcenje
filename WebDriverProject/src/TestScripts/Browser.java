package TestScripts;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestScripts.*;

public class Browser {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void useChrome(String URL) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(5000);
	}
	
	public static void useFireFox(String URL) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(5000);
	}
	
	public static void useInternetExplorer(String URL) throws InterruptedException {
		System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(5000);
	}

	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void openNewTab(String URL) {
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		driver.get(URL);
	}
	
	public static void switchToTab(int tabNumber) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabNumber));
	}
	
	public static void closeTab(int tabNumber) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabNumber)).close();
	}
	
	
}
