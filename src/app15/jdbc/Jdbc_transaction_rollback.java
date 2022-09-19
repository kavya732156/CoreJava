package app15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;

public class Jdbc_transaction_rollback {

	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt1 =null;
		PreparedStatement pstmt2=null;
		Savepoint ps=null;
		String iqry1="insert into employee.stu values(?,?,? )";
		String iqry2="insert into employee.emp_per values(?,?,?,? )";
		Scanner sc =new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter sal");
		double perc=sc.nextDouble();
		System.out.println("enter place");
		String place=sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306 ?user=root & password=kavya");
			con.setAutoCommit(false);
			pstmt1=con.prepareStatement(iqry1);
			
			pstmt1.setInt(1, id);
			pstmt1.setString(2, name);
			pstmt1.setDouble(3, perc);
			pstmt1.executeUpdate();
			ps=con.setSavepoint();
			System.out.println("data inserted into student table");
			
			pstmt2=con.prepareStatement(iqry2);
			pstmt2.setInt(1, id);
			pstmt2.setString(2, name);
			pstmt2.setDouble(3, perc);
			pstmt2.setString(4, place);
			ps=con.setSavepoint();
			pstmt2.executeUpdate();
			System.out.println("data inserted into emp_edu  table");
			
			con.commit();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt2!=null) {
				try {
					pstmt2.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(pstmt1!=null) {
				try {
					pstmt1.close();
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
