package com.alip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class SelectProduct {

	WebDriver ldriver;
	@Test
	public SelectProduct(WebDriver driver){
		this.ldriver = driver;
	}
	@Test
	public void newApp(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		Actions action = new Actions(ldriver);
		action.moveToElement(ldriver.findElement(By.id("a_applications"))).build().perform();
		ldriver.findElement(By.id("a_new_application")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ldriver.switchTo().frame("containerIframe");
		String AppNo = ldriver.findElement(By.xpath("html/body/div[1]/div/div/h1/p/span")).getText();
		System.out.println("The value of Application number is "+AppNo);
		Select dropdown = new Select(ldriver.findElement(By.xpath("html/body/div[1]/div/div/form/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div[1]/div/table/tbody/tr/td[3]/select")));
		dropdown.selectByVisibleText("Universal Life");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ldriver.findElement(By.xpath("html/body/div[1]/div/div/form/div[3]/span/div/div[1]/a")).click();
		
		
	}
}
