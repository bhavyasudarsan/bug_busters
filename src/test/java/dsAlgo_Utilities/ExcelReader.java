package dsAlgo_Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

	public static List<Object[]> readExcelData(String sheetName) throws IOException {
		List<Object[]> data = new ArrayList<>();
		FileInputStream fis = new FileInputStream("src/test/resources/test_data.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum();
		for (int i = 1; i <= rowCount; i++) { // Start from row 1 (skip header)
			Row row = sheet.getRow(i);
			if (row != null) {
				int cellCount = row.getLastCellNum();
				if (cellCount == -1)
					break;
				Object[] rowData = new Object[cellCount];
				for (int j = 0; j < cellCount; j++) {
					Cell cell = row.getCell(j);
					if (cell != null) {
						rowData[j] = cell.toString();
					} else {
						rowData[j] = "";
					}
				}
				data.add(rowData);
			}
		}
		workbook.close();
		fis.close();
		return data;
	}

	/**
	 * Method used to read data from excel document for array.feature
	 */
	public static String readExcelSheet(String sheetName) throws IOException {

		File Excelfile = new File("src/test/resources/testData.xlsx");

		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		String code = null;
		Iterator<Row> row = sheet.rowIterator();

		while (row.hasNext()) {
			Row currRow = row.next();
			Iterator<Cell> cell = currRow.cellIterator();

			while (cell.hasNext()) {
				Cell currCell = cell.next();
				code = currCell.getStringCellValue();
			}
			workbook.close();
		}
		return code;
	}

}