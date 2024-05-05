package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import finTechAdvisor.FinanicialGoals;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;


public class FinancialGoalsController implements Initializable{
	@FXML
	private Button addinggoal;
	@FXML
	private Label LABEL1;
	@FXML
	private Button backbutton;
	public List<FinanicialGoals> data =new ArrayList<>();
	Main m = new Main();
	FinanicialGoals OBJ=null;
	
	
    public FinancialGoalsController() {
        // Default constructor
    }

    public FinancialGoalsController(FinanicialGoals o) {
        if (o != null) {
            OBJ = new FinanicialGoals();
            OBJ.setGoal(o.getGoal());
            OBJ.setDate(o.getDate());
            OBJ.number = o.number; // Assuming number is a public field
            OBJ.setChoice(o.getChoice());
            OBJ.setStatus(o.getStatus());

            // Check if OBJ is not null before accessing its properties
            if (OBJ != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(OBJ.number).append(". ");
                sb.append(OBJ.getGoal()).append(" (").append(OBJ.getDate()).append(") ");
                sb.append(OBJ.getStatus()).append("\n\n");

                // Set the text of LABEL1
                LABEL1.setText(sb.toString());
            }
        }}

	// Event Listener on Button[#addinggoal].onAction
	
	  @Override
	    public void initialize(URL url, ResourceBundle resourceBundle) {
	        List<FinanicialGoals> log = new ArrayList<>();
			FinanicialGoals obj1 = new FinanicialGoals("Save for vacation", new Date(), "InProgress", 1, "Add");
			FinanicialGoals obj2 = new FinanicialGoals("Buy a new House", new Date(), "InProgress", 2, "Add");

			log.add(obj1);
			log.add(obj2);
			
//			if (OBJ!=null)
//			{
//				log.add(OBJ);
//			}
			
			data = log;

			StringBuilder sb = new StringBuilder();
			for (FinanicialGoals goal : data) {
			    sb.append(goal.number).append(". ");
			    sb.append(goal.getGoal()).append(" (").append(goal.getDate()).append(") ");
			    sb.append(goal.getStatus()).append("\n\n");
			}

			LABEL1.setText(sb.toString());
	    }
	  
	public void Action_view(ActionEvent event) {
	
	}

		
	@FXML
	public void gotoaddgoalpage(ActionEvent event) throws IOException {
//		// TODO Autogenerated
//	    FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/fxml/AddGoals.fxml"));
//        Parent root = loader.load();
//        //HomeController contoller = loader.getController();
//        //contoller.sendaddinglistval(addinglist);
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        stage.setScene(new Scene(root));
//		System.out.println("executed");
		
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/AddGoals.fxml");
		
	}
	// Event Listener on TextField[#TESTFIELD1].onAction
	@FXML
	public void DISPLAYTEXT(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#backbutton].onAction
	@FXML
	public void BackPage(ActionEvent event) {
		// TODO Autogenerated
	}
}
