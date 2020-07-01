package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		try{WriteDataGeneric.writeData("Sheet1", 0, 3, "prakash");
	}
		catch(Exception e){
		
	}}

}
