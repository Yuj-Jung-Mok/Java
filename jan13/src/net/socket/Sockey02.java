package net.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Sockey02 {

	public static void main(String[] args) {
		String serverIP = "127.0.0.1"; // localhost
		System.out.println("서버에 연결중입니다.");
		
		// socket
		try {
			Socket socket = new Socket("172.30.1.9", 5000);
			// 입력 스트림
			InputStream in = socket.getInputStream();
			DataInputStream dataIn = new DataInputStream(in);
			
			// 출력
			System.out.println("서버에서 온 메시지 : " + dataIn.readUTF());
			System.out.println("연결 종료");
			
			// close
			dataIn.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
