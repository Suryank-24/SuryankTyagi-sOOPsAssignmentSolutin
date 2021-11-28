package com.department.techdepartment;

import com.department.admindepartment.AdminDepartment;
import com.department.hrdepartment.HrDepartment;


class DriverClassMain{
	
	public static void main(String[] args) {
		
//Creating object of AdminDepartment class
		        
		AdminDepartment ad = new AdminDepartment();
				   
			System.out.println(ad.departmentName());
			System.out.println(ad.getTodaysWork());
			System.out.println(ad.getWorkDeadline());
//calling method of SuperDepartment class with the object of AdminDepartment class 			
			System.out.println(ad.isTodayAHoliday());
				
				System.out.println();
				System.out.println();
				
//Creating object of HrDepartment class
				
		HrDepartment hrd = new HrDepartment();
				
			System.out.println(hrd.departmentName());
			System.out.println(hrd.doActivity());
			System.out.println(hrd.getTodaysWork());
			System.out.println(hrd.getWorkDeadline());
//calling method of SuperDepartment class with the object of HrDepartment class			
			System.out.println(hrd.isTodayAHoliday());
						
				System.out.println();
				System.out.println();
				
//Creating object of TechDepartment class
				
		TechDepartment td = new TechDepartment();
								
			System.out.println(td.departmentName());
			System.out.println(td.getTodaysWork());
			System.out.println(td.getWorkDeadline());
			System.out.println(td.getTechStackInformation());
// calling method of SuperDepartment class with the object of TechDepartment class			
			System.out.println(td.isTodayAHoliday());	
	}
}

