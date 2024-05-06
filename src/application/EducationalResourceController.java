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
	
	String resourceDetails[][] = {
			{"A Survival Guide", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/resource1.jpg", "What to do with your money when crisis hits by Michelle Singletary is the best survival guide you will ever need during a global crisis."},
			{"The Psychology of Money", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/resource2.jpg", "Timeless lessons about money in form of a book by Morgan Housel. It teaches about wealth, greed, and happiness."},
			{"The Intelligent Investor", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/resource3.jpg", "A guide to becoming an intelligent investor by Benjamin Graham. he shares his findings in form of a book that is a great start to becoming a great investor."},
			{"Bitcoins and Blockchain", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/resource4.jpg", "This an introduction to Crytocurrency by Antony Lewis. It covers the basics of bitcoins and blockchain."},
			{"Secrets of the Millionare Mind", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/resource5.jpg", "A NewYork Times Bestseller by T. Harv Eker. He thinks one should think rick to het rich and writes all the secrets to becoming a millionaire."},
			{"Lords of Finance", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/resource6.jpg", "An inetresting book written by liaquat ahamed in the 1929 timeline, about depression and how bankers broke the world."}
			};
	

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
    private Button Nextbtn;
    
    public EducationalResourceController() {
    	
    }
    public void initialize() {
    	for (int i = 0; i < resourceDetails.length; i++) {
            String ResourceName = resourceDetails[i][0];
            String imagePath = resourceDetails[i][1];

            switch (i) {
                case 0:
                    resourcename1.setText(ResourceName);
                    Image1.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 1:
                	resourcename2.setText(ResourceName);
                    Image2.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 2:
                	resourcename3.setText(ResourceName);
                    Image3.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 3:
                	resourcename4.setText(ResourceName);
                    Image4.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 4:
                	resourcename5.setText(ResourceName);
                    Image5.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 5:
                	resourcename6.setText(ResourceName);
                    Image6.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                default:
                    break;
            }
        }
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
    	
    	Hyperlink link = (Hyperlink) event.getSource();
        int linkIndex = Integer.parseInt(link.getId().substring(12)) - 1; // Extract button index from id
        
        // Get details from resourceDetails array
        String name = resourceDetails[linkIndex][0];
        String desc = resourceDetails[linkIndex][2];
        String path = resourceDetails[linkIndex][1];
        
        System.out.println("Resource selected: "+name+", "+desc);
    	
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeSceneToDescription(s, "resources/fxml/ResourceDetails.fxml", name, desc, path);
    }

    @FXML
    void goToNextPage(ActionEvent event) throws IOException {
    	System.out.println("Go to next page educational resource");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/EducationalResource2.fxml");

    }


}

