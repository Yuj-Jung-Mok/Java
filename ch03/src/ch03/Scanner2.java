package ch03;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		// Scanner : 콘솔에서 데이터를 읽을 때 사용하는 도구.(클래스)
		// Scanner 사용 선언 sc 이름 선언	콘솔에서 데이터를 받겠다.
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.println("정수를 입력하세요.");
			num = sc.nextInt();	// 스캐너를 사용해서 정수를 읽어라	12 + enter, 12를 읽고 enter 무시
			System.out.println("입력한 숫자 : " + num);
		} while(num != 0);
		System.out.println("프로그램 종료");
		// 스캐너 사용 종료
		sc.close();
	}
}