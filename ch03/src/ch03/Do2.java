package ch03;

import java.io.IOException;

public class Do2 {

	public static void main(String[] args) throws IOException {
		// 한 자리 정수를 받아서 해당하는 구구단 출력 do {} while();
		System.out.print("출력할 구구단은 ? ");
		int num = System.in.read() - '0';

		int i = 1;
		do {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
			i++;
		} while(i <= 9);
	}

}
