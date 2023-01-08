package ch03;

import java.io.IOException;

public class While2 {
	public static void main(String[] args) throws IOException {
		System.out.print("보고 싶은 구구단 ? ");
		// 해당하는 구구단을 출력하는 프로그램 작성
		int num = System.in.read() - '0';
		System.out.println(num);
		
		int i = 1;
		while(i <= 9) {
			System.out.println(num + " * " + i + " = " + (num * i));
			i++;
		}
	}
}
