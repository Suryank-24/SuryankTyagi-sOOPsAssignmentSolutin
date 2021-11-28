package com.department.techdepartment;

import com.department.superdepartment.SuperDepartment;

class TechDepartment extends SuperDepartment {

		
	  public String departmentName() {
		return ("Welcome to Tech Department");	
	}
	 
	 
	 public String getTodaysWork() {
		 return ("Complete coding of module 1");
	 } 
	 
	 
	 public String getWorkDeadline() {
		 return ("Complete by EOD");
	 }
	 
	 public String getTechStackInformation() {
		 return ("core Java");
  }
	 
//Re-defining method of SuperDepartment class(super class) with the help of super keyword
	public String isTodayAHoliday() {
		return super.isTodayAHoliday();
	}
	 
}
