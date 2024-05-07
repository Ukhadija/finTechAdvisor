package application;
	
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	Stage stage;
	FXMLLoader loader = new FXMLLoader();
	@Override
	public void start(Stage primaryStage) {
		try {
			String fxmlDocPath = "Resources/fxml/Home.fxml";
			FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
			AnchorPane root = (AnchorPane)loader.load(fxmlStream);
			
			Scene scene = new Scene(root,500,500);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void changeScene(Stage currentStage, String fxmlDocPath) throws IOException{
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane root = (AnchorPane)loader.load(fxmlStream);
		
		Scene scene = new Scene(root,500,500);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		currentStage.setScene(scene);
		currentStage.show();
	}
	
	public void changeScenewithString(Stage currentStage, String fxmlDocPath, String s) throws IOException{
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane root = (AnchorPane)loader.load(fxmlStream);
		
		ShowInvestmentRangeController IVR = loader.getController();
		IVR.settxt(s);	
		Scene scene = new Scene(root,500,500);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		currentStage.setScene(scene);
		currentStage.show();
	}
	
	public void changeScenewithParameter(Stage currentStage, String fxmlDocPath, String advisorName) throws IOException{
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane root = (AnchorPane)loader.load(fxmlStream);
		
		ChatwithAdvisorController chatcontroller = loader.getController();
		
		chatcontroller.setAdvisorName(advisorName);
		
		Scene scene = new Scene(root,500,500);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		currentStage.setScene(scene);
		currentStage.show();
	}
	
	public void changeSceneToDescription(Stage currentStage, String fxmlDocPath, String name, String desc, String path) throws IOException{
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane root = (AnchorPane)loader.load(fxmlStream);
		
		ResourceDetailsController rcontroller = loader.getController();
		
		rcontroller.setAttributes(name, desc, path);
		
		Scene scene = new Scene(root,500,500);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		currentStage.setScene(scene);
		currentStage.show();
	}
	/*
	public void changeScenewithParameter(Stage currentStage, String fxmlDocPath, Customer cus) throws IOException{
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane root = (AnchorPane)loader.load(fxmlStream);
		
		UserAccountController ucontroller = loader.getController();
		
		ucontroller.setCustomer(cus);
		
		Scene scene = new Scene(root,500,500);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		currentStage.setScene(scene);
		currentStage.show();
	}
	*/
}

