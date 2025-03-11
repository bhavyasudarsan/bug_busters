package dsAlgo_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
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
				System.out.print(code + " ~ ");
			}
			System.out.println();
			workbook.close();
		}
		return code;
	}

}
