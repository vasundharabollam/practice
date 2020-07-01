package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

public class FileManager {
	Properties pro;
	public FileManager() {
		
		try {
			FileInputStream fis = new FileInputStream(
					"./configure.properties");
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {

			Reporter.log("property file not find", true);
		}
	}
	public String getQAServer(){
		String url= pro.getProperty("QAS");
		if(url==null){
			throw new RuntimeException("url not found");
		}
		return url;
	}
}
