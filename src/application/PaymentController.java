package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class PaymentController {
	Main m = new Main();
    @FXML
    private TextField Atxt;

    @FXML
    private TextField Atxt1;
    
    @FXML
    private TextField Atxt11;

    @FXML
    private RadioButton Ebtn;
    
    @FXML
    private RadioButton Mbtn;

    @FXML
    private Button Pbtn;
    
    @FXML
    private RadioButton Sbtn;

    @FXML
    private Hyperlink blink;
    
    public PaymentController() {
    	
    }
    public void intialize() {
    	
    }

    @FXML
    void makePayment(ActionEvent event)throws IOException {
    	System.out.println("Home button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/SignUp.fxml");
    }
    
    @FXML
    void goToRegister(ActionEvent event)throws IOException {
    	System.out.println("Home button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/SignUp.fxml");
    }
}
