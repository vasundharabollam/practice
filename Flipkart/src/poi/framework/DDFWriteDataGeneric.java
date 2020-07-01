package poi.framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDFWriteDataGeneric {

	public static void writeData(String sheet, int row, int cell, String val) {
		try {
			FileInputStream fis = new FileInputStream("./Excel/practice.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).createRow(row).createCell(cell);
			c.setCellValue(val);
			FileOutputStream fout = new FileOutputStream(
					"./Excel/practice.xlsx");
			wb.write(fout);
		} catch (Exception e) {
			System.out.println("Unable to Read/Write data");
		}
	}

}
