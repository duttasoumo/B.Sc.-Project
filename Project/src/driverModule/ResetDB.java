package driverModule;

import java.sql.SQLException;

import reset.DBreset;

class ResetDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DBreset.reset();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.print("DB Reset Error");
			System.exit(2);
		}
		System.out.println("DataBase Reset !!");
	}

}
