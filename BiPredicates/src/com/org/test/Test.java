package com.org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class Test {

	
	public static void main(String[] args) {
		Map<String,Student> map = new HashMap<>();
		map.put("a007",new Student(10, "raja", "hyd", 20000));
		map.put("a008",new Student(11, "rani", "hyd", 1000));
		map.put("a009",new Student(12, "rama", "chn", 5000));
		map.put("a010",new Student(14, "babu", "vzag", 5000));
		map.put("a011",new Student(15, "rao", "chn", 70000));
		map.put("a012",new Student(16, "kov", "rsa", 1000));
		
		map.forEach((k,v)->System.out.println(k+"::"+v));
		
		System.out.println("select student fee >2000");
		
		BiPredicate<String,Student> bp =(k,v)->v.getFee()>=2000;
		
		map.forEach((k,v)->{
			if(bp.test(k, v))
			{
			  System.out.println(k+"::"+v);
			}
		});
	
	}
}
