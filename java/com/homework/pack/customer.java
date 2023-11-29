package com.homework.pack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.preparedstatement.pack1.preparedstatement;
public class customer {
public static void main(String[] args) throws SQLException {
Scanner sc=new Scanner(System.in);
System.out.println("enter the id");
	int id=sc.nextInt();
	System.out.println("enter the name ");
	String name=sc.next()	;
	System.out.println("enter the age of the user");
	int age=sc.nextInt();
	System.out.println("enter the accountnumber");
	int accountnumber=sc.nextInt();
	System.out.println("enter pincode");
	int pincode=sc.nextInt();
	System.out.println("enter ifsccode");
	String ifsccode=sc.next();
	System.out.println("enter balance");
	int balance=sc.nextInt();
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
	PreparedStatement p=c.prepareStatement("insert into customer(id,name,age,accountnumber,pincode,ifsccode,balance)values(?,?,?,?,?,?,?) ");
p.setInt(1, id);
p.setString(2, name);
p.setInt(3, age);
p.setInt(4,accountnumber);p.setInt(5, pincode);
p.setInt(7, balance);
p.setString(6, ifsccode);
p.execute();
System.out.println("values are inserted");

}

}
