package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static List<String> getData(String sheetName,String testCaseName)

	{

		List<String> list = new ArrayList<String>();
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(new FileManager().getExcelPath());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		XSSFWorkbook workbook=null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();// collection of rows
				Row firstRow = rows.next();// navigate to the first row
				Iterator<Cell> ce = firstRow.cellIterator();
				int k = 0;
				int column = 0;
				while (ce.hasNext()) // iterate through all the cells
				{
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCaseName")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cell = r.cellIterator();
						while (cell.hasNext()) {
							String val = cell.next().getStringCellValue();
							list.add(val);

						}

					}
				}

			}
		}
		return list;
	}
	public static void main(String[] args) throws IOException {
		System.out.println( Excel.getData("regression","ValidLogin"));
	}
}
