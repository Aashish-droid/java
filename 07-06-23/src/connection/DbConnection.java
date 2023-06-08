package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Day2Model.Day2Model;

public class DbConnection {
	static Connection con;
	private static DbConnection instance=null;
	
	public static Connection getMyConnection() {

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Uiop@123");
			System.out.println(con);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}
	public static DbConnection getInstance() {
		if(instance == null) {
			instance= new DbConnection();
		}return  instance;
	}

	public static void main(String[] args) {
		System.out.println(getMyConnection());

	}

}
