package com.test.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {
	public static void main(String[] argv) {

		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;

		}

		System.out.println("Oracle JDBC Driver Registered!");

		Connection connection = null;
		Statement stmt = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521/orcl", "oe", "kiran");
			stmt = connection.createStatement();
			String sql;
			sql = " select c.CUST_ADDRESS.country_id ,c.cust_address.postal_code,c.cust_address.city,c.cust_address.state_province from CUSTOMERS c where c.customer_id='102'";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("c count  "+rs.getMetaData().getColumnCount());
			System.out.println(rs.getMetaData().getColumnName(1));
			System.out.println(rs.getMetaData().getColumnName(2));
			 while(rs.next()){
				 System.out.println(rs.getString("CUST_ADDRESS.COUNTRY_ID"));
				 System.out.println(rs.getString("CUST_ADDRESS.POSTAL_CODE"));
				 System.out.println(rs.getString("CUST_ADDRESS.CITY"));
				 
			 }
			 
			 rs.close();
			 stmt.close();
			 
		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}

}
