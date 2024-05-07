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

import java.util.Random;

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
    	String str1 ="Investment Strategy: \"Dividend Growth Portfolio\"\r\n"
    			+ "Objective: To build a portfolio of dividend-paying stocks that provide a steady stream of passive income and potential for long-term capital appreciation.\r\n"
    			+ "\r\n"
    			+ "Strategy Components:\r\n"
    			+ "\r\n"
    			+ "Stock Selection Criteria:\r\n"
    			+ "Identify established companies with a history of consistent dividend payments and potential for future dividend growth.\r\n"
    			+ "Look for companies with strong fundamentals, stable earnings, and sustainable dividend payout ratios.\r\n"
    			+ "Dividend Yield Focus:\r\n"
    			+ "Prioritize stocks with attractive dividend yields relative to the broader market.\r\n"
    			+ "Balance yield with dividend growth potential and financial health of the company.\r\n"
    			+ "Diversification:\r\n"
    			+ "Spread investments across multiple sectors to reduce sector-specific risks.\r\n"
    			+ "Diversify within sectors to avoid overexposure to any single stock.\r\n"
    			+ "Reinvestment of Dividends:\r\n"
    			+ "Reinvest dividends received into additional shares of dividend-paying stocks to benefit from compounding returns.\r\n"
    			+ "Utilize dividend reinvestment plans (DRIPs) offered by companies or brokerage platforms for automated reinvestment.\r\n"
    			+ "Monitoring and Adjustments:\r\n"
    			+ "Regularly monitor portfolio holdings and company performance.\r\n"
    			+ "Adjust holdings based on changes in dividend policies, earnings outlook, or market conditions.\r\n"
    			+ "Long-Term Focus:\r\n"
    			+ "Maintain a long-term investment horizon to capitalize on the power of compounding and dividend growth.\r\n"
    			+ "Resist the temptation to sell during market fluctuations, focusing on the income stream and potential for capital appreciation over time.";
    	String str2 = "Balanced Portfolio Approach\"\r\n"
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
    			+ "Avoid reactionary decisions based on short-term market movements.";
    	String str3 = "\"Thematic Investing\"\r\n"
    			+ "Objective: To capitalize on specific market themes, trends, or disruptive technologies through targeted investments in companies poised to benefit from these themes.\r\n"
    			+ "\r\n"
    			+ "Strategy Components:\r\n"
    			+ "\r\n"
    			+ "Identifying Investment Themes:\r\n"
    			+ "Research and identify macroeconomic, demographic, or technological trends driving future growth.\r\n"
    			+ "Examples of investment themes include renewable energy, artificial intelligence, e-commerce, aging population, cybersecurity, etc.\r\n"
    			+ "Selecting Theme-Driven Investments:\r\n"
    			+ "Choose stocks, exchange-traded funds (ETFs), or mutual funds aligned with selected investment themes.\r\n"
    			+ "Look for companies leading in innovation within the chosen themes or industries.\r\n"
    			+ "Diversification Within Themes:\r\n"
    			+ "Diversify investments within each theme to mitigate individual stock/company risks.\r\n"
    			+ "Consider exposure across different sectors or geographies related to the chosen themes.\r\n"
    			+ "Active Monitoring and Research:\r\n"
    			+ "Stay informed about developments and news related to selected themes.\r\n"
    			+ "Monitor portfolio holdings for changes in industry dynamics, regulatory environments, or competitive landscapes.\r\n"
    			+ "Long-Term Growth Focus:\r\n"
    			+ "Maintain a long-term investment horizon to allow themes to play out and deliver potential returns.\r\n"
    			+ "Be patient and avoid making short-term decisions based on market volatility or sentiment.\r\n"
    			+ "Risk Management:\r\n"
    			+ "Assess and manage risks associated with thematic investing, including sector-specific risks, regulatory changes, or technological disruptions.\r\n"
    			+ "Regularly review and adjust the portfolio based on evolving market conditions and theme performance.";
    	String str4 = "\"Value Investing\"\r\n"
    			+ "Objective: To identify undervalued stocks or assets trading below their intrinsic value and potentially generate above-average returns over the long term.\r\n"
    			+ "\r\n"
    			+ "Strategy Components:\r\n"
    			+ "\r\n"
    			+ "Fundamental Analysis:\r\n"
    			+ "Conduct in-depth fundamental analysis of individual companies to assess their financial health, earnings potential, and intrinsic value.\r\n"
    			+ "Look for stocks with strong balance sheets, consistent earnings, and attractive valuation metrics (e.g., low price-to-earnings ratio, price-to-book ratio).\r\n"
    			+ "Margin of Safety:\r\n"
    			+ "Seek stocks trading at a significant discount to their intrinsic value to provide a margin of safety against potential downside risks.\r\n"
    			+ "Determine a target purchase price based on intrinsic value calculations and market conditions.\r\n"
    			+ "Long-Term Horizon:\r\n"
    			+ "Adopt a patient, long-term investment horizon to allow the market to recognize the true value of undervalued assets.\r\n"
    			+ "Avoid short-term speculation and focus on the underlying fundamentals of the businesses.\r\n"
    			+ "Contrarian Approach:\r\n"
    			+ "Consider contrarian opportunities by investing in out-of-favor sectors or companies experiencing temporary setbacks.\r\n"
    			+ "Take advantage of market inefficiencies and irrational investor behavior.\r\n"
    			+ "Quality Over Quantity:\r\n"
    			+ "Emphasize quality over quantity when selecting investments; focus on a concentrated portfolio of undervalued stocks with strong fundamentals.\r\n"
    			+ "Avoid over-diversification, which may dilute potential returns from top investment picks.\r\n"
    			+ "Continuous Monitoring:\r\n"
    			+ "Regularly monitor portfolio holdings and industry developments.\r\n"
    			+ "Adjust positions based on changes in company fundamentals, market conditions, or valuation metrics.";
    	Random random = new Random();
        int randomNumber = random.nextInt(5);
        String finalnum = "";
        if (randomNumber == 1)
        {
        	finalnum = str1;
        }
        else if (randomNumber == 2){
        	finalnum = str2;
        }
        else if (randomNumber == 3){
        	finalnum = str3;
        }
        else if (randomNumber == 4){
        	finalnum = str4;
        }
        
    	this.StrategyText.setText(finalnum);
    	
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
