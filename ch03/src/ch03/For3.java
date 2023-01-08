package ch03;

import java.util.Scanner;

public class For3 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 단 입력 : ");
		num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
		sc.close();
	}
}
