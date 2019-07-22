package com.bdqn.stu;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.c=90;
		student.html=80;
		student.java=100;
		
		StudentBiz studentBiz = new StudentBiz();
		double avg = studentBiz.getAvg(student);
		System.out.println(avg);
		
	}
}
