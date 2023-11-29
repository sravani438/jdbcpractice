package com.preparedstatement.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update {

	public static void main(String[] args) throws SQLException {
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
PreparedStatement ps=con.prepareStatement("update school name=? where id=?");
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
String name=sc.next();
System.out.println("enter id");
int id=sc.nextInt()
;
ps.setString(1,name);
ps.setInt(2, 2);
System.out.println("values are updated");

	}

}
