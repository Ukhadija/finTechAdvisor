package finTechAdvisor;

import java.util.Date;

public class FinanicialGoals {
	private String goal;
	private Date date;
	private String status;
	public int number;
	private String choice;
	
	public FinanicialGoals()
	{
		
	}
	
    public FinanicialGoals(String goal, Date date, String status, int number, String choice) {
        this.goal = goal;
        this.date = date;
        this.status = status;
        this.number = number;
        this.choice = choice;
    }
	
    public void setFinancialGoals(String g, Date d, String s,String c,int n) {
    	System.out.println("COMES ");	
    	if(c.equals("Add"))
    	{
    		
    		number+=1;
    		FinTechAdvisor obj = new FinTechAdvisor(); ;
    		obj.AddGoal(g, d, s);
    		
    	}

    	
    	if(c.equals("Delete"))
    	{
    		if(n==number)
    		{
    			g="";
    			d=null;
    			s="";
    			
    		}
    		
    	}
    	

    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public void setNumber(int i) {
		// TODO Auto-generated method stub
		this.number=i;
		
	}
	

}
