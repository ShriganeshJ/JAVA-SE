package com.org.service;

import com.org.bo.EmployeeBo;
import com.org.dao.EmployeeDAO;
import com.org.dao.EmployeeDAOImpl;
import com.org.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

	public String insertData(EmployeeDTO dto) throws Exception {
		EmployeeDAO dao = new EmployeeDAOImpl();
		int count=0;
		EmployeeBo bo = new EmployeeBo();
		//copy data bo to dto
		bo.setEid(dto.getEid());
		bo.setEname(dto.getEname());
		bo.setSal(dto.getSal());
		bo.setJob(dto.getJob());
		count=dao.insertData(bo);
		if(count==0)
		{
			return "Record not Inserted";
		}
		
		return "Record Insert Success..";
	}

}
