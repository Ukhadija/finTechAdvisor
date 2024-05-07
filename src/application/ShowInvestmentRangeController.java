package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;

public class ShowInvestmentRangeController {
	Main m = new Main();
	
	public String Type;
	
    @FXML
    private TextArea InvestArea;

    @FXML
    private Button nbtn;
    
    public ShowInvestmentRangeController() {
    	System.out.println(this.txt);
		
    }
    public void intialize() {
    	
    	
    }
    
    private String txt;
    public void settxt(String s) {
		this.txt = s;
		this.displayID();
	}

    public void displayID() {
    	//System.out.println("SHow Type: " + this.txt);

    	System.out.println(this.txt);
    	
    	this.InvestArea.setText(this.txt);
    }
    @FXML
    void goToBack(ActionEvent event) throws IOException {
    	System.out.println("Inventory button clicked");
    	
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/InvestmentRange.fxml");
    }
	

}
