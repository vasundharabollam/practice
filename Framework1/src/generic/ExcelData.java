package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements Auto_Const {
	public static String getData(String sheet,int row,int cell,String val) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		try{FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		 val = c.getStringCellValue();
		return val;
		}
		catch(Exception e){
			System.out.println("skip");
		}
		return val;
	}
	public static void writeData(String sheet, int row, int cell, String val) {
		try {
			FileInputStream fis = new FileInputStream(excel_path);
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).createCell(cell);
			c.setCellValue(val);
			FileOutputStream fout = new FileOutputStream(
					excel_path);
			wb.write(fout);
		} catch (Exception e) {
			System.out.println("Unable to Write data");
		}
	}

}
