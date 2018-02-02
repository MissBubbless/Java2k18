package com.nym.CarDealer;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarHistoryDAO {

	/*CarHistoryDAO(){*/
	public static void main(String args[]) {
		JdbcConnection j=new JdbcConnection();
		j.createdatabase();
		String query = "SELECT * FROM CARHISTORY";
		ResultSet rs;
		try {
			rs = j.stmt.executeQuery(query);
		
			while(!rs.next())
			{
				System.out.println("No records found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
