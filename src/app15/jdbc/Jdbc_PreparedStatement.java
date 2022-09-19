// jdbc w.r.t Prepared Statement and placeholder;

package app15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class Jdbc_PreparedStatement {

	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sqry="select * from employee.emp where id=? ";
		Scanner sc =new Scanner(System.in);
		System.out.println("enter id");
		int uid=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded and registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306 ?user=root & password=kavya");
			System.out.println("Connection established");
			
			System.out.println("Platform created");
			pstmt=con.prepareStatement(sqry);
			pstmt.setInt(1, uid);
		    rs=pstmt.executeQuery();
			if(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				Double sal=rs.getDouble(3);
				System.out.println("The student id is " + id + " name = " + name +" salary= "+ sal );
		} 
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally {
		if(pstmt!=null) {
			try {
				pstmt.close();
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
