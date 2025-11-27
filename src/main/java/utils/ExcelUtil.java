package utils;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

public class ExcelUtil {

    public static String getCellData(String sheet, int row, int col) {
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            return wb.getSheet(sheet).getRow(row).getCell(col).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
