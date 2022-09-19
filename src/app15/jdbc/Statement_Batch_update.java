package app15.jdbc;

import java.sql.*;

public class Statement_Batch_update {

	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		String iqry="insert into employee.emp values(122,'xyz',9876 )";
		String uqry="update employee.emp set sal=765433 where id='3'";
		String dqry="delete from employee.emp where id=121 ";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306 ?user=root & password=kavya");
			stmt=con.createStatement();
			stmt.addBatch(iqry);
			stmt.addBatch(uqry);
			stmt.addBatch(dqry);
			System.out.println("queried added to batch");
			int arr[]=stmt.executeBatch();
			System.out.println("Queries are ecute in batch");
			for(int i: arr) {
				System.out.println(i);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null) {
				try {
					stmt.close();
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
