package Excealdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilies {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public static void setfilepath(String path,int sheetnum) throws IOException{
	
		
		try {
			File src = new File(path); 
			FileInputStream fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheetAt(sheetnum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	public static String getdata(int rownum,int cellnum) {
		int totalrows=sheet.getLastRowNum();
		System.out.println(totalrows);
		String rows = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		return rows;
	}
		
	}

