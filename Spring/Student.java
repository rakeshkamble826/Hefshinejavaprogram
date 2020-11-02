package com.spring;

public class Student {

	
	
	  //getter & setter
		private String studentId;
		private String studentName;
		private String studentAddress;
		public String getStudentId() {
			return studentId;
		}
		public void setStudentId(String studentId) {
			System.out.println("Setting student id");
			this.studentId = studentId;
		}
		public String getStudentName() {
			
			return studentName;
		}
		public void setStudentName(String studentName) {
			System.out.println("Setting student name");
			this.studentName = studentName;
		}
		public String getStudentAddress() {
			return studentAddress;
		}
		public void setStudentAddress(String studentAddress) {
			System.out.println("Setting student address");
			this.studentAddress = studentAddress;
		}
		
		//para constructor
		public Student(String studentId, String studentName, String studentAddress) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentAddress = studentAddress;
		}
		
		//default constructor
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
					+ "]";
		}
		
		
	}


