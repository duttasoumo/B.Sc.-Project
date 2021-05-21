package tableLen2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import hash.Hashing;

public class ViewL2 {


	public int insert(int minSup_count) throws SQLException{
		
		final int table_size=Hashing.table_size;
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		int x=-1;
		String sql="TRUNCATE l2";
		con.prepareStatement(sql).execute();
		PreparedStatement ps=null;
		
		for(int i=0;i<table_size;i++){
			String feild=(String)(Character.toString((char) ('a'+i)));
			sql="insert into l2 SELECT distinct("+feild+"),count("+feild+") FROM h2 where "+feild+" is not null group by "+feild+" having count(*) >= ?;";
			ps=con.prepareStatement(sql);
			ps.setInt(1, minSup_count);
			x=ps.executeUpdate();
		}
		con.close();
		return x;
	}
	
	public static boolean isL2(String x) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		String sql="select item from l2 where item=?";
		ResultSet rs=null;
		PreparedStatement state=con.prepareStatement(sql);
		state.setString(1,x);
		rs=state.executeQuery();
		boolean val=rs.next();
		con.close();
		return val;
	}
	
	public static ArrayList<String> isL2(int x) throws SQLException {
		
	Connection con=connection_MySQL.ConnectionClass.dbcon();
	String sql="select item from l2 order by count";
	PreparedStatement smt=con.prepareStatement(sql);
	ResultSet rs=smt.executeQuery();
	ArrayList<String> ar=new ArrayList<String>();

	while(rs.next())
	{
		String itemSet=rs.getString(1);
	String tmp[]=itemSet.split(",");
	if( Integer.parseInt(tmp[0])==x || Integer.parseInt(tmp[1])==x)
	{ar.add(itemSet);}
	}
	return ar;
	}
	
	public static int avg() throws SQLException{
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		String sql="select avg(count) from l2";
		ResultSet rs=null;
		PreparedStatement state;
		try {
			state = con.prepareStatement(sql);
			rs=state.executeQuery();
			rs.next();
			System.out.println("AVG L2 : "+rs.getFloat("avg(count)"));
			return Math.round(rs.getFloat("avg(count)"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return 0;
		}
	}
}
