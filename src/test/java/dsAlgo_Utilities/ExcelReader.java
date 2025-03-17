package dsAlgo_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
}