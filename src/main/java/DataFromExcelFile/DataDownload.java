package DataFromExcelFile;


import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class DataDownload {

	public static ArrayList<String> download() throws EncryptedDocumentException, IllegalFormatException, IOException, InvalidFormatException {
		ArrayList names = new ArrayList<String>();
		StringBuffer finalName = new StringBuffer();
		Workbook file = new ExcelReader().myFile();
		   Sheet sheet = file.getSheetAt(0);
		   
	        for (Row row: sheet) {
	            for(Cell cell: row) {
	            	Cell cellValue = null;
	                cellValue = cell;
	               if(Character.isDigit(cellValue.toString().charAt(0))) {
	            	   cellValue = null;
	               }
	               else{
	                finalName.append(cellValue+" ");
	               }
	            }
	      
	            if(finalName.toString().contains("wisko") | finalName.toString().contains("imi")) {
	            	finalName.delete(0, finalName.length());
	            }
	            else {
	            	if(finalName.length()>4) {
	            		names.add(finalName.toString());
	            	}
	            	finalName.delete(0, finalName.length());
	            	
	            }
	        
	        }
	return names;
	}
}
