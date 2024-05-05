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

	Customer(String name, String address, String phone, String email,

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



	

	//void giveFeedback() {

	//}

	//void redirectMail(){		

	//}

}