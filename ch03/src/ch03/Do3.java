package ch03;

import java.io.IOException;

public class Do3 {
	
	public static void main(String[] args) throws IOException {
		int num = 0;
		// do ~ while : 조건이 맞을 때까지 반복 실행이 가능
		do {
			// 윈도우 기준 : 입력 숫자 + (enter => CR(13) + LF(10))
			// Linux 	: 입력 숫자 + (enter => LF(13))
			System.out.print("한자리 짝수로 입력하세요! ");
			// System.in.read() : 데이터가 있을 때까지 한글자만 읽어서 처리
			num = System.in.read() - '0'; // 0(48)
			//System.in.read();	// CR	\r (윈도우 기준)
			System.in.read();	// LF	\n	(맥은 1번만 하면 됨)
			// System.in.read()에서 맥 기준 2개가 입력됐기 때문에 입력 숫자만 변수에 담고 나머지(CR+LF)는 변수로 담지 않고 상태 처리한다.
		} while(num % 2 != 0);
		
		System.out.println("입력한 짝수는 " + num + "입니다.");
	}
	
}