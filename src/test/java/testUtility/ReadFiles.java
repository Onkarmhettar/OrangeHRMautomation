package testUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFiles {

	static String data;
	public static String fetchDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		//XcelSheetdata fetch
		String path = "src\\test\\resources\\Files\\datasheet.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		Cell c=WorkbookFactory.create(file).getSheet("loginidpass").getRow(row).getCell(cell);
		CellType type =c.getCellType();
		
		if(type==CellType.STRING)
		{
			data=c.getStringCellValue();
		}
		else if(type==CellType.NUMERIC)
		{
			double d= c.getNumericCellValue();
			data = Double.toString(d);
		}
		
		else if(type==CellType.BLANK)
		{
			System.out.println("the cell data is empty");
		}
		return data;
	
	}
	
}
