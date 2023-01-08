package ch03;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		int num = 0;
		String msg = "";
		
		do {
			System.out.println("정수를 입력하세요.");
			
			// 숫자와 문자를 순서대로 처리할 때 사용하는 방법
			//num = sc1.nextInt();
			num = Integer.parseInt(sc1.nextLine());
			System.out.println("입력한 숫자 : " + num);
			
			System.out.println("문자열을 입력하세요.");
			msg = sc1.nextLine();	// 숫자 입력에 사용한 enter를 읽고 처리함
			System.out.println("입력한 문자 : " + msg);
			
			if(msg.equals("x")) {
				break;
			}
		} while(true);
		
		System.out.println("프로그램 종료");
		
		sc1.close();
	}

}
