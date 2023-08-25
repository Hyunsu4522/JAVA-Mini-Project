package com.kh.testest;

import java.io.*;

public class oop1 {
	//서버IP : 198.168.20.34, 포트번호 : 3000
	/*
	 * 
	 *클라이언트 IP 설정: 
	 *클라이언트에서 서버로 연결할 때 로컬 호스트의 IP 주소를 사용하고 있습니다. 
	 *클라이언트는 서버의 IP 주소를 명시적으로 지정해야 합니다. 
	 *클라이언트 코드에서 이 주소를 사용하도록 수정해야 합니다. 
	 */
	//[클라이언트용]
	public void client() {
		int port = 3000;
		String serverIP = "192.168.100.77"; // 서버의 IP 주소로 설정
		try {
			Socket socket = new Socket(serverIP, port);
			
			//이하 코드는 중간 생략...
		}
	}
	
	//[서버용]
	public void server() {
		int port = 3000;
		
		ServerSocket server;
		
		try {
			server = new serversocket(port);
			
			while(true) {
				Socket client = server.accept();
			}
			
			//이하 코드는 중간 생략...
		}
	}
}