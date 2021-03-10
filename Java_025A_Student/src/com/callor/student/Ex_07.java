package com.callor.student;

import com.callor.student.service.StudentService;

/*
 * 클래스 상속 : extends
 * 인터페이스 상속 : implements
 */

// StudentService 인터페이스를 상속받아서 클래스를 작성하려면
public class Ex_07 implements StudentService{

	@Override
	public void loadStudentFromFile() {
	}

	@Override
	public void searchStudent() {
	}

}
