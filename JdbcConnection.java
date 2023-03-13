package test;

import java.sql.*;
public class JdbcConnection {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("create table Student(sid int(10),sname varchar(40),scol varchar(40) ");
		System.out.println("Connection established succusfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}