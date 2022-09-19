package app15.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.*;
public class Callablestatement_eg {

	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cstmt=null;
		ResultSet rs=null;
		String iqry="insert into employee.emp values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded and registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306 ?user=root & password=kavya");
			System.out.println("Connection established");
			
			System.out.println("Platform created");
			cstmt=con.prepareCall(iqry);
			cstmt.setInt(1, 4);
			cstmt.setString(2, "rama");
			cstmt.setDouble(3, 98765);
		    cstmt.execute();
		    System.out.println("sucess");
	  }
	catch (ClassNotFoundException | SQLException e) 
	{
		e.printStackTrace();
	}
	finally {
	if(cstmt!=null) {
		try {
			cstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	if(con!=null) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
 }
}
}