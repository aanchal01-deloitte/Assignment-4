package com.aanchal.jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDao {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Aanchal@0114");
			System.out.println(connection);
			Statement statement = connection.createStatement();
//			int result = statement.executeUpdate("insert into account values(1,'aanchal','gupta',100)");
//			System.out.println(result);
			int result=statement.executeUpdate("delete from account where accno=1");
//			int result = statement.executeUpdate("update account set bal=50000 where accno=1");
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
