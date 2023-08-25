package com.kh.io;
import java.io.*;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String filePath = "myFile.txt";
		
		try {
			File file = new File(filePath);
			boolean isFileCreated = file.createNewFile();
			
			if(isFileCreated) {
				System.out.print("파일 생성 완료 : " + filePath);
			}else {
				System.out.print("파일 생성 실패");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			OutputStream out = new FileOutputStream(filePath);
			String data = "no";
			out.write(data.getBytes());
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		// ==
//		try (OutputStream out = new FileOutputStream(filePath)){
//			String data = "7";
//			out.write(data.getBytes());
//		}catch(IOException e){
//			e.printStackTrace();
//		}
		
		try (InputStream in = new FileInputStream(filePath)){
			int readByte = in.read();
			System.out.println((char)readByte);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
