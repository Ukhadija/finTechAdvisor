package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;


public class ReccInsuranceController {
	Main m = new Main();

    @FXML
    private TextField needtext;

    @FXML
    private Button backbtn;

    @FXML
    private TextField preferencetext;

    @FXML
    private Button rbtn;
    
    public ReccInsuranceController() {
    	
    }
    public void intialize() {
    	
    }

    @FXML
    void goToUserAccount(ActionEvent event) throws IOException {
    	System.out.println("Back button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount2_.fxml");
    }

    @FXML
    void goToInsuranceOptions(ActionEvent event) throws IOException {
    	System.out.println("Recommend Button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/InsuranceOption.fxml");
    }

}
