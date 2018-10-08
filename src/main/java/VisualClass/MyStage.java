package VisualClass;


import java.io.IOException;
import java.util.IllegalFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import DataFromExcelFile.DataDownload;
import DataFromExcelFile.ExcelReader;
import DataFromExcelFile.RandomNumber;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyStage extends Application{
	final TextField textField = new TextField();
	 @Override
	    public void start(Stage primaryStage) throws InvalidFormatException, IOException {
		//For improve speed Application I invoke ExcelReader function, because otherwise it will be called after press button, and it take some time to print name
	       ExcelReader.myFile();
		  	textField.setText("");
		  	textField.setAlignment(Pos.CENTER);
	        Button button = new Button();
	        button.setText("Losuj");
	        
	        button.setOnAction(new EventHandler<ActionEvent>() {
	 
	        public void handle(ActionEvent event) {
	                try {
						textField.setText(DataDownload.download().get(RandomNumber.random()));
					} catch (EncryptedDocumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvalidFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        });
	       
	        
	       
	 StackPane root = new StackPane();
	 VBox vbox = new VBox();
	 root.getChildren().add(vbox);
	 vbox.getChildren().addAll(button, textField);
	
	 vbox.setAlignment(Pos.TOP_CENTER);
	 vbox.setSpacing(20);
	 Scene scene = new Scene(root, 300, 100);
	        primaryStage.setTitle("Losowanie pracownika");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        
	
	
 
	 
	 }
}
