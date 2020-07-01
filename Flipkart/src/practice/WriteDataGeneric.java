package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataGeneric {
	public static void writeData(String sheet, 
			int row, int cell, String val)
					throws EncryptedDocumentException,
					InvalidFormatException, IOException {
		FileInputStream fis=new 
				FileInputStream("./Excel/practice.xlsx");
      Workbook wb = WorkbookFactory.create(fis);
      Cell c = wb.getSheet(sheet).
    		  createRow(row).createCell(cell);
	c.setCellValue(val);
	FileOutputStream fos=new 
			FileOutputStream("./Excel/practice.xlsx");
	wb.write(fos);
	
	}

}
