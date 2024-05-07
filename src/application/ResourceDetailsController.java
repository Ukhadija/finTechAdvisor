package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;

public class ResourceDetailsController {
	Main m = new Main();
	
	String Name= "Rseource Name!";
	String Description = "Description: ";
	String Imagepath = "file:Resources/images/lifeinsuranceoption.jpg";

    @FXML
    private Button backbtn;

    @FXML
    private ImageView rimage;

    @FXML
    private Label resourcename;

    @FXML
    private Label desc;
    
    public ResourceDetailsController() {
    	
    }
    public void initialize() {
    	
    }
    
    void setAttributes(String name, String description, String path) {
    	Name = name;
    	Description += description;
    	Imagepath = path;
    	
    	resourcename.setText(Name);
    	desc.setText(Description);
        rimage.setImage(new javafx.scene.image.Image(Imagepath));
    }

    @FXML
    void goToEducationalResource(ActionEvent event) throws IOException {
    	System.out.println("Back button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/EducationalResource.fxml");
    }

}
