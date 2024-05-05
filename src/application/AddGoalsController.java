package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import finTechAdvisor.FinanicialGoals;
import javafx.event.ActionEvent;

import javafx.scene.control.DatePicker;

public class AddGoalsController {
	@FXML
	private Button add1;
	@FXML
	private TextField textfield;
	@FXML
	private DatePicker date1;
	
	public FinanicialGoals new_obj;
	Main m = new Main();
	
    public AddGoalsController() {
        new_obj = new FinanicialGoals();
    }

	// Event Listener on Button[#add1].onAction
	@FXML
	public void Added(ActionEvent event) throws IOException {
		// TODO Autogenerated
		
        new_obj.setGoal(textfield.getText());
		String ans =new_obj.getGoal();
		new_obj.setStatus("Newely Added");
		
		System.out.println("ans"+ans);
		System.out.println("new_obj.getDate()"+new_obj.getDate());
		System.out.println("new_obj.getStatus()"+new_obj.getStatus());
		
		System.out.println("************************");
		new_obj.setFinancialGoals(ans,new_obj.getDate(),new_obj.getStatus(),"Add",3);
		System.out.println("ans"+ans);
		System.out.println("new_obj.getDate()"+new_obj.getDate());
		System.out.println("new_obj.getStatus()"+new_obj.getStatus());	
		System.out.println("************************");
		
		if(new_obj!=null)
		{
			
		System.out.println("COMMING");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/fxml/FinanicialGoals.fxml"));
		FinancialGoalsController controller = new FinancialGoalsController(new_obj);
		loader.setController(controller);
		
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/FinancialGoals.fxml");
    	
		}
		
		else
		{
			System.out.println("EMPTYYYYY");
			
			
			
		}
		
		
		
	}

	
	
	// Event Listener on DatePicker[#date1].onAction
	@FXML
	public void pickdate(ActionEvent event) {
		// TODO Autogenerated
		LocalDate selectedDate = date1.getValue();
        String dateval = "";
		if (selectedDate != null) {
			Date date = java.sql.Date.valueOf(selectedDate);
             new_obj.setDate(date);
        }
		else
		{
            System.out.println("empty");
        }
		
	}
	
	
	
	
}
