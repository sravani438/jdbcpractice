package com.preparedstatement.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
		PreparedStatement p=con.prepareStatement("delete from school where id=?");
		Scanner s=new Scanner(System.in);
		System.out.println("enter id");
	int id=s.nextInt();
	p.setInt(1, id);
	System.out.println("values are deleted");
		

	}

}
