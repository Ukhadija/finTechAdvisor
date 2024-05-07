package finTechAdvisor;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.Date;

import java.util.Scanner;



public class Customer extends User{

	//class variables

	static int Pid = 0; //static variable to calculate customer ID

	private String customerID;

	private BankAccount account;

	//private ArrayList<BankAccount> accounts;



	//constructor

	public Customer ()

	{

		

	}

	public Customer(String name, String address, String phone, String email,

			String cnic, String Username, String pass, BankAccount Bacc)

	{

		super(name, address, phone, email,cnic, Username, pass); //user added to database

	

		String P = "C";

		P = P + String.valueOf(Pid);

		Pid++;

		this.setAccount(Bacc);// bank acc

		this.setCustomerID(P);

		

		//add to database

		/*

		MySqlHandler sql = new MySqlHandler();

		Statement stmt = sql.getStmt();

		

		//execute query

		java.util.Date dt = new java.util.Date();



		java.text.SimpleDateFormat sdf = 

		     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



		String currentTime = sdf.format(dt);

		

		String query = "Insert into Customer (Username, BankAccID, InventoryID) "

				+ "	VALUES ('" + Username +"','" + Bacc.getAccountNo() + " );";

		

		System.out.println("Insert into Customer "

				+ "	VALUES ('" + P +"','" + Username +"','" + Bacc.getAccountNo() +  " );");

		stmt.executeUpdate(query); //execute the insertion

		*/

		

		

	}

	

	//getter setters

	String getCustomerID() {

		return this.customerID;

	}

	

	//other methods

	void CustomerService(CustomerService custService)

	{

		custService.connect();

		String CustomerMessage , EmployeeMessage = "How can we help you?";

		String reply;

		do {

			CustomerMessage = MessageFromRep(EmployeeMessage);

			EmployeeMessage = custService.messageFromCustomer(CustomerMessage);

			

			System.out.println("Exit? E");

			Scanner scan = new Scanner(System.in);

			reply = scan.next();

			scan.close();

		}while(reply != "E");

	}

	

	String MessageFromRep(String msg)

	{

		Scanner scan = new Scanner(System.in);

		System.out.println("message received: " + msg);

		System.out.println("send reply");

		String reply = scan.next();

		

		scan.close();

		return reply;

	}

	

	

		

	public boolean makePayment(char method, String AccNo) {

		

		boolean pay = false;

		double amount = 1;

			System.out.println("Using Mastercard");

			boolean ack = getAccount().makePayment(amount);

			

			if(ack) {

				System.out.println("Payment Successful\n");

				pay = true;

			}

			else {

				System.out.println("Payment not Successful\n");

			}

		

		

	//	getAccount().viewTransactionHistory(); 

		return pay;

	}



	public BankAccount getAccount() {

		return account;

	}



	public void setAccount(BankAccount account) {

		this.account = account;

	}



	

	public void setCustomerID(String customerID) {

		this.customerID = customerID;

	}
	
	public String advise(float income, float expenses) {
		System.out.println("Comes");
	    if (income > expenses) {
	        float savings = income - expenses;
	        if (savings > 0) {
	            if (savings <= 100) {
	                return "You can save some money by reducing unnecessary expenses.";
	            } else if (savings <= 500) {
	                return "Consider saving more by cutting down on dining out and entertainment expenses.";
	            } else {
	                return "You're doing well in saving! Keep it up and consider investing your savings for better returns.";
	            }
	        } else {
	            return "You're spending as much as or more than you're earning. Consider budgeting and cutting down on non-essential expenses.";
	        }
	    } else {
	        return "You're spending more than you're earning. Consider finding ways to increase your income or reducing your expenses.";
	    }
	}



	

	//void giveFeedback() {

	//}

	//void redirectMail(){		

	//}

}