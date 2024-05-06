package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;


public class ConnectwithAdvisorController {
	Main m = new Main();
	
	String advisorDetails[][] = {
			{"Asher Khan", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/Advisor1.jpg"},
			{"Ume Khadija", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/Advisor2.jpg"},
			{"Bilal Shakeel", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/Advisor3.jpg"},
			{"Haniya Usman", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/Advisor4.jpg"},
			{"M. Ali", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/Advisor5.jpg"}
			};

    @FXML
    private Button chatbtn5;

    @FXML
    private Button chatbtn4;

    @FXML
    private Button hbtn;

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
    private Label name5;

    @FXML
    private Label name4;

    @FXML
    private Label name3;

    @FXML
    private Label name2;

    @FXML
    private Button chatbtn3;

    @FXML
    private Label name1;

    @FXML
    private Button chatbtn2;

    @FXML
    private Button chatbtn1;
    
    public ConnectwithAdvisorController() {
    	
    }

    public void initialize() {
        for (int i = 0; i < advisorDetails.length; i++) {
            String advisorName = advisorDetails[i][0];
            String imagePath = advisorDetails[i][1];

            switch (i) {
                case 0:
                    name1.setText(advisorName);
                    Image1.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 1:
                    name2.setText(advisorName);
                    Image2.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 2:
                    name3.setText(advisorName);
                    Image3.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 3:
                    name4.setText(advisorName);
                    Image4.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                case 4:
                    name5.setText(advisorName);
                    Image5.setImage(new javafx.scene.image.Image(imagePath));
                    break;
                default:
                    break;
            }
        }
    }

    @FXML
    void goToUserAccount(ActionEvent event) throws IOException {
    	System.out.println("Back button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount2_.fxml");

    }

    @FXML
    void goToChatAdvisor(ActionEvent event) throws IOException {
        System.out.println("Chat button clicked");
        Button btn = (Button) event.getSource();
        int btnIndex = Integer.parseInt(btn.getId().substring(7)) - 1; // Extract button index from id
        String advisorName = advisorDetails[btnIndex][0];
        
        System.out.println("Advisor selected is: "+advisorName);
        Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
        m.changeScenewithParameter(s, "resources/fxml/ChatwithAdvisor.fxml",advisorName);
    }


}
