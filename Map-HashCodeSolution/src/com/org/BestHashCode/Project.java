package com.org.BestHashCode;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Project {
	public static void main(String[] args) {
		
		
		
		LinkedHashSet<Student> lhs = new LinkedHashSet<>();
		
		Scanner snc=null;
		Student s = null;
		String option=null;
		//int no=0;
		
		snc= new Scanner(System.in);
		
		
		
		do
		{
			try
			{
			//no++;
			s=new Student();
		System.out.println("Enter Student NO");
		s.setSon(snc.nextInt()); snc.nextLine();
		System.out.println("Enter Name");
		s.setSname(snc.nextLine());
		
		System.out.println("Course");
		s.setCourse(snc.nextLine());
		
		
		System.out.println("Enter Mobile No");
		s.setMobno(snc.nextLong()); snc.nextLine();
		System.out.println("Fee");
		s.setFee(snc.nextInt());snc.nextLine();
		
		
		
		System.out.println("Do you wan cont....Yes/No");
		option=snc.nextLine();
		
		
		//lhm.put(s, value)
		lhs.add(s);
		
		
		}
		
		catch(NumberFormatException cnf)
		{
			
			//System.out.println("Enter Correct Value");
			cnf.printStackTrace();
		}
		
		catch(Exception e)
		{
			System.out.println("Try Again");
		}
		
		}while(option.equalsIgnoreCase("yes"));
		
		
		System.out.println(lhs);
		
		
		

		
		
		
		
	}

}
