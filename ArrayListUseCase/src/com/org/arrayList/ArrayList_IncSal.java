package com.org.arrayList;

import java.beans.Statement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import org.omg.CORBA.portable.InputStream;
import org.xml.sax.InputSource;

import com.org.bean.Employee;

public class ArrayList_IncSal {

	/*
	 * Fetch data from Data Base and increase the salary of employee experience is
	 * >5 and designation is java JDBC connectivity information collect from
	 * property file and  override equals method to compair data
	 */
	private static final String QUERY = "SELECT ENO,ENAME,SAL,DESIG,EXP FROM EMPLOYEE5";
	private static ArrayList<Employee> empal = new ArrayList<>();
	private String option = null;
	private Scanner snc = new Scanner(System.in);
	private static ResultSet rs;

	public static void main(String[] args) throws Exception {
		java.sql.Statement st = null;

		// get connection
		Connection con = ArrayList_IncSal.getConnection();
		st = con.createStatement();
		rs=st.executeQuery(QUERY);
		while(rs.next())
		{
		//result set in not seralizable so take support of BO
			Employee e = new Employee();
			e.setEno(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setSal(rs.getFloat(3));
			e.setDsg(rs.getString(4));
			e.setExp(rs.getShort(5));
			
			empal.add(e);
		}

		Employee e;
		// Logic for incress the salary

		for (int i = 0; i < empal.size(); i++) {
			Employee e1 = empal.get(i);
			if (e1.getDsg().equalsIgnoreCase("java")) {
				if (e1.getExp() > 5) {
					e1.setSal(e1.getSal() * 2);
				}

			} // if

		} // For
			// using Lambda java-8 internal loop display data
		empal.forEach(emp -> {
        
			System.out.print("|"+emp.getEno()+"|" + "\t");
			System.out.print("|"+emp.getEname() +"|"+ "\t");
			System.out.print("|"+emp.getDsg() +"|"+ "\t");
			System.out.print("|"+emp.getExp() +"|"+ "\t");
			System.out.print("|"+emp.getSal()+"|" + "\t");
			System.out.println();

		});

	}// main

	// property file config
	private static Properties getProperty() throws FileNotFoundException, Exception {
		Properties prop = new Properties();
		FileInputStream in = new FileInputStream("Jdbc.properties");
		prop.load(in);
		return prop;
	}// property

	// get connection
	private static Connection getConnection() throws SQLException, Exception {
		Properties prop = ArrayList_IncSal.getProperty();
		String url = prop.getProperty("jdbc.url");
		String user = prop.getProperty("jdbc.user");
		String pass = prop.getProperty("jdbc.password");

		Connection con = DriverManager.getConnection(url, user, pass);
		return con;

	}// connection
}// class
