package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htcn","root", "root");
         Statement st=con.createStatement();
         String query="create table LaptopShop(id int primary key not null,pname varchar(78),noofitems int,modelno int,modelname varchar(78),retailprice int";
         st.execute(query);
         con.close();
         System.out.println("created sucessfully");
	}


	}


