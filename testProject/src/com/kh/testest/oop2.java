//package com.kh.testest;
//
//import java.io.*;
//
//public class oop2 {
//	
//	
//	
//	//FileWriter를 생성할 때 두 번째 매개변수로 
//	//true를 전달하여 파일을 이어쓰기 모드로 열어야 합니다.
//	//fw.close()를 호출하여 파일을 닫아준다
//	
//	FileWriter fw = null;
//	try {
//		fw = new FileWriter("test.txt");
//		// 두 번째 매개변수를 true로 설정하여 데이터를 이어쓸 수 있도록 함
//		//정답 : fw = new FileWriter("test.txt", true);
//		fw.write(97);
//		fw.write(65);
//		// 스트림을 닫음
//		//정답 : fw.close();
//	}catch(FileNotFoundException e) {
//		e.printStackTrace();
//	}catch(IOException e) {
//		e.printStackTrace();
//	}
//
//}
//
