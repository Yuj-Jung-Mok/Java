package com;

import java.util.Scanner;

public class What {
	
	public static void main(String[] args) {
		int rNum = (int) ( ( Math.random() * 100 ) + 1);
		int cnt = 0;
		
		System.out.print("(" + rNum + ")숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			++cnt;
			int iNum = sc.nextInt();
			String msg = rNum > iNum ? "Up!" : rNum < iNum ? "Down!" : "Okay!";
			System.out.println(msg + " " + cnt + "회! ");
			if(msg.equals("Okay!")) break;
		}
		
		sc.close();
	}
	
}
