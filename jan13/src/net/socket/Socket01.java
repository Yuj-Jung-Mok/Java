package net.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

// 소켓 프로그래밍
/*
 * 소켓을 이용하는 통신 프로그램을 말합니다.
 * 소켓 : 프로세스 간 통신에 사용되는 양 끝단 영역을 말합니다.
 * java.net 안에 소켓이 있습니다.
 * tcp/udp를 사용한 소켓 프로그래밍이 대표적입니다.
 * 
 * tcp/udp OSI 7계층
 * tcp : 전화 : 데이터를 전송하기 전에 먼저 상대편과 연결한 후 데이터를 전송합니다. 전송 되었는지 (잘 수신 했는지) 검사합니다.
 * 
 * udp : 전보 : 연결하지 않고 데이터를 전송합니다. 전송 확인을 하지 않습니다. 데이터를 순서대로 보낸다는 보장이 없습니다.
 * 
 * 서버와 클라이언트 1 : 1 통신
 * 서버가 먼저 실행되어 클라이언트의 연결을 기다립니다.
 * socket : 프로세스 간 통신을 담당합니다.
 * serverSocket : 포트와 연결되어 외부 연결 요청을 기다리다가 연결이 들어오면 socket을 생성하여 소켓 간 통신함
 * 
 * 하나의 포트에는 하나의 소켓이 연결됩니다.
 * (프로토콜이 다르면 다른 포트를 공유합니다.)
 * 1. 서버는 서버 소켓을 사용하여 서버 컴퓨터의 특정 포트에서 클라이언트의 연결 요청을 처리합니다.
 * 
 * 2. 클라이언트는 접속할 서버의 IP 주소와 포트 정보로 소켓을 생성하여 서버에 연결 요청을 합니다.
 * 
 * 3. 서버 소켓은 클라이언트의 요청을 받으면서 서버에 새로운 소켓을 생성하여 클라이언트와 연결합니다.
 * 
 * 4. 클라리언트의 소켓과 서버 소켓은 1:1 통신 합니다.
 */

public class Socket01 {
	
	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
		return sdf.format(new Date());
	}
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5000);
			System.out.println(getTime() + " 접속되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + " 요청이 들어옴");
				
				//소켓에서 출력 스트림 얻기
				OutputStream out = socket.getOutputStream();
				DataOutputStream dataOut = new DataOutputStream(out);
				
				//원격 소켓 보내기
				dataOut.writeUTF("서버에서 보낸 메시지입니다.");
				System.out.println(getTime() + " 메시지를 전송했습니다.");
				
				//close
				dataOut.close();
				socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}


}