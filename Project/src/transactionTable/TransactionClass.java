package transactionTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TransactionClass {
	
	public int transaction(String I)
	 {  
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		int x=-1;
		 try{
		 PreparedStatement smt=con.prepareStatement("Insert into transaction (Item_List) values (?)");
			smt.setString(1,I);
			smt.executeUpdate();
			ResultSet rs=con.prepareStatement("select max(ID) from transaction").executeQuery();
			rs.next();
			x=rs.getInt(1);
			con.close();
		 }
		 catch(Exception e)
		 {	System.out.println(e.getMessage());}
		 if(x==-1) System.exit(1);
		 return x;
	 }

}
