package com.org.bean;

import java.io.Serializable;

public class Employee implements Serializable {
	
	
private String ename;
private double sal;
private String dsg;
private int exp;
private int eno;

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDsg() {
		return dsg;
	}
	public void setDsg(String dsg) {
		this.dsg = dsg;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
//To compair data use equals method
	
	@Override
	public boolean equals(Object obj) {
		
		
		if(obj instanceof Employee)
		{
			Employee e = (Employee)obj;
			
			return this.dsg.equals(e.dsg)&&this.eno==e.eno;
		}
		return false;
	}
	
	
	

	
	
}
