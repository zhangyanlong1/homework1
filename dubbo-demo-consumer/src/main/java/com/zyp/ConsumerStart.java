package com.zyp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyp.bean.Student;
import com.zyp.service.CalulateService;
import com.zyp.service.StudentService;

public class ConsumerStart {
	private static ClassPathXmlApplicationContext context;
	private static StudentService studentService;
	private static CalulateService calulateService;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		
//		studentService = context.getBean(StudentService.class);
//		Student student = studentService.getById(20);
//		System.out.println("stuent is "  + student);
//		Student addAge = studentService.addAge(student, 3);
//		System.out.println("加岁数以后的数据 "  + addAge);
		
		calulateService= context.getBean(CalulateService.class);
		int add = calulateService.add(1, 2);
		System.out.println(add);
		int multiply = calulateService.multiply(2, 3);
		System.out.println(multiply);
	}
}
