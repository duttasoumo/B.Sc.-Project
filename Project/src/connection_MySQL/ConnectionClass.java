package connection_MySQL;

	import java.sql.Connection;
	import java.sql.DriverManager;

	public class ConnectionClass {
		
	 public static Connection dbcon(){
		 
		 String DB_URL ="jdbc:mysql://localhost/Schema?autoReconnect=true&useSSL=false";
		 String user="user";
		 String password="user";
		 Connection con=null;
		 
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(DB_URL,user,password);
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
