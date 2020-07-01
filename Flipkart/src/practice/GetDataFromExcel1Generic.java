package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel1Generic {
public static String Getdata(String sheet,int row,int cell){
	String result="";
	try{
	FileInputStream fis=new FileInputStream("./Excel/practice.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
	  result=c.getStringCellValue();
	
	}catch(Exception e){
		System.out.println("can not");
		
	}return result;
}
}
