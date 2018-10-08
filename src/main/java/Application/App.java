package Application;

import java.io.IOException;
import java.util.IllegalFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import DataFromExcelFile.DataDownload;
import DataFromExcelFile.ExcelReader;
import VisualClass.MyStage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InvalidFormatException, IOException
    {
    	
        Application.launch(MyStage.class, args);
    }
}
