package com.zyl.service;

import com.zyl.bean.Student;

public interface StudentService {
	
	Student getById(int id);
	
	Student addAge(Student stu,int n);
}
