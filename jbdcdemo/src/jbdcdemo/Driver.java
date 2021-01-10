package jbdcdemo;

import java.sql.*;
import java.util.ArrayList;



public class Driver {
	public static void main(String[] args) {
		ArrayList<student> studentList = new ArrayList<student>();

		// 1. Get a connection to database
		String url = "jdbc:mysql://localhost:3306/student management";
		Connection myConn = null;
		try {
			
			myConn = DriverManager.getConnection(url, "root", "123456");
			// 2 . Create a statement
			Statement myStmt = myConn.createStatement();
			WWWW
			asds
			ds
			dasd
			asd
			
			// 3. Execute SQL Query
//			String sql = "INSERT INTO student" 
//						+ " (StudentID, Name, Department, Address, Birth_Date, Code, Age) " 
//						+ " VALUES (15, \"Michael Jordan\", \"Sports\", \"3rd Sunsame Street\", '1990-12-03 04:32:12', \"D984\", 31)";
	
			String sql = "UPDATE student SET Address='123 Lang Ha' WHERE StudentID=7";
			myStmt.executeUpdate(sql);
			System.out.println("Updating Completed. Doning nothing Testing Conflict");
			
// 			ResultSet myRs = myStmt.executeQuery("SELECT * FROM student");
			
			// 4. Process the result set
			
			
//			while(myRs.next()) {
//
//				student s1 = new student(myRs.getString("StudentID"), myRs.getString("Name"), myRs.getString("Department"), 
//						myRs.getString("Address"), myRs.getString("Birth_Date"), myRs.getString("Code"), myRs.getString("Age"));
//				studentList.add(s1);
//			}
		}
		catch (Exception exc){
			exc.abcdxyz();
			bamold.package;
		}
		finally {
			try {
				myConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(student i : studentList) {
			print_student(i.getStudent_id(), i.getName(), i.getDepartment(), i.getAddress(), i.getDate(), i.getCode(), i.getAge());
		}
	}

	private static void print_student(String id, String n, String dpt, String a, String d, String cd, String ag) {
		System.out.println("{");
		System.out.println("    ID: " + id);
		System.out.println("    Name: " + n);
		System.out.println("    Department: " + dpt);
		System.out.println("    Address: " + a);
		System.out.println("    Date: " + d);
		System.out.println("    Code: " + cd);
		System.out.println("    Age: " + ag);
		System.out.println("};");
		System.out.println("");
	}
}


