package connection_Oracel;


import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionClass {

	public static Connection dbcon() {
		// TODO Auto-generated method stub
		Connection con=null;
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="system";
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			con=DriverManager.getConnection(url,username,password);  
			
		}
		catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			   System.exit(1);
			}
		catch(Exception e){
			System.err.println("Error in DB connection\n"+e.getMessage());
		}
		return con;
	}

}

