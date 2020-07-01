package poi.framework;

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

public class ExcelSheet {
	
	public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException{
		String val="";
		try{FileInputStream fis=new FileInputStream("./excel/login.xlsx");
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

}
