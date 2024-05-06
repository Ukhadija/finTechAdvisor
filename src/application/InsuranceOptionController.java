package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;

public class InsuranceOptionController {
	Main m = new Main();

    @FXML
    private Label desc1;

    @FXML
    private Label desc2;

    @FXML
    private Button cbtn;

    @FXML
    private Button backbtn;

    @FXML
    private ImageView Image2;

    @FXML
    private ImageView Image1;

    @FXML
    private Label name2;

    @FXML
    private Label name1;
    
    public InsuranceOptionController() {
    	
    }
    public void intialize() {
    	
    }

    @FXML
    void goToHome(ActionEvent event) throws IOException {
    	System.out.println("Back/Choose button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount2_.fxml");

    }

}
