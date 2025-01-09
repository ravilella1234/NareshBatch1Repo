package db.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo 
{

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "db";
		String dburl = url+dbName;
		String username = "root";
		String password = "root";
		Connection connection = null;
		
		try 
		{
			//Create an object for Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connect to DB Database
			 connection = DriverManager.getConnection(dburl, username, password);
			
			//Executing the DB queries on the connected DB database
			if(!connection.isClosed()) 
			{
				System.out.println("Successfully connected to db Database");
				
				/*
				//Execute the query to retrieve the Employee table records
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from Employee");
				//ResultSet resultSet = statement.executeQuery("Select * from Employee where Name=Ravikanth and Experience=10");
				
				while(resultSet.next()) 
				{
					System.out.println(resultSet.getString("Name")+"--"+resultSet.getString("Location")+"--"+resultSet.getInt("Experience"));				
				}*/

				
				//Execute prepared statements to retrieve the filtered records from the employee table
				PreparedStatement preparestatement = connection.prepareStatement("Select * from Employee where Name=? and Experience=?");
				preparestatement.setString(1, "Ravikanth");
				preparestatement.setInt(2, 10);
				ResultSet resultSet2 = preparestatement.executeQuery();
				while(resultSet2.next())
				{
					System.out.println(resultSet2.getString("Name")+"--"+resultSet2.getString("Location")+"--"+resultSet2.getInt("Experience"));
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			//Close the database connection
			try 
			{
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try 
			{
				if(connection.isClosed())
				{
					System.out.println("Connection to DB database is successfuly closed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
