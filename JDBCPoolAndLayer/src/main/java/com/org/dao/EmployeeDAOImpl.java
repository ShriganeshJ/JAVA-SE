package com.org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.org.bo.EmployeeBo;
import com.org.utility.JdbcUtility;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String QUERY = "INSERT INTO EMPLOYEE VALUES(?,?,?,?)";

	public int insertData(EmployeeBo bo) throws Exception {
		Connection con = JdbcUtility.getConnection();
		int count=0;

		PreparedStatement ps = con.prepareStatement(QUERY);
		ps.setInt(1,bo.getEid());
		ps.setString(2,bo.getEname());
		ps.setInt(3,bo.getSal());
		ps.setString(4,bo.getJob());
		count=ps.executeUpdate();
		

		return count;
	}

}
