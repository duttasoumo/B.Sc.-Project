package reset;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBreset {
	
	public static void reset() throws SQLException{
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		Statement state=con.createStatement();
		state.addBatch("truncate schema.h2;");
		state.addBatch("truncate schema.h3;");
		state.addBatch("truncate schema.l2;");
		state.addBatch("truncate schema.l3;");
		state.addBatch("truncate schema.resset;");
		state.addBatch("truncate schema.transaction;");
		state.addBatch("alter table schema.transaction AUTO_INCREMENT=1000;");
		state.addBatch("DROP VIEW IF exists schema.l1;");
		state.addBatch("update schema.c1 set sup_count=0;");
		state.executeBatch();
		state.close();
		con.close();
		
	}
}
