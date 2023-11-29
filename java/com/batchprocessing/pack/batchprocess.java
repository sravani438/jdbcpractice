package com.batchprocessing.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class batchprocess {

	public static void main(String[] args) throws SQLException {
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
	Statement s=c.createStatement();
	s.addBatch("insert into school(id,name,age) values(3,'asia',23)");
	s.addBatch("insert into school(id,name,age)values(4,'usa',24)");
	s.addBatch("insert into school(id,name,age)values(5,'pakistan',25)");
	s.executeBatch();
	System.out.println("batch is executed");
	}

}
