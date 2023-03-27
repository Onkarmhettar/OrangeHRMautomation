package testUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileHandling {
 
	public static void ExcelFileReadMethod() throws EncryptedDocumentException, IOException
	{
		String path="H:\\Testing\\xlsxsheets\\loginidpass.xlsx";
		FileInputStream file= new FileInputStream(path);
		Sheet values = WorkbookFactory.create(file).getSheet("");
		
	}
	
}
