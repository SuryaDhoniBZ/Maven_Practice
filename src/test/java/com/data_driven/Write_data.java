package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	private static void write_data() throws Throwable {
		File f = new File("C:\\Users\\WL01_ChargeInc\\Desktop\\Book.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		w.createSheet("Players").createRow(0).createCell(0).setCellValue("Player name");
		w.getSheet("Players").getRow(0).createCell(1).setCellValue("Number");
		w.getSheet("Players").getRow(0).createCell(2).setCellValue("Role");

		w.getSheet("Players").createRow(1).createCell(0).setCellValue("Dhoni");
		w.getSheet("Players").getRow(1).createCell(1).setCellValue("7");
		w.getSheet("Players").getRow(1).createCell(2).setCellValue("WK/Batsman");

		w.getSheet("Players").createRow(2).createCell(0).setCellValue("Kholi");
		w.getSheet("Players").getRow(2).createCell(1).setCellValue("18");
		w.getSheet("Players").getRow(2).createCell(2).setCellValue("Batsman");

		w.getSheet("Players").createRow(3).createCell(0).setCellValue("Rohit");
		w.getSheet("Players").getRow(3).createCell(1).setCellValue("45");
		w.getSheet("Players").getRow(3).createCell(2).setCellValue("Batsman");

		w.getSheet("Players").createRow(4).createCell(0).setCellValue("Jadeja");
		w.getSheet("Players").getRow(4).createCell(1).setCellValue("8");
		w.getSheet("Players").getRow(4).createCell(2).setCellValue("All-rounder");

		w.getSheet("Players").createRow(5).createCell(0).setCellValue("Bumrah");
		w.getSheet("Players").getRow(5).createCell(1).setCellValue("93");
		w.getSheet("Players").getRow(5).createCell(2).setCellValue("Bowler");

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		System.out.println("success");
		w.close();
	}

	public static void main(String[] args) throws Throwable {
		write_data();
	}
}
