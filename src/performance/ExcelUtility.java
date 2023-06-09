package performance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.cj.Constants;
import com.mysql.cj.result.Row;

public class ExcelUtility {
	/*
	 * URL to get the binary - http://poi.apache.org/download.html
	 * Binary Name - poi-bin-3.11-beta2-20140822.zip
	 * Extract the binary
	 * Add all the jars from the location you extracted
	 * Also add all the jars from lib, do not add the jar file of log4j
	 * Also add all the jars from ooxml-lib
	 */
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell cell;
	private static XSSFRow row;

	/*
	 * Set the File path, open Excel file
	 * @params - Excel Path and Sheet Name
	 */
	public static void setExcelFile(String Path, String SheetName)
			throws Exception {
		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the excel data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			throw (e);
		}
	}

	/*
	 * Read the test data from the Excel cell
	 * @params - Row num and Col num
	 */
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String cellData = cell.getStringCellValue();
			return cellData;
		} catch (Exception e) {
			return "";
		}
	}
	
	/*
	 * Read the test data of date type from the Excel cell
	 * @params - Row num and Col num
	 */
	public static String getDateCellData(int RowNum, int ColNum) throws Exception {
		try {
			cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		    Date dateValue = cell.getDateCellValue();
		    String dateStringFormat = df.format(dateValue);
		    
			return dateStringFormat;
		} catch (Exception e) {
			return "";
		}
	}

	/*
	 * Write in the Excel cell, String Result
	 * @params - Row num and Col num
	 */
	public static void setCellData(String Result, int RowNum, int ColNum)
			throws Exception {
		try {
			row = ExcelWSheet.getRow(RowNum);
			cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
//			cell = row.getCell(ColNum);
			if (cell == null) {
				cell = row.createCell(ColNum);
				cell.setCellValue(Result);
			} else {
				cell.setCellValue(Result);
			}

			// Open the file to write the results
			String dir =System.getProperty("user.dir") + "//excel//";
			 
			FileOutputStream fileOut = new FileOutputStream(
					dir + "performance_results.xlsx");

			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}
	
	/*
	 * Write in the Excel cell, double Result
	 * @params - Row num and Col num
	 */
	public static void setCellData(double Result, int RowNum, int ColNum)
			throws Exception {
		try {
			row = ExcelWSheet.getRow(RowNum);
			cell = row.getCell(ColNum);
			if (cell == null) {
				cell = row.createCell(ColNum);
				cell.setCellValue(Result);
			} else {
				cell.setCellValue(Result);
			}

			// Open the file to write the results
			String dir =System.getProperty("user.dir") + "//excel//";
						 
			FileOutputStream fileOut = new FileOutputStream(
								dir + "performance_results.xlsx");

			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}
}