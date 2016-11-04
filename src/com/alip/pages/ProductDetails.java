package com.alip.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import com.alip.util.ConfigReader;
import com.alip.util.GetSFVULSheet;

public class ProductDetails {
	
	WebDriver ldriver;
	public ProductDetails(WebDriver driver){
		this.ldriver = driver;
	}

	public void fillProdDetails() throws Exception{
		GetSFVULSheet gss = new GetSFVULSheet();
		XSSFSheet sh1 = gss.ReturnSFVULSheet();
		Thread.sleep(4000);
		//ldriver.switchTo().frame("containerIframe");
		ldriver.findElement(By.xpath(".//*[@id='qcontent_1141_-1_11']/input[2]")).clear();
		ldriver.findElement(By.xpath(".//*[@id='qcontent_1141_-1_11']/input[2]")).sendKeys(sh1.getRow(4).getCell(1).getStringCellValue());
		ldriver.findElement(By.xpath(".//*[@id='qcontent_1141_-1_11']/input[3]")).clear();
		ldriver.findElement(By.xpath(".//*[@id='qcontent_1141_-1_11']/input[3]")).sendKeys(sh1.getRow(4).getCell(2).getStringCellValue());
		ldriver.findElement(By.xpath(".//*[@id='qcontent_1141_-1_11']/input[4]")).clear();
		ldriver.findElement(By.xpath(".//*[@id='qcontent_1141_-1_11']/input[4]")).sendKeys(sh1.getRow(4).getCell(3).getStringCellValue());
		Select sel = new Select(ldriver.findElement(By.xpath(".//*[@id='test']")));
		sel.selectByVisibleText(sh1.getRow(5).getCell(1).getStringCellValue());
		ldriver.findElement(By.cssSelector("input[title*='Standard Flexible VUL']")).click();
		Thread.sleep(2000);
		ldriver.findElement(By.id("searchparam_14_AgentID")).sendKeys(sh1.getRow(6).getCell(1).getStringCellValue());
		Thread.sleep(4000);
		ldriver.findElement(By.id("22:/XML/Client[Relation/@code ='Agent' and AppDetails/Sequence='1']/AgentDetails/WritingCode")).click();
		Thread.sleep(3000);
		ldriver.findElement(By.xpath(".//*[@id='qcontent_1152_1_7']/input")).sendKeys(sh1.getRow(6).getCell(2).getStringCellValue());
		ldriver.findElement(By.xpath(".//*[@id='buttonBar']/div[1]/a")).click();
		
			
	}
}
