package finTechAdvisor;
import java.util.ArrayList;
import java.util.List;



public class FinTechAdvisor {

	private ArrayList<Customer>  Customers;
	private ArrayList<Bank> banks;
	
	public FinTechAdvisor() 
	{
		
		Customers = new ArrayList<Customer>();
		banks = new ArrayList<Bank>();
		initializeBanks();
		
	}
	public void initializeBanks()
	{
		Bank Faysal = new Bank("Faysal");
		Bank Habib = new Bank("Habib");
		Bank EasyPaisa = new Bank("EasyPaisa");
	}
	
	public Customer LoginCustomer(String Username, String Password)
	{
		System.out.println(Username+" "+ Password);
		/*
		MySqlHandler sql = new MySqlHandler();
		Connection conn = sql.getCon();
		Statement stmt = sql.getStmt();
		ResultSet rs, rs1;
		try {
			
			rs = stmt.executeQuery("Select * from User_");
			while(rs.next())
			{
				System.out.println("try");
				System.out.println(rs.getString(7)+" "+ rs.getString(8));
				String User = rs.getString(7);
				String Pass = rs.getString(8);
				if(User.equals(Username) && Pass.equals(Password))
				{
					System.out.println("here");
					rs1 = stmt.executeQuery("select * from User_ natural join Customer;");
					rs1.next();
					Customer c = new Customer();
					c.setCustomerID(rs1.getString(9));
					c.setName(rs1.getString(3));
					c.setAddress(rs1.getString(4));
					c.setCNIC(rs1.getString(7));
					c.setEmail(rs1.getString(6));
					c.setPhone(rs1.getString(5));
					Account B = new Account();
					B.setPassword(Password);
					B.setUsername(Username);
					//for bank acc
					
					c.setAcc(B);
					rs1 = stmt.executeQuery("select * from bankAccount natural join Customer");
					rs1.next();
					String BankAccno = rs1.getString(1);
					String branch = rs1.getString(3);
					String bankn = rs1.getString(4);
					BankAccount bAcc = new BankAccount(branch, bankn);
					c.setAccount(bAcc);
					
					return c;
				}
			}
			conn.close();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		System.out.println("here null");
		return null;
	}
	
	
	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void CreateAccount(String name, String address, String email, String phone,
			String cnic, String user, String pass ) 
	{
		
		Account acc =  new Account(user, pass);
		
		BankAccount Bacc = new BankAccount("Rawalpindi", "Faysal");
		Customer Customer = new Customer(name, address,phone, email ,cnic,user, pass,Bacc);
		
	}
	

	public ArrayList<Customer> getAccounts() {
		return Customers;
	}
	public void setAccounts(ArrayList<Customer> accounts) {
		this.Customers = accounts;
	}
	
}
