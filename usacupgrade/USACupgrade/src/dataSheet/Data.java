package dataSheet;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Data {
	public String userName() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
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
	
	public String userPass() {
		
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data11=wb.getSheet(0).getCell(1, 1).getContents();
			  return data11;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String comadFrn() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data101=wb.getSheet(0).getCell(10, 1).getContents();
			  return data101;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	
	public String recoveryType() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data111=wb.getSheet(0).getCell(11, 1).getContents();
			  return data111;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	public String requestName() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data121=wb.getSheet(0).getCell(12, 1).getContents();
			  return data121;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	public String narrative() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data131=wb.getSheet(0).getCell(13, 1).getContents();
			  return data131;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	public String iRM() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data21=wb.getSheet(0).getCell(2, 1).getContents();
			  return data21;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String iR() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data31=wb.getSheet(0).getCell(3, 1).getContents();
			  return data31;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String fRM() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data41=wb.getSheet(0).getCell(4, 1).getContents();
			  return data41;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String fR() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data51=wb.getSheet(0).getCell(5, 1).getContents();
			  return data51;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	
	}
	
	public String qAM() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data61=wb.getSheet(0).getCell(6, 1).getContents();
			  return data61;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String qAR() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data71=wb.getSheet(0).getCell(7, 1).getContents();
			  return data71;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	public String usacM() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data81=wb.getSheet(0).getCell(8, 1).getContents();
			  return data81;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String usacR() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data91=wb.getSheet(0).getCell(9, 1).getContents();
			  return data91;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	public String reviewType() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data151=wb.getSheet(0).getCell(15, 1).getContents();
			  return data151;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String requestNum() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data181=wb.getSheet(0).getCell(18, 1).getContents();
			  return data181;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String year() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data171=wb.getSheet(0).getCell(17, 1).getContents();
			  return data171;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String reviewerType() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data161=wb.getSheet(0).getCell(16, 1).getContents();
			  return data161;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
	
	public String reviewer() {
		 
		File src= new File ("C:\\USAC Project\\PostCommit\\usacupgrade\\TestData.xls");
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(src);
			String data211=wb.getSheet(0).getCell(21, 1).getContents();
			  return data211;
		
		} catch (BiffException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null; 
	}
}
