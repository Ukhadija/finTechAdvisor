package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;

public class ChatwithAdvisorController {
	Main m = new Main();
	
	String advisorName = "Advisor!";
	
    @FXML
    private TextArea tArea;

    @FXML
    private Button hbtn;
    
    @FXML
    private Label Label1;

    @FXML
    private TextField qtxt;

    @FXML
    private Button sbtn;
    
    public ChatwithAdvisorController() {
    	
    }
    public void initialize() {
    	
    }
    
    public void setAdvisorName( String name) {
    	advisorName = name;
    	String text = "Chat with "+advisorName;
    	Label1.setText(text);
    }

    @FXML
    void goToFindAdvisor(ActionEvent event)throws IOException {
    	System.out.println("Home button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/ConnectWithAdvisor.fxml");
    }

    @FXML
    void activateService(ActionEvent event) throws IOException{
    	System.out.println("Send button clicked");
    	
    	String query = qtxt.getText();
       	String advice1 = "Let me look into it. I'll get back to you.";
    	
    	if(! query.isEmpty()) {
    		tArea.setText(advice1);
    	}
    }

}
