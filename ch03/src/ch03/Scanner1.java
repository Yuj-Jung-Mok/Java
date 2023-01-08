package ch03;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		// System.in (콘솔에 입력한 글자)를 읽어온다.
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		do {
			System.out.print("문자열을 입력하세요 : ");
			msg = sc.nextLine();	// nextLine() : 문자열 한 줄을 읽기 (enter 포함 \r\n)
			// 출력할 때는 enter 제외
			System.out.println("입력한 문자열 : " + msg);
			
			// 동일 비교 : 문자 .equals(), 숫자 ==
			if(msg.equals("x")) break;
		} while(true);	// 무한 루프
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
