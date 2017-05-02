package dataSheet;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Data {
	public String userName() {
		 
		File src= new File ("C:\\Users\\edwardsm\\Desktop\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			 String data00=wb.getSheet(0).getCell(0, 0).getContents();
			  return data00;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String userPass() {
		
		File src= new File ("C:\\Users\\edwardsm\\Desktop\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data01=wb.getSheet(0).getCell(0, 1).getContents();
			  return data01;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String getUser() {
		 
		File src= new File ("C:\\Users\\edwardsm\\Desktop\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data02=wb.getSheet(0).getCell(1, 0).getContents();
			  return data02;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	
}