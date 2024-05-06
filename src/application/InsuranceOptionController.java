package application;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;

public class InsuranceOptionController {
	Main m = new Main();
	
	String insuranceOptions[][] = {
			{"Life Insurance", "Provides financial protection to the insured's beneficiaries upon the death of the insured.", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/lifeinsuranceoption.png"},
	        {"Health Insurance", "Covers medical expenses incurred by the insured, including hospitalization costs and medication fees.", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/healthinsuranceoption.jpg"},
	        {"Car Insurance", "Protects the insured against financial loss in case of theft or damage to the insured vehicle.", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/carinsuranceoption.jpg"},
	        {"Home Insurance", "Covers damages to the insured's home and its contents, as well as liability for accidents that occur on the property.", "file:/C:/Users/Zinoor%20Fatima/eclipse-workspace/FinTechAdvise%20Java/finTechAdvisor/Resources/images/homeinsuranceoption.jpg"}
			};

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
    public void initialize() {
    	//Select two different random indexes for insurance options
        Random random = new Random();
        int index1 = random.nextInt(insuranceOptions.length);
        int index2;
        do {
            index2 = random.nextInt(insuranceOptions.length);
        } while (index2 == index1); //Ensure index2 is different from index1

        //Set details for option 1
        name1.setText(insuranceOptions[index1][0]);
        desc1.setText(insuranceOptions[index1][1]);
        Image1.setImage(new Image(insuranceOptions[index1][2]));

        //Set details for option 2
        name2.setText(insuranceOptions[index2][0]);
        desc2.setText(insuranceOptions[index2][1]);
        Image2.setImage(new Image(insuranceOptions[index2][2]));
    	
    }

    @FXML
    void goToHome(ActionEvent event) throws IOException {
    	System.out.println("Back/Choose button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount2_.fxml");

    }

}
