package com.callor.iolist;

import com.callor.iolist.service.IolistService;
import com.callor.iolist.service.impl.IolistServiceImplV1;

public class IolistEx_01 {
	
	public static void main(String[] args) {
		
		IolistService ioService = new IolistServiceImplV1();
		ioService.loadDataFromFile();
		ioService.iolistSum();
		ioService.printIolist();
		
		
	}

}
