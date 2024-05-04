package finTechAdvisor;

import java.util.List;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CustomerService extends User{
	String CustomerServiceID;
	static int PID;
	public CustomerService()
	{
		super();
	}
	public CustomerService(String ID,String name, String address, String phone, String email, String cnic,String user, String pass) throws SQLException {
		super(name, address, phone, email, cnic,user, pass );
		// TODO Auto-generated constructor stub
		CustomerServiceID = ID;
		String P = "CS";
		P = P + String.valueOf(PID);
		PID++;
		CustomerServiceID = P;
		/*
		MySqlHandler sql = new MySqlHandler();
		Statement stmt = sql.getStmt();
		//execute query
		java.util.Date dt = new java.util.Date();

		java.text.SimpleDateFormat sdf = 
		     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String currentTime = sdf.format(dt);
		Log l = new Log('C',currentTime, "Customer service made");
		String query = "Insert into customerService\r\n"
				+ "	VALUES (" + P +",'" + user + "' );";
		try {
			int row = stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	public CustomerService(User user )
	{
		super(user);
		
	}
	

	
	void connect()
	{
		System.out.println("connection established");
		
	}
	
	String messageFromCustomer(String Message)
	{
		String reply = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("message received: " + Message);
		System.out.println("1)send reply \n 2)get log)");
		int choice = scan.nextInt();
		switch (choice)
		{
		case 1:
			reply = scan.next();
			break;
		case 2:
			//ArrayList<Log> logs = admin.requestLog();
			
			reply = scan.next();
			break;
		default:
			System.out.println("wrong choice");
		}
			
		return reply;
	}

	

}
