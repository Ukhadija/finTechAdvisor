package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.*;

public class FeedbackController {
	Main m = new Main();
    @FXML
    private Button nbtn;

    
    public FeedbackController() {
    	
    }
    public void intialize() {
    	
    }

    @FXML
    void goToHome(ActionEvent event) throws IOException {
    	System.out.println("Login button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount2_.fxml");
    }

 

}
