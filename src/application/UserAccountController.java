package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;




public class UserAccountController {
	Main m = new Main();
    @FXML
    private Button Lbtn;

    @FXML
    private Button Cbtn;

    @FXML
    private Button Obtn;

    @FXML
    private Button rbtn;

    @FXML
    private Button Tbtn;
    
    
    //private Customer cus;
    
    public UserAccountController() {
    	
    }
    public void intialize() {
    	
    }
    
    /*void setCustomer(Customer cus) {
    	this.cus = cus;
    }*/

    
    @FXML
    void Logout(ActionEvent event) throws IOException {
    	System.out.println("Back link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	//m.changeScene(s, "resources/fxml/Home.fxml");
    }
    
    @FXML
    void goToNextPage(ActionEvent event) throws IOException {
    	System.out.println("Customer Service link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount2_.fxml");
    }
    @FXML
    void goToPrevPage2(ActionEvent event) throws IOException {
    	System.out.println("Customer Service link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount.fxml");
    }
    
    @FXML
    void goToPrevPage3(ActionEvent event) throws IOException {
    	System.out.println("Customer Service link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount2_.fxml");
    }
    
    @FXML
    void goToNextPage2(ActionEvent event) throws IOException {
    	System.out.println("Customer Service link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount3_.fxml");
    }

    @FXML
    void goToFinancialAdvice(ActionEvent event) throws IOException {
    	System.out.println("Register Parcel link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/financialadviceform.fxml");
    	//change resgiater
    }

    @FXML
    void goToDashboard(ActionEvent event)throws IOException {
    	System.out.println("Track Parcel link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/Dashboard.fxml");
    	
    }

    @FXML
    void goToFinancialGoals(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/fxml/FinancialGoals.fxml"));
//        Parent root = loader.load();
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        stage.setScene(new Scene(root));
//        System.out.println("Back");
        
    	System.out.println("link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/FinancialGoals.fxml");

    }


    @FXML
    void goToCustomerService(ActionEvent event) throws IOException {
    	System.out.println("Customer Service link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/CustomerService.fxml");
    }
    
    @FXML
    void goToConnectAdvisor(ActionEvent event) throws IOException {
    	System.out.println("Register Parcel link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/ConnectWithAdvisor.fxml");
    	//change resgiater
    }

    @FXML
    void goToReccInsurance(ActionEvent event)throws IOException {
    	System.out.println("Track Parcel link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/ReccInsurance.fxml");
    	
    }

    @FXML
    void goToEducationalResources(ActionEvent event) throws IOException {
    	System.out.println("Order Supplies link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/EducationalResource.fxml");
    	//change fjriojgior
    }
    
    @FXML
    void goToInvRange(ActionEvent event)throws IOException {
    	System.out.println("Track Parcel link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/InvestmentRange.fxml");
    	
    }

    @FXML
    void goToInvStrategy(ActionEvent event) throws IOException {
    	System.out.println("Order Supplies link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/InvStrategy.fxml");
    	//change fjriojgior
    }

    @FXML
    void goToFeedback(ActionEvent event) throws IOException {
    	System.out.println("Customer Service link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/Feedback.fxml");
    }
    
    @FXML
    void goToRegisterParcel(ActionEvent event) throws IOException {
    	System.out.println("Register Parcel link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	//m.changeRegister(s, "resources/fxml/RegisterParcel.fxml", cus);
    }

    @FXML
    void goToTrackParcel(ActionEvent event)throws IOException {
    	System.out.println("Track Parcel link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	//m.changeScene(s, "resources/fxml/TrackParcel.fxml");
    }

    @FXML
    void goToInventory(ActionEvent event) throws IOException {
    	System.out.println("Order Supplies link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	//m.changeInventory(s, "resources/fxml/Inventory.fxml", cus);
    }

}
