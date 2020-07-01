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

public class GetTotalDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
    FileInputStream fis=new FileInputStream("./Excel/data1.xlsx");
     Workbook wb = WorkbookFactory.create(fis);
      Sheet sh = wb.getSheet("Sheet1");
     int rc = sh.getLastRowNum();
     for(int i=0;i<=rc;i++){
    	 Row row = sh.getRow(i);try{
    	short cc = row.getLastCellNum();
    	for(int j=0;j<cc;j++){
    	Cell cell = row.getCell(j);	
    	try{
    	String val = cell.getStringCellValue();
    	System.out.println(val);}
    	catch(Exception e){
    		System.out.println("skiped");
    	}
    	}}
    	 catch(Exception e){
    		 System.out.println("skipped");
    	 }
     }
	}

}
