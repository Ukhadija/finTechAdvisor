package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;


public class EducationalResource2Controller {
	Main m = new Main();
	
	String resourceDetails[][] = {
			{"Business and Finance", "file:Resources/images/resource7.jpg", "A journal of business and finance written by Escience Press to share his thoughts about business, finance, and their relation."},
			{"Int. Business and Finance", "file:Resources/images/resource8.jpg", "A research paper that explains the methods and conclusions of a groundbreaking research on international business and it's effects on finance."},
			{"Financial Research", "file:Resources/images/resource9.jpg", "A research journal on the financial research conducted by sciedu. It summarizes the findings in a concise and understandable manner."},
			{"Financial Times", "file:Resources/images/resource10.jpg", "A newspaper that comes out daily talking about the finances and the financial issues across the globe."},
			};

	
    @FXML
    private Hyperlink resourcename7;

    @FXML
    private Button PreviousBtn;

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
    private Button backbtn;

    @FXML
    private Hyperlink resourcename9;
    
    public EducationalResource2Controller() {
    	
    }
    
    public void initialize() {
    	for (int i = 0; i < resourceDetails.length; i++) {
            String ResourceName = resourceDetails[i][0];
            String imagePath = resourceDetails[i][1];

            switch (i) {
                case 0:
                    resourcename7.setText(ResourceName);
                    Image7.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 1:
                	resourcename8.setText(ResourceName);
                    Image8.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 2:
                	resourcename9.setText(ResourceName);
                    Image9.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 3:
                	resourcename10.setText(ResourceName);
                    Image10.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                
                default:
                    break;
            }
        }
    }

    @FXML
    void goToPreviousPage(ActionEvent event) throws IOException  {
    	System.out.println("Go to previous page educational resource");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/EducationalResource.fxml");

    }

    @FXML
    void goToResourceDetails(ActionEvent event) throws IOException {
    	System.out.println("Go to resource details");
    	
    	Hyperlink link = (Hyperlink) event.getSource();
        int linkIndex = Integer.parseInt(link.getId().substring(12)) - 7; // Extract button index from id
        
        // Get details from resourceDetails array
        String name = resourceDetails[linkIndex][0];
        String desc = resourceDetails[linkIndex][2];
        String path = resourceDetails[linkIndex][1];
        
        System.out.println("Resource selected: "+name+", "+desc);
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeSceneToDescription(s, "resources/fxml/ResourceDetails.fxml", name, desc, path);

    }

    @FXML
    void goToHome(ActionEvent event) throws IOException {
    	System.out.println("Back button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount2_.fxml");

    }

}

