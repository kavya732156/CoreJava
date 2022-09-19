package app15.jdbc;

import java.sql.*;

public class PreapreStatement_BatchUpdate {

	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt =null;
		String iqry="insert into employee.emp values(121,'abc',908765 )";
		String uqry="update employee.emp set sal=765433 where id='1'";
		String dqry="delete from employee.emp where id=100 ";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306 ?user=root & password=kavya");
			pstmt=con.prepareStatement(iqry);
			pstmt.addBatch();
			System.out.println("queried added to batch");
			int arr[]=pstmt.executeBatch();
			System.out.println("Queries are executed in batch");
			for(int i: arr) {
				System.out.println(i);
			}
			pstmt=con.prepareStatement(uqry);
			pstmt.addBatch();
			System.out.println("queried added to batch");
			int arr1[]=pstmt.executeBatch();
			System.out.println("Queries are executed in batch");
			for(int i: arr1) {
				System.out.println(i);
			}
			pstmt=con.prepareStatement(dqry);
			pstmt.addBatch();
			System.out.println("queried added to batch");
			int arr2[]=pstmt.executeBatch();
			System.out.println("Queries are executed in batch");
			for(int i: arr2) {
				System.out.println(i);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
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