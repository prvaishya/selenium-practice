package com.alip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.alip.util.ConfigReader;

public class ALIPLogin {

	WebDriver ldriver;
	@Test
	public ALIPLogin (WebDriver driver){
		this.ldriver =  driver;
	}
	
	@Test
	public void LoginToApp (){
		ConfigReader cr = new ConfigReader();
		ldriver.findElement(By.name("j_username")).sendKeys(cr.getUsername());
		ldriver.findElement(By.name("j_password")).sendKeys(cr.getPassword());
		ldriver.findElement(By.name("B12")).click();
	}
}
