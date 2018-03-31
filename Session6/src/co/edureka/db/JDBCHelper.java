package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.CallableStatement;

import co.edureka.model.Student;

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
	
	public void insertStudent(Student s){
		try {
			
			//3. Create a SQL Statement
			//String sql = "insert into Student values(null,'"+s.name+"',"+s.age+",'"+s.email+"','"+s.address+"')";
			
			String sql = "insert into Student values(null,?,?,?,?)";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, s.name);
			pStmt.setInt(2, s.age);
			pStmt.setString(3, s.email);
			pStmt.setString(4, s.address);
			
			int i = pStmt.executeUpdate();
			
			System.out.println("SQL Statement Executed!! Row(s) inserted "+i);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void updateStudent(Student s){
		try {
			
			//3. Create a SQL Statement
			
			String sql = "update Student set name = ?, age = ?, email = ?, address = ? where roll = ?";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, s.name);
			pStmt.setInt(2, s.age);
			pStmt.setString(3, s.email);
			pStmt.setString(4, s.address);
			pStmt.setInt(5, s.roll);
			
			int i = pStmt.executeUpdate();
			
			System.out.println("SQL Statement Executed!! Row(s) Updated "+i);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void deleteStudent(int roll){
		try {
			
			//3. Create a SQL Statement
			
			String sql = "delete from Student where roll = ?";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, roll);
			
			int i = pStmt.executeUpdate();
			
			System.out.println("SQL Statement Executed!! Row(s) Deleted "+i);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public ArrayList<Student> retrieveStudents(){
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		try {
			
			String sql = "select * from Student";
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			int r=0,a=0;
			String n="",e="",ad="";
			
			while(rs.next()){
				r = rs.getInt(1);
				n = rs.getString(2);
				a = rs.getInt(3);
				e = rs.getString(4);
				ad = rs.getString(5);
				
				//System.out.println(r+"\t"+n+"\t"+a+"\t"+e+"\t"+ad);
				//System.out.println("---------------------------------------------------------");
				
				Student s = new Student(r,n,a,e,ad);
				studentList.add(s);
			}
			
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return studentList;
	}
	
	public void executeProcedure(Student s){
		try {
			
			String sql = "{ call insertStudent(?,?,?,?) }";

			
			cStmt = con.prepareCall(sql);
			
			cStmt.setString(1, s.name);
			cStmt.setInt(2, s.age);
			cStmt.setString(3, s.email);
			cStmt.setString(4, s.address);
			
			cStmt.execute();
			
			System.out.println("PROCEDURE EXECUTED");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void processBatch(){
		try {
			
			String sql1 = "update Student set name = 'Riya', age = 10 where roll = 8";
			String sql2 = "delete Student roll = 6";
			
			stmt = con.createStatement();
			
			con.setAutoCommit(false);
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			stmt.executeBatch();
			
			con.commit(); // Transaction
			
			System.out.println("Batch Executed...");
			
		} catch (Exception e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			System.out.println("Some Exception: "+e);
		}
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
