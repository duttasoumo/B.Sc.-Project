package driverModule;

import java.io.IOException;
import java.sql.SQLException;

public class Populate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		String s;
		try {			
		s="5,6,10,50,48,10";
		MainClass.main(s.split(" "));
		s="15,26,48,5,10,20";
		MainClass.main(s.split(" "));
		s="34,26,5,25,28,31,1";
		MainClass.main(s.split(" "));
		s="5,1,26,48,4,3,42";
		MainClass.main(s.split(" "));
		s="6,29";
		MainClass.main(s.split(" "));
		s="19,46,37,17";
		MainClass.main(s.split(" "));
		s="28,17,39,50";
		MainClass.main(s.split(" "));
		s="16,28,17,38,5,24";
		MainClass.main(s.split(" "));
		s="5,22,33,44,11";
		MainClass.main(s.split(" "));
		s="28,15,6,28,8,41";
		MainClass.main(s.split(" "));
	
		s="15,16,10,50,48,10,11,14,19,20";
		MainClass.main(s.split(" "));
		s="15,36,48,5,10,20,1,2,3,4";
		MainClass.main(s.split(" "));
		s="34,26,15,25,28,31,1,19,10,15";
		MainClass.main(s.split(" "));
		s="15,1,26,48,4,3,42,43,43,43";
		MainClass.main(s.split(" "));
		s="6,29,39,40,8,8,8";
		MainClass.main(s.split(" "));
		s="19,46,37,17,20,12,19,20";
		MainClass.main(s.split(" "));
		s="28,17,39,50,49,50,25,27";
		MainClass.main(s.split(" "));
		s="16,28,17,38,5,24,23,12,12,18,10";
		MainClass.main(s.split(" "));
		s="5,22,33,44,11,9,15,7,8,9";
		MainClass.main(s.split(" "));
		s="28,15,6,28,8,41,10,10,23,45,6";
		MainClass.main(s.split(" "));
		
		s="25,26,10,50,48,10,11,14,19,20,49,50";
		MainClass.main(s.split(" "));
		s="15,36,48,5,10,20,1,2,3,4,11,12,25,26";
		MainClass.main(s.split(" "));
		s="4,15,44,43,21,7";
		MainClass.main(s.split(" "));
		s="15,1,12,17,19,21,43";
		MainClass.main(s.split(" "));
		s="8,8,8,8,8,8,16,16,16";
		MainClass.main(s.split(" "));
		s="8";
		MainClass.main(s.split(" "));
		s="28,29,30,31,32,27,39";
		MainClass.main(s.split(" "));
		s="35,45,7,6,5,10";
		MainClass.main(s.split(" "));
		s="7,17,23,35,49";
		MainClass.main(s.split(" "));
		s="18,28";
		MainClass.main(s.split(" "));
		
		s="43,24,6,18,19,22";
		MainClass.main(s.split(" "));
		s="9,7,6,26,13,10";
		MainClass.main(s.split(" "));
		s="50,31,39,37,28";
		MainClass.main(s.split(" "));
		s="1,17,15,27,17,12,11";
		MainClass.main(s.split(" "));
		s="5,20,8,2,18";
		MainClass.main(s.split(" "));
		s="18,45,46,47,49,50";
		MainClass.main(s.split(" "));
		s="28,29,30,31,32,27,39,8,45";
		MainClass.main(s.split(" "));
		s="35,45,7,6,5,10,7";
		MainClass.main(s.split(" "));
		s="5,22,21,23,6,44,34,43,25";
		MainClass.main(s.split(" "));
		s="8,27,37,47";
		MainClass.main(s.split(" "));
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			long endTime   = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println("Total Time Required : "+totalTime);
			System.exit(0);
		}
	}

}
