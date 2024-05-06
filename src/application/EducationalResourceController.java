package application;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;


public class EducationalResourceController {
	Main m = new Main();

	@FXML
    private ImageView Image6;

    @FXML
    private ImageView Image5;

    @FXML
    private ImageView Image4;

    @FXML
    private ImageView Image3;

    @FXML
    private ImageView Image2;

    @FXML
    private ImageView Image1;

    @FXML
    private Hyperlink resourcename5;

    @FXML
    private Hyperlink resourcename6;

    @FXML
    private Hyperlink resourcename3;

    @FXML
    private Hyperlink resourcename4;

    @FXML
    private Hyperlink resourcename1;

    @FXML
    private Hyperlink resourcename2;

    @FXML
    private Button backbtn;

    @FXML
    private Button NxtBtn;
    
    @FXML
    private Hyperlink resourcename7;

    @FXML
    private Hyperlink resourcename8;

    @FXML
    private ImageView Image9;

    @FXML
    private ImageView Image8;

    @FXML
    private ImageView Image7;

    @FXML
    private ImageView Image10;

    @FXML
    private Hyperlink resourcename10;

    @FXML
    private Button PrevBtn;

    @FXML
    private Hyperlink resourcename9;
    
    public EducationalResourceController() {
    	
    }
    public void initialize() {
    	
    }

    @FXML
    void goToHome(ActionEvent event) throws IOException {
    	System.out.println("Back button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount2_.fxml");
    }

    @FXML
    void goToResourceDetails(ActionEvent event) throws IOException {
    	System.out.println("Go to resource details");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/ResourceDetails.fxml");
    }

    @FXML
    void goToNextPage(ActionEvent event) throws IOException {
    	System.out.println("Go to next page educational resource");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/EducationalResource2.fxml");

    }
    
    @FXML
    void goToPrevPage(ActionEvent event) throws IOException {
    	System.out.println("Go to previous page educational resource");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/EducationalResource.fxml");
    }

}
