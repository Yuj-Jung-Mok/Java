package com;

import java.io.IOException;

public class What02 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("한 글자를 입력 해주세요.");
		int user = System.in.read();
		System.out.println(user);
		System.in.read();	// 엔터키 처리, 윈도우 경우 2번 적용해야 합니다.
		
		System.out.println("두번째 숫자를 입력 해주세요.");
		int sec = System.in.read();
		System.out.println(sec);
		System.in.read();	// 엔터키 처리
		
		System.out.println("세번째 숫자를 입력 해주세요.");
		int th = System.in.read();
		System.out.println(th);
		System.in.read();	// 엔터키 처리
		
	}
}
