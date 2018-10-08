package DataFromExcelFile;


import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	public static final String ExcelFile = "Pracownicy.xlsx";

	 public static Workbook myFile() throws IOException, InvalidFormatException  {
		 Workbook workbook = WorkbookFactory.create(new File(ExcelFile));
		 return workbook;
	 }
}
