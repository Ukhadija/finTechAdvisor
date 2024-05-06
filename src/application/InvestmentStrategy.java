package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.*;

public class InvestmentStrategy {
	Main m = new Main();
    @FXML
    private TextArea StrategyText;

    @FXML
    private Button nbtn;
    
    @FXML
    private Slider risk;

    @FXML
    private TextField qtxt;

    @FXML
    private Button calc;
    
    public InvestmentStrategy() {
    	
    }
    public void intialize() {
    	
    }

    @FXML
    void goToHome(ActionEvent event)throws IOException {
    	System.out.println("Home button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount3_.fxml");
    }

    
    @FXML
    void CalculateStrategy(ActionEvent event) throws IOException{
    	this.StrategyText.setText("Balanced Portfolio Approach\"\r\n"
    			+ "Objective: To achieve long-term growth while managing risk through a diversified investment portfolio.\r\n"
    			+ "\r\n"
    			+ "Strategy Components:\r\n"
    			+ "\r\n"
    			+ "Asset Allocation:\r\n"
    			+ "Allocate funds across different asset classes based on risk tolerance and investment horizon.\r\n"
    			+ "Example allocation:\r\n"
    			+ "60% Equities (Stocks): Invest in a mix of large-cap, mid-cap, and small-cap stocks across various sectors.\r\n"
    			+ "30% Fixed Income (Bonds): Include government bonds, corporate bonds, and high-quality municipal bonds for income and stability.\r\n"
    			+ "10% Alternative Investments: Allocate a small portion to alternative assets like real estate investment trusts (REITs), commodities, or alternative strategies (e.g., managed futures).\r\n"
    			+ "Diversification:\r\n"
    			+ "Within each asset class, diversify holdings to reduce concentration risk.\r\n"
    			+ "For equities, diversify across industries and geographic regions.\r\n"
    			+ "For fixed income, diversify across different bond types and maturities.\r\n"
    			+ "Rebalancing:\r\n"
    			+ "Regularly rebalance the portfolio to maintain target asset allocations.\r\n"
    			+ "Rebalancing involves selling overweighted assets and buying underweighted assets to bring the portfolio back in line with the target allocation.\r\n"
    			+ "Risk Management:\r\n"
    			+ "Incorporate risk management techniques such as setting stop-loss orders for individual stocks or using asset allocation to control overall portfolio risk.\r\n"
    			+ "Use asset classes with low correlation to reduce portfolio volatility.\r\n"
    			+ "Long-Term Perspective:\r\n"
    			+ "Maintain a long-term investment horizon to benefit from compounding returns and ride out market fluctuations.\r\n"
    			+ "Avoid reactionary decisions based on short-term market movements.");
    	
    }
    
    /*
    @FXML
    void activateService(ActionEvent event) throws IOException{
    	System.out.println("Send button clicked");
    	
    	String query = qtxt.getText();
    	String ans = "Okii";
    	
    	String test1 = "Hi";
    	String test2 = "I have an issue";
    	String test3 = "I registered a parcel but got no confirmation";
    	String test4 = "Thankyou";
    	
    	
    	if(query.equals(test1)) {
    		ans = "Hey, Welcome to Post Office Customer Service";
    	}
    	else if (query.equals(test2)) {
    		ans = "Sure. Do Tell. We are here to help you";
    	}
    	else if (query.equals(test3) ) {
    		ans = "We will look into it and get back to you. Thanks for informing us.";
    	}
    	else if (query.equals(test4)) {
    		ans = "We are always here to help you";
    	}
    	
    	tArea.setText(ans);
    }*/

}
