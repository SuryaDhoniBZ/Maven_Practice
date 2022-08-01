package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_particular_data {
	private static void read_particular_data() throws Throwable {
		File f = new File("C:\\Users\\WL01_ChargeInc\\eclipse-workspace\\Maven_Practice\\Excel\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			System.out.println(data);
		}
		w.close();
	}

	public static void main(String[] args) throws Throwable {
		read_particular_data();
	}

}
