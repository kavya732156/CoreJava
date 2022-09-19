package app15.jdbc;
// jdbc w..r.t Statement Interface
import java.sql.*;

public class Jdbc_steps {

	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		String iqry="insert into employee.emp values(101,'pooja',9000)";
		String dqry="delete from employee.emp where id=1";
		int status=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class is loaded and registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306 ?user=root & password=kavya");
			System.out.println("Connection established");
			stmt=con.createStatement();
			System.out.println("Platform created");
			status=stmt.executeUpdate(iqry);
			status=stmt.executeUpdate(dqry);
			System.out.println(status);
		} catch (ClassNotFoundException | SQLException e) 
		{
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
