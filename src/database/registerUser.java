package database;
import java.sql.*;
import java.util.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.io.*;

import entity.User;

public class registerUser {
	
	private static final int USER_TABLE = 0;
	
	private static Connection connection;
	private static Comparable[][][] data;
	private static PreparedStatement statement;
	
	public registerUser()
	{
		
	}
	
	private static void createConnection()
	{
		Properties databaseProperties = new Properties();
		try {
			File config = new File("config.properties");
			FileInputStream fileInput = new FileInputStream(config);
			databaseProperties.load(fileInput);
			fileInput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String databaseUrl = databaseProperties.getProperty("jdbc.url");
		String databaseDriver = databaseProperties.getProperty("jdbc.driver");
		String databaseUsername = databaseProperties.getProperty("jdbc.username");
		String databasePassword = databaseProperties.getProperty("jdbc.password");
		
		try {
			Class.forName(databaseDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(databaseUrl, databaseUsername, databasePassword);
			System.out.println("Connected!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addUser(User user)
	{
		String query = ("INSERT INTO user (email, firstName, lastName, accountType, password)"
				+ "VALUES (?, ?, ?, ?, ?);");
		try
		{
			PreparedStatement p = connection.prepareStatement(query);
			
			p.setString(1, user.getEmail());
			p.setString(2,  user.getFirstName());
			p.setString(3, user.getLastName());
			p.setString(4, user.getAccountType());
			p.setString(5, user.getPassword());
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
