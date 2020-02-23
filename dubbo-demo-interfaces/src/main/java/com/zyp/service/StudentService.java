package com.zyp.service;

import com.zyp.bean.Student;

public interface StudentService {
	
	Student getById(int id);
	
	Student addAge(Student stu,int n);
}
