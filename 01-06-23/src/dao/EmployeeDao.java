package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.DbConnection;
import Day2Model.Day2Model;

public class EmployeeDao {
	
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insertEmployee(Day2Model emp) {
		con = DbConnection.getMyConnection();
		try {
			ps = con.prepareStatement("INSERT INTO DEDAEMP VALUES(?,?)");
			ps.setInt(1, emp.getEno());
			ps.setString(2, emp.getEname());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " got inserted into DB successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void showEmployee() {
		con = DbConnection.getMyConnection();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM dedaemp");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public void updateEmployeeName(int empno, String ename) {
		con = DbConnection.getMyConnection();
		try {
			ps = con.prepareStatement("UPDATE dedaemp SET ename=? WHERE empno=?");
			ps.setString(1, ename);
			ps.setInt(2, empno);
			int noOfRows = ps.executeUpdate();
			System.out.println(noOfRows + " row(s) updated successfully!");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int empno) {
		con = DbConnection.getMyConnection();
		try {
			ps = con.prepareStatement("DELETE FROM dedaemp WHERE empno=?");
			ps.setInt(1, empno);
			int noOfRows = ps.executeUpdate();
			System.out.println(noOfRows + " row(s) deleted successfully!");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
