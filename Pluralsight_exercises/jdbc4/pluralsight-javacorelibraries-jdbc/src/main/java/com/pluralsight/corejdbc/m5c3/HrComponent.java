	package com.pluralsight.corejdbc.m5c3;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class HrComponent {
	
	public int addEmployee(String lastName, String firstName, 
							String extension, String email, 
							String officeCode, 
							String jobTitle) throws Exception {
		
		try(Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/classicmodels?user=root&password=oracle&serverTimezone=UTC");
		
			PreparedStatement preparedStatement = 
				connection.prepareStatement(
				"INSERT INTO employees "
			  + "(lastName, firstName, extension, email, officeCode, jobTitle) " 
			  + "VALUES (?, ?, ?, ?, ?, ?)",
			  
				Statement.RETURN_GENERATED_KEYS);){
				
		preparedStatement.setString(1, lastName);
		preparedStatement.setString(2, firstName);
		preparedStatement.setString(3, extension);
		preparedStatement.setString(4, email);
		preparedStatement.setString(5, officeCode);
		preparedStatement.setString(6, jobTitle);
		
		preparedStatement.executeUpdate();
		
		try(ResultSet resultSet = preparedStatement.getGeneratedKeys();){
			
			int autogenkey = 0;
		
			if(resultSet.next()) {
				autogenkey = resultSet.getInt(1);
			}
			
			
			return autogenkey;
			
		}}	
	}
	
	public int replaceSalesManager(String managerBeingReplaced, String replacementManager) throws Exception{
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/classicmodels?user=root&password=oracle&serverTimezone=UTC");
		
		PreparedStatement preparedStatement = 
				  connection.prepareStatement("UPDATE employees SET reportsTo = ? WHERE reportsTo = ?");
				
		preparedStatement.setString(1, replacementManager);
		preparedStatement.setString(2, managerBeingReplaced);
		int count = preparedStatement.executeUpdate();

		preparedStatement.close();
		connection.close();
		return count;
		
	}

}
