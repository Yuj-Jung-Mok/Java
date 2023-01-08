package ch03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 숫자의 자리수 합계를 구하시오.
		// 376 => 3 + 7 + 6, 1145 => 1 + 1 + 4 + 5
		int sum = 0, num = 0;
		
		System.out.print("계산할 숫자를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("합계 : " + sum);
		sc.close();
	}
}
