package com.org.BestHashCode;



public class Student
{

	private int son;
	private String sname;
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}




	private int fee;
	private long mobno;
	private String Course;
	public int getSon() {
		return son;
	}
	public void setSon(int son) {
		this.son = son;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "\n  StudentNo=" + son + ", StudentName=" + sname + ", fee=" + fee + ", MobNo=" + mobno + Course+"\n";
	} 
	
	
	@Override
	public int hashCode() {
		
		//return 5;
		
		
		return MapHash.getCourse(this.Course);
		
		}
		
		
	
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		
		if(obj instanceof Student)
		{
			Student s = (Student)obj;
			
			
			
			return  this.son==s.son; //compairing data
		}
		return false;
	}
	
	
	
	
}
