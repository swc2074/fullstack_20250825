package com.company.java017_network;

import java.io.IOException;
import java.net.Socket;

import com.company.java017_network.Sender.Receiver;

public class Netwrok002_Client {

	public static void main(String[] args) {
		//#1. Client
		Socket socket = null;
		
		try {
			//#2. 고객이 AS센터에 연락 - 127.0.0.1
			socket = new Socket("127.0.0.1", 703);// IP, 포트번호
			System.out.println("[Client] 3. AS 센터에 고객문의 ~!");
			
			//#3. 데이터 주고받기
			Thread sender = new Sender(); sender.start();
			Thread recevier = new Receiver(); recevier.start();
			
			
		} catch (IOException e) {  e.printStackTrace(); }
		

	}

}
