package ch04;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
	
		// 4자리 년도를 입력 받아서 윤년, 평년 출력
		// 윤년 : 4로 나누어 떨어지고 100으로 나누면 안떨어지는 경우이거나 400으로 나누어 떨어지는 경우
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		do {
			System.out.print("계산할 년도를 입력하세요 : ");
			year = sc.nextInt();
			
			if(year == 0) break;
			
			// && 와 || 있을 경우 && 먼저 실행, 아래 문장에 () 생략 가능
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.printf("\n%d년은 윤년 입니다.\n", year);
			} else {
				System.out.printf("\n%d년은 평년 입니다.\n", year);
			}
		} while(year != 0);
		
		System.out.println("프로그램 종료");
		sc.close();
		
	}
	
}
