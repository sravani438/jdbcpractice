package com.advance.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class execute {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/policestation", "root", "root");
		Statement s=con.createStatement();
		s.execute("insert into police values(2,'yamini',20,2)");
	System.out.println("values are inserted");
	}

}
