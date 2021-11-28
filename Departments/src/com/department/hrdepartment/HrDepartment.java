package com.department.hrdepartment;

import com.department.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		return ("Welcome to HR Department");	
	}
	 
	 
	 public String getTodaysWork() {
		 return ("Fill today's timesheet and mark your atttendance");
	 } 
	 
	 
	 public String getWorkDeadline() {
		 return ("Complete by EOD");
	 }
	 
	 public String doActivity() {
		 return ("team Lunch");
    }
	 
//Re-defining method of SuperDepartment class(super class) with the help of super keyword
	public String isTodayAHoliday() {
			return super.isTodayAHoliday();
		}
}
