package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class FileManager {

	Properties pro;
	public FileManager()
	{
		 pro=new Properties();
		try {
			FileInputStream fis=new FileInputStream("./config.properties");
			pro.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	public String getApplicationUrl()
	{
		String url = pro.getProperty("url");
		if(url==null)
		{
			throw new RuntimeException("invalid url");
		}
		return url;
	}
	
	public long getImplicitlyWait()
	{
		String implicitlywait = pro.getProperty("iw");
		if(implicitlywait==null)
		{
			throw new RuntimeException("failed to specify implicit timeout");
		}
		return Long.parseLong(implicitlywait);
		
	}
	
	public String getExcelPath()
	{
		String excel_path = pro.getProperty("excel_path");
		if(excel_path==null)
		{
			throw new RuntimeException("invalid excel path");
		}
		return excel_path;
	}
}
