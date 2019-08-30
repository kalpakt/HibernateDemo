package com.kmt;

import com.kmt.DAO.StudentDao;
import com.kmt.pojo.Students;

public class Test {

	public static void main(String[] args) {
		StudentDao test = new StudentDao();
		Students student1 = test.fetchStudentData();
		System.out.println(student1.getRollno());
		System.out.println(student1.getName());
	}
}
