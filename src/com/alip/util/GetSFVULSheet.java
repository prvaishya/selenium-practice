package com.alip.util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetSFVULSheet {

	
	public XSSFSheet ReturnSFVULSheet() throws Exception{
	    ConfigReader cr= new ConfigReader();
	    XSSFWorkbook wb;
		wb = new XSSFWorkbook(cr.getTestDataLoc());
	    return(wb.getSheet("SFVUL"));
	}
}
