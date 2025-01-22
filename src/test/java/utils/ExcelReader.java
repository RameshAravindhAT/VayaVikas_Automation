package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import projectSpecifications.BaseClass;

public class ExcelReader extends BaseClass {

    @Test
    public static String[][] readexcelData(String excelfilename, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(excelfilename);
        XSSFWorkbook book = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheet(sheetName);

        int rownum = sheet.getLastRowNum();
        int cellnum = sheet.getRow(0).getLastCellNum();
        
        // Using DataFormatter to handle cell formatting
        DataFormatter formatter = new DataFormatter();
        
        String[][] data = new String[rownum][cellnum];

        for (int i = 1; i <= rownum; i++) {  // Starting from 1 to skip the header
            XSSFRow row = sheet.getRow(i);

            for (int j = 0; j < cellnum; j++) {
                if (row != null && row.getCell(j) != null) {  // Check if the cell exists
                    XSSFCell cell = row.getCell(j);  // Get the cell object
                    data[i - 1][j] = formatter.formatCellValue(cell);  // Use DataFormatter to get the string value
                } else {
                    data[i - 1][j] = "";  // If cell is empty, assign empty string
                }
            }
        }
        
        book.close();
        return data;
    }
}
