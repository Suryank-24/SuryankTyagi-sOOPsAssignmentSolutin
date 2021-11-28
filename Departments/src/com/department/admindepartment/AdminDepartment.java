package com.department.admindepartment;

import com.department.superdepartment.SuperDepartment;


public class AdminDepartment extends SuperDepartment {

		
		public String departmentName() {
			return ("Welcome to Admin Department");
		}
		
		
		public String getTodaysWork() {
			return ("Complete your documents Submission");
		}
		
		
		public String getWorkDeadline() {
			return ("Complete by EOD");
		}

//Re-defining method of SuperDepartment class(super class) with the help of super keyword
		public String isTodayAHoliday() {
			return super.isTodayAHoliday();
		}
}
