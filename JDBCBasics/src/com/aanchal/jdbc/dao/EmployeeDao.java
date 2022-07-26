package com.aanchal.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
	public static void main(String[] args) { 
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Aanchal@0114");
			System.out.println(connection);
			Statement statement = connection.createStatement();
//			sta/tement.execute("create table employee(empNo int,lastname varchar(25),firstname varchar(25),bal int)");
			int result = statement.executeUpdate("insert into employee values(1,'soumya','gupta',100)");
			
			ResultSet rs = statement.executeQuery("select * from employee");
			while (rs.next()) {
			  System.out.println(rs.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
