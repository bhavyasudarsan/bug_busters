package dsAlgo_Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public static List<Object[]> readExcelData(String filePath, String sheetName) throws IOException {
        List<Object[]> data = new ArrayList<>();
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();
        for (int i = 1; i <= rowCount; i++) { // Start from row 1 (skip header)
            Row row = sheet.getRow(i);
            if (row != null) {
                int cellCount = row.getLastCellNum();
                Object[] rowData = new Object[cellCount];
                for (int j = 0; j < cellCount; j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        switch (cell.getCellType()) {
                            case STRING:
                                rowData[j] = cell.getStringCellValue();
                                break;
                            case NUMERIC:
                                if (DateUtil.isCellDateFormatted(cell)) {
                                    rowData[j] = cell.getDateCellValue();
                                } else {
                                    rowData[j] = String.valueOf((long) cell.getNumericCellValue());
                                }
                                break;
                            case BOOLEAN:
                                rowData[j] = cell.getBooleanCellValue();
                                break;
                            case BLANK:
                                rowData[j] = "";
                                break;
                            default:
                                rowData[j] = null;
                        }
                    } else {
                        rowData[j] = null;
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