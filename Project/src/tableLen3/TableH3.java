package tableLen3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;

import hash.Hashing;
import itemSet.ItemSet_2;
import itemSet.ItemSet_3;
import tableLen2.ViewL2;

public class TableH3  {

@SuppressWarnings("unchecked")
public int insert(String trans) throws SQLException{
		
		ItemSet_2 iset=new ItemSet_3(trans);
			String ar[]=iset.combi();// set of all combination
			LinkedList<String> h[];
			h=new LinkedList[Hashing.table_size];
			for(int i=0;i<h.length;i++){
				h[i]=new LinkedList<String>();
			}
			Hashing hash=new Hashing();
			for(int i=0;i<ar.length;i++){
				String s[]=ar[i].split(",");
				int z=Integer.parseInt(s[0]);
				int y=Integer.parseInt(s[1]);
				int x=Integer.parseInt(s[2]);
				if(!ViewL2.isL2(z+","+y) || !ViewL2.isL2(z+","+x) || !ViewL2.isL2(y+","+x))
						continue;
				hash.setZ(z);
				hash.setY(y);
				hash.setX(x);
				int index=hash.getHash1();
				h[index].add(ar[i]);
			}
		return runSQL(h);
		}	

public int runSQL(LinkedList<String>[] h) throws SQLException {
	// TODO Auto-generated method stub
	Connection con=connection_MySQL.ConnectionClass.dbcon();
	int x=-1;
	int size=Hashing.table_size;
	String sql="insert into h3 values(";
	for(int i=1;i<=size;i++)sql+="?,";
	sql=sql.substring(0,sql.lastIndexOf(','))+")";
	int flag=0;
	do{
		flag=0;
		PreparedStatement ps=con.prepareStatement(sql);
		for(int i=0;i<size;i++){
			if(h[i].isEmpty())
				ps.setNull(i+1,java.sql.Types.VARCHAR);
			else{
				String item=(h[i].remove()).toString();
				ps.setString(i+1, item);
				flag=1;
			}
		}
	if(flag==1)   x=ps.executeUpdate();	
	}while(flag==1);
	con.close();
	return x;
}

}
