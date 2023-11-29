package com.homework.pack;

import java.sql.SQLException;
import java.util.Scanner;
public class driver {
public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name ");
	String s=sc.next()	;
	System.out.println("enter the email of the user");
	String s1=sc.next();
	System.out.println("enter the password");
	int password=sc.nextInt();
	user.uservalues(id, s, s1, password);
	}

}
