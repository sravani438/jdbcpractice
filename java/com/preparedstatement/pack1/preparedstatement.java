package com.preparedstatement.pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class preparedstatement {
public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name of the student");
		String name=sc.next();
		System.out.println("enter age of the person");
		int age =sc.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
PreparedStatement ps=con.prepareStatement("insert into school(id,name,age) values(?,?,? )");
ps.setInt(1, id);
ps.setString(2, name);
ps.setInt(3, age);
ps.execute();
System.out.println("values are inserted");}

}
