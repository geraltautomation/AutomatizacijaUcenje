package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Locator {
	
	

	public static String testConfig(String key, String fileToRead) throws IOException {
	
	File src= new File("./Configuration/" + fileToRead);
	
	FileInputStream fis = new FileInputStream(src);
	
	Properties property = new Properties();
	
	property.load(fis);
	
	//String xPath = property.getProperty(key);
	
	return property.getProperty(key);
	}
	
	
	
	
}
