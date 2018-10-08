package DataFromExcelFile;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class RandomNumber {
		public static int random() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
			int number = 0;
			Random rd = new Random();
			number = rd.nextInt(DataDownload.download().size());
			
			return number;
		}
		
}
