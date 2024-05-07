package finTechAdvisor;

public class FinancialMontoring {
	
	public float investment;
	public float debt;
	public float profit;
	public float loss;
	public float taxes;
	public float saving;
	public BankAccount bank_details;
	
	
	public FinancialMontoring()
	{
		
	}
	
	
    public FinancialMontoring(float investment, float debt, float profit,float loss, float taxes, float saving, BankAccount bank_details) {
        this.investment = investment;
        this.debt = debt;
        this.profit = profit;
        this.loss=loss;
        this.taxes = taxes;
        this.saving = saving;
        this.bank_details = bank_details;
    }
	
	
	public void montoring(float profit,float saving,float debt,float investment,float taxes,double currbalance)
	{
		if(profit<0)
		{
			System.out.println("You dont have any profit ");
		}
		
		    System.out.println("Financial Monitoring Overview:");
		    System.out.println("Balance:" + currbalance);
		    System.out.println("Investment:" + investment);
		    System.out.println("Debt:"+ debt);
		    System.out.println("Profit:" + profit);
		    System.out.println("Taxes:" + taxes );
		    System.out.println("Saving:" + saving);

		
	}
	
	public String strategies(double balance,float saving,float debt)
	{
		if(balance==0 && debt!=0 && saving==0)
		{
			return "You are not in position to invest. It's important to prioritize paying off your debt.";
		}
		
		if(balance!=0 && saving==0 && debt>0)
		{
			return "Since you have debt, it's important to prioritize paying it off while also considering starting a small emergency savings fund.";
		}
		
		if(balance!=0 && saving>0 && debt==0)
		{
			return "Its better to invest in some stock market or you can also go for Cryptocurrency or real estate  ";
		}
		if(balance!=0 && saving>0 && debt!=0)
		{
			return "It's better to pay off your debt first, and with the remaining value, you can consider investing in bonds or opting for cryptocurrency.";
		}
		
		return "";
		
	}
	

	
	

}
