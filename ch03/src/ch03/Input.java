package ch03;

import java.io.IOException;

public class Input {
	public static void main(String[] args) throws IOException {
		System.out.println("정수 한 자리를 입력하세요.");
		// System.in.read() : 문자 하나만 읽을 때 사용
		int num = System.in.read() - '0';
		System.out.println(num);
	}
}
