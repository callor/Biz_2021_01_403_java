package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.model.ScoreVO;
import com.callor.shop.values.Values;

public class FileReader_02 {
	
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strLines = new ArrayList<String>();
		String fileName = "src/com/callor/shop/files/score.txt";
		/*
		 * 파일을 읽을때 사용하는 클래스
		 */
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			
			fileReader = new FileReader(fileName);
			/*
			
			fileReader를 사용한 저수준 코드
			
			while(true) {
				int ascii = fileReader.read();
				if(ascii == -1) {
					break;
				}
				System.out.printf("%c\n",ascii);
			}
			*/
			buffer = new BufferedReader(fileReader);
			while(true) {
				String str = buffer.readLine(); // nextLine()
				if(str == null) {
					break;
				}
				// System.out.println(str);
				strLines.add(str);
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
		// 파일읽기 끝
		for(String str : strLines) {
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setHistory(Integer.valueOf(scores[3]));
			scoreVO.setMusic(Integer.valueOf(scores[4]));
			scoreList.add(scoreVO);
		}
		
		for(ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMath();
			sum += vo.getHistory();
			
			float avg = (float)sum / 5;
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
		
		System.out.println(Values.dLine);
		System.out.println("국어\t영어\t수학\t"
				+ "음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);
		
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getKor() + "\t");	
			System.out.print(vo.getEng() + "\t");	
			System.out.print(vo.getMath() + "\t");	
			System.out.print(vo.getMusic() + "\t");	
			System.out.print(vo.getHistory() + "\t");	
			System.out.print(vo.getTotal() + "\t");	
			System.out.print(vo.getAvg() + "\n");	
		}
		System.out.println(Values.dLine);
		
		
		
		
		
	}
}
