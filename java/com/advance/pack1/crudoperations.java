package com.advance.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class crudoperations {

	public static void main(String[] args) throws SQLException   {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select*from school");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		}

}
