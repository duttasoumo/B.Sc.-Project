package tableLen1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TableC1 {
	
	public int insert(String trans) {
		// TODO Auto-generated method stub
		Connection con=connection_MySQL.ConnectionClass.dbcon();//creating Connection
		int x=-1;
		String ar[]=trans.split(",");
		try {
			PreparedStatement ps=con.prepareStatement("Update c1 set sup_count=sup_count+1 where item=?");
		
			for(int i=0;i<ar.length;i++){
				ps.setInt(1,Integer.parseInt(ar[i]));
				x=ps.executeUpdate();
			}
			con.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

}
