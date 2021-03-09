package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.Values;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> stdList;
	public StudentServiceImplV1() {
		stdList = new ArrayList<StudentVO>();
	}
	
	@Override
	public void loadStudentFromFile() {
		
		String fileName = "src/com/callor/student/학생정보리스트.txt";
		FileReader fileReader = null; //널값
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				String[] stds = reader.split(":");
				
				StudentVO stdVO = new StudentVO(
						stds[0],
						stds[1],
						stds[2],
						stds[3],
						stds[4],
						stds[5],
						stds[6]
					);
				stdList.add(stdVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void searchStudent() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(Values.dLine(50));	
			System.out.println("찾는 학생이름을 입력하세요"
					+ "(종료하려면 QUIT를 입력)");
			System.out.println(Values.sLine(50));
			System.out.printf("이름>> ");
			String strName = scan.nextLine();

			if(strName.equals("QUIT")) {
				System.out.println("종료합니다");
				break;
			}
			
			int index = 0;
			int nSize = stdList.size();
			
			for(index = 0 ; index < nSize ; index++) {
				StudentVO stdVO = stdList.get(index);
				if(strName.equals(stdVO.getStName())) {
					break;
				}
			}
			// for문이 종료, 중단되었을때
			// index와 nSize값의 관계를 비교해 보면
			// index < nSize ==> 중단되었다(break)
			// index >= nSize ==> for() 모두 반복, 자료가 없다
			if(index < nSize) {
				this.printStVO(stdList.get(index));
			} else {
				System.out.println(strName + " 학생은 자료가 없음");
			}
		}
	} // end searchStudent()
	
	protected void printStVO(StudentVO sVO) {
		System.out.println(Values.dLine(50));
		System.out.printf("학번 : %s\n",sVO.getStNum());
		System.out.printf("이름: %s\n",sVO.getStName());
		System.out.printf("학년: %s\n",sVO.getStGrade());
		System.out.printf("반: %s\n",sVO.getStClass());
		System.out.printf("주소: %s\n",sVO.getStAddr());
		System.out.printf("전화번호: %s\n",sVO.getStTel());
		System.out.println(Values.dLine(50));
	}
}
