package com.homework.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class customerdriver {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountnumber");
		int accountnumber=sc.nextInt();
		System.out.println("enter pincode");
		int pincode=sc.nextInt();
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		PreparedStatement p=c.prepareStatement("select*from customer where accountnumber=? and pincode=?");
	p.setInt(1, accountnumber);
	p.setInt(2, pincode);
	ResultSet rs=p.executeQuery()
;
	if(rs.next())
		{
		System.out.println(rs.getInt(7));
		}
	else {
		System.out.println("invalid credentials");
	}
		}

}
