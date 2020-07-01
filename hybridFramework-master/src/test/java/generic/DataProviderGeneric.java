package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class DataProviderGeneric {

	public static Object[][] getData(String sheet) {
		Object[][] data = null;

		try {
			FileInputStream fis = 
					new FileInputStream(new FileManager().getExcelPath());
			Workbook wb = WorkbookFactory.create(fis);//HSSFWORKBOOK
			Sheet sh = wb.getSheet(sheet);
			int rc = sh.getLastRowNum();
			Row r = sh.getRow(0);
			short cc = r.getLastCellNum();
			data = new Object[rc + 1][cc];

			for (int i = 1; i < rc + 1; i++) {
				Row row = sh.getRow(i);
				for (int j = 0; j < cc; j++) {
					Cell cell = row.getCell(j);
					String val = cell.getStringCellValue();
					data[i][j] = val;
					System.out.println(val);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log("failed to read data", true);
		}

		return data;

	}

}
