package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Locator {

	public static String testConfig(String key) throws IOException {
	
	File src= new File("./Configuration/Config.property");
	
	FileInputStream fis = new FileInputStream(src);
	
	Properties property = new Properties();
	
	property.load(fis);
	
	//String xPath = property.getProperty(key);
	
	return property.getProperty(key);
	}
	
	public static String testConfigWithVariables(String key, String value) throws IOException {
		
		File src= new File("./Configuration/Config.property");
		
		FileInputStream fis = new FileInputStream(src);
		
		Properties property = new Properties();
		
		property.load(fis);
		
		String xPath = property.getProperty(key).toString();
		
		return xPath;
		}
	
	
}
