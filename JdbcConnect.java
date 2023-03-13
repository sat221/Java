package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnect {

			public static void main(String[] args) {
				
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
				Statement stm=con.createStatement();
				stm.executeUpdate("insert into emp values(10,'Satish',300)");
				ResultSet rs=stm.executeQuery("select * from emp");
				//int rs=stm.executeUpdate("delete  from emp");
				System.out.println(rs+" records affected");
				while(rs.next())  
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
				
//				System.out.println("qedv");
				con.close();
				}
				catch(Exception e) {
					System.out.println("the exception is:"+e);
				}
			}

		}
