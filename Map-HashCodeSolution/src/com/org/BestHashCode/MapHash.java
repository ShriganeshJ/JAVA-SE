package com.org.BestHashCode;

import java.io.FileReader;
import java.util.Properties;

public class MapHash {

	public static int getCourse(String course) {
		
		Properties courses = new Properties();
		
		try
		{
			
			courses.load(new FileReader("course.properties"));
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return Integer.parseInt(courses.getProperty(course.toUpperCase()));
	}

}
