package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InvestmentRange {
	Main m = new Main();
    @FXML
    private Button stocks;

    @FXML
    private Button bonds;
    
    @FXML
    private Button mfs;

    @FXML
    private Button etf;
    
    @FXML
    private Button cd;

    @FXML
    private Button ann;

    @FXML
    private Button options;
    
	public InvestmentRange() {
	    	
	    }
    public void intialize() {
    	
    }

    
    @FXML
    void goToHome(ActionEvent event) throws IOException {
    	System.out.println("Login button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/UserAccount3_.fxml");
    }
    
    @FXML
    void goToStocks(ActionEvent event) throws IOException {
    	System.out.println("Login button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	String stock = "Market Trends: Stock performance can be influenced by overall market trends, economic conditions, and industry-specific factors.\r\n"
    			+"Transaction Costs: Fees associated with buying and selling stocks, such as brokerage commissions.\r\n"
    			+ "Market Risk: The value of stocks can be affected by broader market movements and economic conditions."
    			+ "Diversification: Spreading investments across different stocks and asset classes can help manage risk. "
    			+"Long-Term Perspective: Stock investments are generally suited for long-term growth due to market fluctuations in the short term.\r\n"
    			+ "Research and Due Diligence: Understanding the company's financials, industry dynamics, and market conditions is essential for informed investment decisions."
    			+"Economic Conditions: Interest rates, inflation, and GDP growth can affect the performance of different sectors.\r\n"
    			+ "Market Sentiment: Investor sentiment and market psychology can drive short-term price movements.";
    	m.changeScenewithString(s, "resources/fxml/ShowIVR.fxml", stock);
    }
    
    @FXML
    void goToBonds(ActionEvent event) throws IOException {
    	System.out.println("Login button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	String Bonds = "Performance History:\r\n"
    			+ "Interest Income: Bonds typically provide regular interest payments, offering a predictable income stream.\r\n"
    			+ "Risk:\r\n"
    			+ "Credit Risk: The risk that the issuer may default on interest payments or fail to repay the principal amount at maturity.\r\n"
    			+ "Inflation Risk: Bonds may lose purchasing power if inflation exceeds the bond's yield.\r\n"
    			+ "Types of Bonds:\r\n"
    			+ "Government Bonds: Issued by governments (e.g., US Treasuries), considered low-risk due to backing by the government.\r\n"
    			+ "Corporate Bonds: Issued by corporations, offer higher yields but with varying levels of credit risk.\r\n"
    			+ "Municipal Bonds: Issued by state or local governments, often used to fund public projects, offering tax advantages to investors.\r\n"
    			+ "Fees:\r\n"
    			+ "Transaction Costs: Fees associated with buying or selling bonds, including broker commissions.\r\n"
    			+ "Management Fees: Mutual funds or ETFs that invest in bonds may charge management fees.\r\n"
    			+ "Factors Influencing Performance:\r\n"
    			+ "Interest Rate Environment: Changes in interest rates impact bond prices and overall bond market performance.\r\n"
    			+ "Credit Quality: Higher-rated bonds (investment-grade) tend to be less volatile compared to lower-rated (high-yield) bonds.\r\n"
    			+ "Duration and Maturity: Longer-duration bonds are more sensitive to interest rate changes.\r\n"
    			+ "Investment Considerations:\r\n"
    			+ "Diversification: Allocating investments across different types of bonds can reduce risk.\r\n"
    			+ "Yield Curve Analysis: Understanding the yield curve helps assess interest rate expectations.\r\n"
    			+ "Credit Analysis: Evaluating the creditworthiness of bond issuers is crucial for managing credit risk.\r\n"
    			+ "Tax Considerations: Municipal bonds offer tax advantages for certain investors.";
    	m.changeScenewithString(s, "resources/fxml/ShowIVR.fxml", Bonds);
    }
    
    @FXML
    void goToMF(ActionEvent event) throws IOException {
    	System.out.println("Login button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	String MF = "Performance History:\r\n"
    			+ "Diversification: Mutual funds offer diversification across multiple securities, reducing individual investment risk.\r\n"
    			+ "Professional Management: Fund managers aim to achieve investment objectives and generate returns for investors.\r\n"
    			+ "Historical Returns: Mutual fund returns vary based on market conditions, asset allocation, and fund management strategies.\r\n"
    			+ "Risk:\r\n"
    			+ "Market Risk: Mutual funds are subject to market fluctuations affecting the value of underlying securities.\r\n"
    			+ "Manager Risk: Poor investment decisions by fund managers can impact fund performance.\r\n"
    			+ "Liquidity Risk: Some mutual funds may face liquidity constraints, affecting redemption options.\r\n"
    			+ "Fees:\r\n"
    			+ "Expense Ratios: Annual fees covering fund management, administrative, and operating expenses.\r\n"
    			+ "Sales Loads: Front-end or back-end sales charges (loads) on certain mutual fund purchases or sales.\r\n"
    			+ "Transaction Costs: Costs associated with buying and selling securities within the fund.\r\n"
    			+ "Factors Influencing Performance:\r\n"
    			+ "Asset Allocation: Allocation among stocks, bonds, and cash impacts fund performance.\r\n"
    			+ "Management Style: Active or passive management strategies affect fund returns.\r\n"
    			+ "Market Conditions: Economic cycles and market trends influence mutual fund performance.\r\n"
    			+ "Investment Considerations:\r\n"
    			+ "Investment Objectives: Choose funds aligned with specific investment goals (e.g., growth, income, capital preservation).\r\n"
    			+ "Risk Tolerance: Assess personal risk tolerance before selecting mutual funds.\r\n"
    			+ "Expense Considerations: Compare expense ratios and fees across funds.";
    	m.changeScenewithString(s, "resources/fxml/ShowIVR.fxml", MF);
    }
    
    @FXML
    void goToETF(ActionEvent event) throws IOException {
    	System.out.println("Login button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	String ETF = "Performance History:\r\n"
    			+ "Market Index Tracking: ETFs aim to replicate the performance of a specific index or asset class.\r\n"
    			+ "Diversification: ETFs offer diversification by investing in a broad range of securities within a single fund.\r\n"
    			+ "Historical Returns: ETF returns vary based on underlying market conditions and index performance.\r\n"
    			+ "Risk:\r\n"
    			+ "Market Risk: ETFs are subject to market volatility and fluctuations affecting the value of underlying securities.\r\n"
    			+ "Tracking Error: Variance in ETF performance compared to the underlying index.\r\n"
    			+ "Liquidity Risk: Some ETFs may have lower trading volume and liquidity, affecting bid-ask spreads.\r\n"
    			+ "Fees:\r\n"
    			+ "Expense Ratios: Annual fees covering fund management, administrative, and operating expenses.\r\n"
    			+ "Brokerage Commissions: Transaction costs incurred when buying or selling ETF shares.\r\n"
    			+ "Spread Costs: Bid-ask spreads impact buying and selling prices of ETF shares.\r\n"
    			+ "Factors Influencing Performance:\r\n"
    			+ "Index Performance: ETF performance closely mirrors the underlying index or asset class.\r\n"
    			+ "Asset Allocation: Allocation among stocks, bonds, or other securities impacts ETF returns.\r\n"
    			+ "Market Conditions: Economic cycles and market trends influence ETF performance.\r\n"
    			+ "Investment Considerations:\r\n"
    			+ "Diversification: ETFs provide easy access to diversified portfolios across various asset classes.\r\n"
    			+ "Expense Considerations: Compare expense ratios and fees across different ETFs.\r\n"
    			+ "Liquidity: Consider trading volume and liquidity of ETF shares.";
    	m.changeScenewithString(s, "resources/fxml/ShowIVR.fxml", ETF);
    }
    
    @FXML
    void goToCD(ActionEvent event) throws IOException {
    	System.out.println("Login button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	String CD = "Characteristics:\r\n"
    			+ "Fixed-Term: CDs have specific maturity periods (e.g., 3 months, 6 months, 1 year, etc.) during which funds must remain deposited.\r\n"
    			+ "Fixed Interest Rate: CDs offer a guaranteed interest rate for the duration of the term.\r\n"
    			+ "Low Risk: CDs are considered low-risk investments because they are insured by the FDIC (for banks) or NCUA (for credit unions) up to certain limits.\r\n"
    			+ "Benefits:\r\n"
    			+ "Safety of Principal: CDs offer principal protection, ensuring that your initial deposit (up to insured limits) will be returned at maturity.\r\n"
    			+ "Predictable Returns: The fixed interest rate provides certainty about future earnings.\r\n"
    			+ "Variety of Terms: CDs come with various term options to suit different investment needs.\r\n"
    			+ "Risks:\r\n"
    			+ "Interest Rate Risk: If interest rates rise after purchasing a CD, you may miss out on potentially higher rates available in the market.\r\n"
    			+ "Early Withdrawal Penalties: Accessing funds before the CD matures typically incurs penalties, reducing overall returns.\r\n"
    			+ "Inflation Risk: CD returns may not keep pace with inflation, potentially eroding purchasing power over time.\r\n"
    			+ "Considerations:\r\n"
    			+ "Liquidity Needs: CDs are less liquid compared to other investments due to early withdrawal penalties.\r\n"
    			+ "Interest Rate Environment: Consider prevailing interest rates and market conditions before investing in a CD.\r\n"
    			+ "FDIC/NCUA Insurance Limits: Ensure that your deposits are within the insured limits to protect against institution default.\r\n"
    			+ "Investment Strategy:\r\n"
    			+ "Laddering: Spread investments across multiple CDs with staggered maturities to balance liquidity and interest rate risk.\r\n"
    			+ "Income Stream: Use CDs to generate a stable income stream with predictable interest payments.\r\n"
    			+ "Diversification: Combine CDs with other investment types to achieve a balanced portfolio based on risk tolerance and financial goals.";
    	m.changeScenewithString(s, "resources/fxml/ShowIVR.fxml", CD);
    }
    
    @FXML
    void goToAnnuities(ActionEvent event) throws IOException {
    	System.out.println("Login button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	String Annuities = "Annuities Overview:\r\n"
    			+ "Annuities are financial products offered by insurance companies that provide regular payments to the annuitant (the person who owns the annuity) over a specified period, often in retirement.\r\n"
    			+ "\r\n"
    			+ "Key Characteristics:\r\n"
    			+ "Payment Structure: Annuities can be structured to provide a series of payments over time, either immediately (immediate annuities) or at a later date (deferred annuities).\r\n"
    			+ "Tax-Deferred Growth: Earnings within an annuity grow tax-deferred until withdrawals are made.\r\n"
    			+ "Lifetime Income: Some annuities offer the option of lifetime payments, providing income for as long as the annuitant lives.\r\n"
    			+ "Considerations:\r\n"
    			+ "Fees and Expenses: Annuities may have fees, including administrative fees, mortality and expense charges, and surrender charges for early withdrawals.\r\n"
    			+ "Guarantees: Some annuities come with guarantees such as minimum interest rates or minimum income payments.\r\n"
    			+ "Liquidity: Annuities typically have restrictions on withdrawals, with penalties for early access to funds.";
    	m.changeScenewithString(s, "resources/fxml/ShowIVR.fxml", Annuities);
    }
    @FXML
    void goToOptions(ActionEvent event) throws IOException {
    	System.out.println("Login button clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	String options = "Options Overview:\r\n"
    			+ "Options are financial derivatives that give the holder the right, but not the obligation, to buy or sell an underlying asset at a predetermined price (strike price) within a specific period (until expiration).\r\n"
    			+ "\r\n"
    			+ "Key Characteristics:\r\n"
    			+ "Call Option: Gives the holder the right to buy the underlying asset at a specified price before or at expiration.\r\n"
    			+ "Put Option: Gives the holder the right to sell the underlying asset at a specified price before or at expiration.\r\n"
    			+ "Expiration Date: Options have expiration dates after which they become invalid.\r\n"
    			+ "Premium: The price paid to purchase an option contract.\r\n"
    			+ "Benefits:\r\n"
    			+ "Leverage: Options allow investors to control a larger position with a smaller upfront investment compared to buying or selling the underlying asset.\r\n"
    			+ "Hedging: Options can be used to hedge against price movements and manage risk in a portfolio.\r\n"
    			+ "Versatility: Options offer flexibility in trading strategies, including bullish, bearish, and neutral positions.\r\n"
    			+ "Risks:\r\n"
    			+ "Limited Life: Options have a finite lifespan and can expire worthless if not exercised.\r\n"
    			+ "Volatility Risk: Option prices are influenced by market volatility, impacting potential gains or losses.\r\n"
    			+ "Complexity: Options trading involves understanding different strategies and factors affecting option pricing.\r\n"
    			+ "Potential Losses: Depending on the strategy used, options trading can result in significant losses if not managed properly.\r\n"
    			+ "Considerations:\r\n"
    			+ "Strategy Selection: Choose option strategies based on market outlook, risk tolerance, and investment objectives.\r\n"
    			+ "Risk Management: Set clear risk parameters and use stop-loss orders or position sizing to manage potential losses.\r\n"
    			+ "Market Conditions: Consider market volatility, liquidity, and timing when trading options.\r\n"
    			+ "Education and Research: Understand the mechanics of options trading and stay informed about market developments.";
    	m.changeScenewithString(s, "resources/fxml/ShowIVR.fxml", options);
    }
    
    
}
