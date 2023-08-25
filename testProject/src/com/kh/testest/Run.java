package com.kh.testest;

import java.io.*;

public class Run {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("test.txt",true)); //true로 설정
			bw.write("안녕하세요");
			bw.write("반갑습니다");
			bw.close(); // close()를 호출하여 파일을 닫아준다
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
