package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericToDataProvider {
	public static Object[][] getData(String sheet)
			throws EncryptedDocumentException, InvalidFormatException,
			IOException {
		Object[][] data = null;
		try {
			FileInputStream fis = new FileInputStream("./Excel/customize.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			int rc = sh.getLastRowNum();
			Row r = sh.getRow(0);
			int cc = r.getLastCellNum();
			data = new Object[rc + 1][cc];
			for (int i = 0; i < rc + 1; i++) {

				Row row = sh.getRow(i);
				try {
					for (int j = 0; j < cc; j++) {

						Cell cell = row.getCell(j);
						try {
							String value = cell.getStringCellValue();
							data[i][j] = value;
						} catch (Exception e) {
							System.out.println("cell empty");
						}
					}
				} catch (Exception e) {
					System.out.println("row empty");
				}

			}

		} catch (FileNotFoundException e) {

			System.out.println("cannot get data");
		}
		return data;
	}
}
