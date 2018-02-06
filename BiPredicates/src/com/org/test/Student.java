package com.org.test;

public class Student {
	
	private int sid;
	private String sname;
	private String sadd;
	private int fee;
	
	public Student(int sid, String sname, String sadd, int fee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sadd = sadd;
		this.fee = fee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString()
	{
		return "\t"+sid+"\t"+sname+"\t"+sadd+"\t"+fee;
	}

}
