package Abreu.MAIN;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Abreu.DBSUPPORT.DBSupport;


public class Abreu_JDBC_EX1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Connection conn = DBSupport.establishConnection();
		Statement useStatement = conn.createStatement();
		useStatement.execute("USE imperial_defense");
		
		Statement queryStatement = conn.createStatement();
		ResultSet rs = queryStatement.executeQuery("SELECT * FROM firewall");
		
		while(rs.next()) {
			String A = rs.getString("IDNumber");
			String B = rs.getString("SystemName");
			String C = rs.getString("Filter");
			System.out.println(A + " " + B + " " + C );
		}
			
			
	}
}