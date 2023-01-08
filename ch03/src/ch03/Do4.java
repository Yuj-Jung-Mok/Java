package ch03;

import java.io.IOException;

public class Do4 {
	public static void main(String[] args) throws IOException {
		int num = 0, i = 1;
		
		do {
			// 입력값 처리
			System.out.println("출력 구구단 입력");
			num = System.in.read() - '0';
			System.in.read();
			if(num < 2) {
				System.out.println("구구단 숫자가 아닙니다.");
			} else {
				do {
					System.out.printf("%d * %d = %d\n", num, i, num * i);
					i++;
				} while(i <= 9);
			}
			i = 1;
		} while(num != 0);
		
		System.out.println("프로그램 종료");
	}
}
