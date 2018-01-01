package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Navigation extends Browser {

public static void navigationFireFox() {
	System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
	 WebDriver firafoxdriver = new FirefoxDriver();
}

public static void navigationChrome(String URL) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	 WebDriver chromedriver = new ChromeDriver();
	 chromedriver.manage().window().maximize();
	 chromedriver.get(URL);
	
}

public static void navigationInternetExplorer() {
	System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe");
	 WebDriver internetexplorerdriver = new InternetExplorerDriver();
}
	
}
