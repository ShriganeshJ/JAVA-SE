package com.org.controller;

import com.org.dto.EmployeeDTO;
import com.org.service.EmployeeService;
import com.org.service.EmployeeServiceImpl;

public class EmployeeController {
	public String getData(int eid,String ename,int sal,String job) throws Exception
	{
		EmployeeDTO dto = new EmployeeDTO();
		EmployeeService service=new EmployeeServiceImpl();
		//set value to dto
		dto.setEid(eid);
		dto.setEname(ename);
		dto.setSal(sal);
		dto.setJob(job);
		
		return service.insertData(dto);
	}

}
