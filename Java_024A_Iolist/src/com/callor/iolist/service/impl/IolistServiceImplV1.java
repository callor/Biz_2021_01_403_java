package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.IolistVO;
import com.callor.iolist.service.IolistService;
import com.callor.iolist.values.ValIolist;
import com.callor.iolist.values.Values;

public class IolistServiceImplV1 implements IolistService {

	private List<IolistVO> iolist;
	public IolistServiceImplV1() {
		iolist = new ArrayList<IolistVO>();
	}
		
	@Override
	public void loadDataFromFile() {
		// TODO 데이터파일을 읽어오기
		String fileName = "src/com/callor/iolist/매입매출데이터.txt";
		
		// 파일읽기 위한 객체 선언
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		try {
			// 파일읽기 위한 객체 생성(초기화)
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			// buffer에 읽어들인 text 파일데이터에서
			// 한줄씩 데이터를 읽어서 처리하기
			while(true) {
				// buffer에서 한줄 데이터를 읽어서 reader 변수에 저장
				String reader = buffer.readLine();
				
				// EOF(End of File, 파일을 모두 읽었는지) 검사
				// buffer는  EOF 에 다다르면 null값을 return하고
				// reader 변수에는 null값이 담겨 있게 된다
				// 만약 reader변수에 null값이 담겨 있으면
				// 더이상 다른 일을 하지 마라
				if(reader == null) {
					break;
				}
				
				// reader 변수에 담긴 문자열을 연산하기
				// 1. 문자열을 특별한구분자로 나누어서
				// 2. 분해한 후 IolistVO 객체에 담고
				// 3. List<IolistVO> 리스트에 추가해 두기
				
				// 컴마(,)를 구분자로 하여 분해
				// 분해한 결과는 문자열 배열 형태이므로
				// 문자열 배열을 선언하여 저장해 둔다.
				String[] ioDatas = reader.split(",");
				
				// 필드생성자를 사용하여 IolistVO객체를 생성하면서
				// 인스턴스변수에 값 담기
				IolistVO iolistVO = new IolistVO(
						ioDatas[ValIolist.IO_DATE], // 거래일자
						ioDatas[ValIolist.IO_PNAME], // 상품명
						ioDatas[ValIolist.IO_DEPT], // 거래처명
						Integer.valueOf(ioDatas[ValIolist.IO_INOUT]), // 구분
						Integer.valueOf(ioDatas[ValIolist.IO_IPRICE]), // 매입단가
						Integer.valueOf(ioDatas[ValIolist.IO_OPRICE]), // 판매단가
						Integer.valueOf(ioDatas[ValIolist.IO_QTY]) // 수량
				);
				iolist.add(iolistVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없음!!!");
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중 문제 발생");
		}
	}

	@Override
	public void iolistSum() {
		// TODO 구분값에 따라 매입금액, 판매금액 계산하기
		
		 for(IolistVO vo : iolist) {
			 
			 // 매입금액, 판매금액을 담을 변수를 0으로 생성
			 int iprice = 0;
			 int oprice = 0;
			 
			 // 구분값을 inout 변수에 담고
			 int inout = vo.getIoInout();
			 
			 // 구분값에 따라 iprice 또는 oprice만 계산하면
			 // 계산하지 않은 변수는 0으로 게속 유지
			 if(inout == 1) { // 구분이 매입일 경우
				 iprice = vo.getIoIPrice() * vo.getIoQty();
			 } else if(inout == 2) {
				 oprice = vo.getIoOPrice() * vo.getIoQty();
			 }
			 
			 // 매입금액, 판매금액을 vo에 담기
			 vo.setIoITotal(iprice);
			 vo.setIoOTotal(oprice);
		 }
	}

	@Override
	public void printIolist() {
		// TODO 매입매출리스트 출력
		
		System.out.println("** Loo9 매입매출 명세서 **");
		System.out.println(Values.dLine(50));
		System.out.println("거래일자\t거래처명\t상품명\t매입금액\t판매금액");
		System.out.println(Values.sLine(50));
		
		int nCount = 0;
		int nITotal = 0;
		int nOTotal = 0;

		// int 형 배열은 배열을 선언함과 동시에
		// 		각 요소가 0으로 초기화 된다.
		int arrTotal[] = new int[2];
		for(IolistVO vo : iolist) {
			System.out.print(vo.getIoDate() + "\t");
			System.out.print(vo.getIoPName() + "\t");
			System.out.printf("%5d\t",vo.getIoITotal());
			System.out.printf("%5d\n",vo.getIoOTotal());
			
			nCount++;
			nITotal += vo.getIoITotal();
			nOTotal += vo.getIoOTotal();
			
			arrTotal[0] += vo.getIoITotal();
			arrTotal[1] += vo.getIoOTotal();
			
		}
		System.out.println(Values.sLine(50));
		System.out.printf("합계: %3d건\t\t%3d\t%3d\n",
				nCount,nITotal, nOTotal);
		System.out.println(Values.dLine(50));
		System.out.printf("합계: %3d건\t\t",nCount);
		
		for(int n : arrTotal) {
			System.out.printf("%3d\t",n);
		}
		System.out.println();
	}
}
