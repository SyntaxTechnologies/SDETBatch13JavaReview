package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        //location of file on the computer
        String path="Files/SDETBatch13.xlsx";
        //navigate to this file
        FileInputStream fileInputStream=new FileInputStream(path);
        // Class that understands how Excel files work
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        // Excel files are divided in sheets we can access any sheet by providing its name
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        // sheet have rows and cells(columns) we need to specify the row number and cell number as well
        // rows and columns they also start from index zero
        Row row=sheet.getRow(1);

        Cell cell=row.getCell(0);
        System.out.println(cell);
        fileInputStream.close();
    }
}
