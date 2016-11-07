package com.alip.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.alip.pages.EnterInsuredInfo;

public class Driver {

	WebDriver driver;
	public void drivePage() throws Exception{
		ConfigReader cr = new ConfigReader();
		driver = cr.initDriver(driver);
		EnterInsuredInfo eif = new EnterInsuredInfo();
		eif.FillInsuredDetails(driver);
	}
}
