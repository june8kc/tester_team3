package com.main;

import java.sql.*;


public class Student 
{
    public static void ListStudent() throws ClassNotFoundException, SQLException {
		//2.Step: Registering gsm operator means "registering to our driver(Oracle Driver)"
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3.Step:Call your friend means "establish connection with the database"
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCLCDB", "ocodecyber", "10293847565");
		
		//4.Step: Create some sentences to tell to your friend means "Create Statement"
		Statement st = con.createStatement();
		
		//5.Step:Start to talk with your friend means "Create SQL Query and execute it"
		
		//1. Example:
		
		String q1 = "SELECT * FROM STUDENTS";
		try {
			ResultSet r1 = st.executeQuery(q1);
			System.out.println();
			System.out.println("============STUDENTS============");
	
			//6.Step: Do some actions according to the result
			while(r1.next()) {
				System.out.println(r1.getInt(1) + " == " + r1.getString(2)+ " == " +r1.getString(3)+ " == " +r1.getInt(4));
			}
			System.out.println("================================");
			System.out.println();
		} catch (Exception e) {
			//TODO: handle exception
		}



        con.close();
        st.close();
	}

	public static void DeleteStudent(int Studentid) throws ClassNotFoundException, SQLException {
		//2.Step: Registering gsm operator means "registering to our driver(Oracle Driver)"
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3.Step:Call your friend means "establish connection with the database"
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCLCDB", "ocodecyber", "10293847565");
		
		//4.Step: Create some sentences to tell to your friend means "Create Statement"
		Statement st = con.createStatement();
		
		//5.Step:Start to talk with your friend means "Create SQL Query and execute it"
		
		//1. Example:
		String q1 = "DELETE FROM students WHERE studentid="+Studentid;
		st.executeUpdate(q1);
		ListStudent();
		
		//6.Step: Do some actions according to the result

        con.close();
        st.close();
	}

	public static void AddStudent(int Studentid, String firstname, String lastName, int average) throws ClassNotFoundException, SQLException {
		//2.Step: Registering gsm operator means "registering to our driver(Oracle Driver)"
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3.Step:Call your friend means "establish connection with the database"
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCLCDB", "ocodecyber", "10293847565");
		
		//4.Step: Create some sentences to tell to your friend means "Create Statement"
		Statement st = con.createStatement();
		
		//5.Step:Start to talk with your friend means "Create SQL Query and execute it"
		
		//1. Example:
		String q1 = "INSERT INTO students(studentid,firstname,lastname,average) VALUES("+Studentid+",'"+firstname+"','"+lastName+"',"+average+")";
		st.executeUpdate(q1);
		ListStudent();
		
		//6.Step: Do some actions according to the result

        con.close();
        st.close();
	}

	public static void deleteAllStudent() throws ClassNotFoundException, SQLException {
		//2.Step: Registering gsm operator means "registering to our driver(Oracle Driver)"
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3.Step:Call your friend means "establish connection with the database"
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCLCDB", "ocodecyber", "10293847565");
		
		//4.Step: Create some sentences to tell to your friend means "Create Statement"
		Statement st = con.createStatement();
		
		//5.Step:Start to talk with your friend means "Create SQL Query and execute it"
		
		//1. Example:
		String q1 = "DELETE FROM STUDENTS";
		st.executeUpdate(q1);
		ListStudent();
		
		//6.Step: Do some actions according to the result

        con.close();
        st.close();
	}
	static Statement st;
	static Connection con;

	public static void controlTable() throws SQLException, ClassNotFoundException {
		//2.Step: Registering gsm operator means "registering to our driver(Oracle Driver)"
			Class.forName("oracle.jdbc.driver.OracleDriver");

		
		//3.Step:Call your friend means "establish connection with the database"
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCLCDB", "ocodecyber", "10293847565");

		
		//4.Step: Create some sentences to tell to your friend means "Create Statement"
			st = con.createStatement();

		
		//5.Step:Start to talk with your friend means "Create SQL Query and execute it"
		
		String q2 = "CREATE TABLE students(studentid NUMBER(3),firstname VARCHAR2(20),lastname VARCHAR2(20), average NUMBER(3))";
		try {
			ResultSet r2 = st.executeQuery(q2);
		} catch (Exception e) {
			
		}

		//6.Step: Do some actions according to the result
        con.close();
        st.close();
	}

}
