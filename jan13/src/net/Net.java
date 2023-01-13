package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 네트워킹
// 허브, 스위치, 포트 ...

// 네트워크
/*
 * 컴퓨터와 컴퓨터의 연결 ( 서버, 클라이언트 )
 * 두 대 이상의 컴퓨터를 케이블로 연결하여 네트워크를 구성하는 것 (연결의 개념)
 * = java.net
 * 
 * 서버 : 서비스를 제공하는 컴퓨터
 * 클라이언트 : 서버가 제공하는 서비스를 받는 컴퓨터
 * 
 * 서버 클라이언트 모델
 * P2P 모델 : 클라이언트가 서버 서비스를 제공하는 형태
 * 
 */
public class Net {

	public static void main(String[] args) {
	
		// naver 주소 알아오기
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName : " + ip.getHostName());
			System.out.println("getHostAddr : " + ip.getHostAddress());
			System.out.println("문자열로 : " + ip.toString());
			
			byte[] ipAddr = ip.getAddress();
			
			String result = "";
			for(int i = 0; i < ipAddr.length; i++) {
				result += ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i];
				result += ".";
				
			}
			
			result = result.substring(0, result.length() - 1);
			System.out.println("처리 결과 : " + result);
		} catch (UnknownHostException e) {
			System.out.println("호스트 에러");
		} finally {
			System.out.println();
			System.out.println();
		}
		
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName : " + ip.getHostName());
			System.out.println("getHostAddr : " + ip.getHostAddress());
			System.out.println("문자열로 : " + ip.toString());
			
			byte[] ipAddr = ip.getAddress();
			
			String result = "";
			for(int i = 0; i < ipAddr.length; i++) {
				result += ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i];
				result += ".";
				
			}
			
			result = result.substring(0, result.length() - 1);
			System.out.println("처리 결과 : " + result);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println();
		}
		
		
	}
	
}
