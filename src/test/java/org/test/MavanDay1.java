package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavanDay1 {
	
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\Happy\\eclipse-workspace\\FirstMavan\\Excel\\fream excel.xlsx");
		FileInputStream fil = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fil);
		Sheet s = w.getSheet("sheet1");
		Row row = s.getRow(2);
		Cell cell = row.getCell(1);
		 System.out.println(cell);
	
}
}