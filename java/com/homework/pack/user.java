package com.homework.pack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class user {
	public static void uservalues(int id,String name,String email,int password) throws SQLException {
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/policestation", "root", "root");
	PreparedStatement p1=c.prepareStatement("create table user (id int,name varchar(20),email varchar(20),password int) ");
	p1.execute();
	PreparedStatement p2=c.prepareStatement("insert into user(id,name,email,password) values(?,?,?,?)");
	p2.setInt(1, id);
	p2.setString(2, name);
	p2.setString(3,email);
	p2.setInt(4, password);
	p2.execute();
	System.out.println("values are inserted");
	}

}
