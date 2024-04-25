package com.Exam21.file;

import java.util.ArrayList;

import com.Exam21.Employee;



public class ReadFileData {
	
 public static ArrayList<Employee> empList = new ArrayList<Employee>();
 
 
	//your code should read data from file
	public static ArrayList<Employee> readFile() {
		Employee emp = new Employee();
		emp.setName("Deepa");
		emp.setPassword("Java123");
		emp.setAge(20);
		emp.setEmail("deepa@gmail.com");
		emp.setMobileNumber(1526484875);
		empList.add(emp);
		return empList;
		
	}
}
