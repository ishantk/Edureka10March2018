package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.User;

import java.sql.CallableStatement;

public class JDBCHelper {

	Connection con;
	Statement stmt;
	
	PreparedStatement pStmt;
	CallableStatement cStmt;
	
	
	public JDBCHelper() {
		
		try {
			// 1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	public void openConnection(){
		try {
			// 2. Create the Connection
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/EdurekaMarch10";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Opened--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public int registerUser(User u){
		int i = 0;
		
		try {
			
			//3. Create a SQL Statement
			//String sql = "insert into Student values(null,'"+s.name+"',"+s.age+",'"+s.email+"','"+s.address+"')";
			
			String sql = "insert into User values(null,?,?,?)";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, u.name);
			pStmt.setString(2, u.email);
			pStmt.setString(3, u.password);
			
			i = pStmt.executeUpdate();
			
			System.out.println("SQL Statement Executed!! Row(s) inserted "+i);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println("--Connection Closed--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}

