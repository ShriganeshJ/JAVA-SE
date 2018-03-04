package com.org.view;

import com.org.controller.EmployeeController;

public class EmployeeView {

public static void main(String[] args)throws Exception {
	EmployeeController controller = new EmployeeController();
	System.out.println(controller.getData(130,"Payal",40000,"Developer"));
	
}
}
