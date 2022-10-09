package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htcn","root","root");
		PreparedStatement ps=con.prepareStatement("insert into LaptopShop values(?,?,?,?,?,?)");
		ps.setInt(1, 12);
		ps.setString(2, "DELL");
		ps.setInt(3,15);
		ps.setString(4, "DS");
		ps.setInt(5,8304);
		ps.setFloat(6,25000);
		ps.executeUpdate();
		con.close();
		System.out.println("inserted succesfully");


	}

}
