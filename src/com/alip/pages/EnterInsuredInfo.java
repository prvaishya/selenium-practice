package com.alip.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.alip.util.GetSFVULSheet;

public class EnterInsuredInfo {

	@Test
	public void FillInsuredDetails(WebDriver ldriver) throws Exception{
		Thread.sleep(9000);
		//ldriver.switchTo().frame("containerIframe");
		ldriver.findElement(By.name("10:.*/XML/Client.*/AppDetails/Search/Indicator ")).click();
		Thread.sleep(6000);
		GetSFVULSheet gss = new GetSFVULSheet();
		XSSFSheet sh1 = gss.ReturnSFVULSheet();
		ldriver.findElement(By.name("7:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Primary' and AppDetails/Sequence='1']/CRMDetails/FirstName")).sendKeys(sh1.getRow(9).getCell(1).getStringCellValue());
		ldriver.findElement(By.name("7:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Primary' and AppDetails/Sequence='1']/CRMDetails/LastName")).sendKeys(sh1.getRow(10).getCell(1).getStringCellValue());
		Select dd = new Select(ldriver.findElement(By.name("5:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Primary' and AppDetails/Sequence='1']/CRMDetails/Gender")));
		if (sh1.getRow(11).getCell(1).getStringCellValue().equals("Male")){
			dd.selectByVisibleText("Male");
		}
		else {
			dd.selectByVisibleText("Female");
		}
			
		
	}
	
}
