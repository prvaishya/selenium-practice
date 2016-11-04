package com.alip.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.alip.pages.ALIPLogin;
import com.alip.pages.EnterInsuredInfo;
import com.alip.pages.ProductDetails;
import com.alip.pages.SelectProduct;
import com.alip.util.ConfigReader;



public class SubmitSFVULApp {

	WebDriver driver;
	@Test(priority=1)
	public void Start(){
		ConfigReader cr = new ConfigReader();
		driver = cr.initDriver(driver);
		cr.OpenSite(driver);
		
		ALIPLogin al = new ALIPLogin(driver);
		al.LoginToApp();
		
		SelectProduct sp = new SelectProduct(driver);
		try {
			sp.newApp();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		ProductDetails pd = new ProductDetails(driver);
		try {
			pd.fillProdDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
		EnterInsuredInfo eif = new EnterInsuredInfo();
		try {
			eif.FillInsuredDetails(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
