package com.alip.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class ConfigReader {
	
	Properties prop = new Properties();
	@Test
	public ConfigReader() {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Selenium\\ALIP\\Config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	@Test
	public WebDriver initDriver(WebDriver ldriver){
		if(prop.getProperty("Browser").equals("ie")){
			System.setProperty("webdriver.ie.driver","C:\\Selenium\\BrowserDrivers\\IEDriverServer.exe");
			ldriver=new InternetExplorerDriver();
		}
		if(prop.getProperty("Browser").equals("chrome")){
			System.setProperty("webdriver.ie.driver","C:\\Selenium\\BrowserDrivers\\chromedriver.exe");
			ldriver=new InternetExplorerDriver();
		}
		return ldriver;
	}
	@Test
	public void OpenSite(WebDriver ldriver){
		ldriver.get(prop.getProperty("BaseUrl"));
		ldriver.manage().window().maximize();
	}
	public String getUsername(){
		return prop.getProperty("UserID");
	}
	public String getPassword(){
		return prop.getProperty("Password");
	}
	
	public String getTestDataLoc(){
		return prop.getProperty("TestSheet");
	}
	
}

