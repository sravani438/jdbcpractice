package com.advance.pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class executequery {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/policestation", "root", "root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select*from police");
		while(rs.next()) {
		System.out.println(rs.getInt(1));//instead of providing column names we can provide column names also
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		System.out.println(rs.getInt(4));
	}}

}
