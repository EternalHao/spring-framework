package com.debug.aop;

import org.springframework.stereotype.Service;

//@Component("studentService")
//@Repository("studentService")
@Service("studentService")
public class StudentService {
	public void addStudent(){
		System.out.println("StudentService 添加学生");
	}
}
