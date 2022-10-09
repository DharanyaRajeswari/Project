package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htcn","root","root");
		//create the statement
		PreparedStatement ps=con.prepareStatement("update LaptopShop set pname=? where id=?");
		ps.setString(1, "Lenovo");
		ps.setInt(2, 12);

		ps.executeUpdate();
		//execute the query
		//close the connection
		con.close();
		System.out.println("Updated succesfully");

}


	}


