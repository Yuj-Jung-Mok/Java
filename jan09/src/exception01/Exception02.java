package exception01;

import java.io.FileReader;
import java.io.IOException;

public class Exception02 {
	
	public static void main(String[] args) {
		// FileReader
		FileReader fr = null;
		
		try {
			fr = new FileReader("/Users/yjm/java/temp.txt");
			
			while(true) {
				int data = fr.read();
				if(data == -1) {
					break;	// 더 이상 읽어올 데이터가 없다면 종료
				}
				System.out.print((char)data);
			}
		} catch (Exception e) {
			// 예외 발생 시 처리 코드
			//e.printStackTrace();
			System.out.println("파일이 없습니다.");
		} finally {
			// 예외가 뜨던, 안 뜨던 반드시 실행할 문장
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * 예외를 처리하는 방법
		 * 
		 * 1. 던지기 Throw : 메소드 뒷 부분에 throw 처리할 타입
		 * 					 메소드가 실댕되다가 예외를 만나면 종료, 메소드를 호출한 쪽으로 예외를 던집니다.
		 * 					 메인 메소드까지 던져지면 VM으로 던집니다. 프로그램 종료.
		 * 
		 * 2. 직접 Exception을 만들어서 처리
		 * 					 예외 객체를 만들어서 처리하기
		 * 					 throw 객체명;
		 * 
		 * 		@override
		 * 		public void printStackTrace() {
		 * 			System.out.print("예외처리 발생");
		 *			super.printStackTrace();
		 * 		}
		 * 
		 * 3. 직접 처리
		 * 		try를 이용하여 오류를 막고 끝까지 실행되게 할 수 있습니다.
		 * 		
		 * 		try {
		 * 			예외가 발생할 것 같은 코드;
		 * 		} catch() {
		 * 			위 try문 속 예외가 발생한다면 실행할 코드
		 * 		} finally {
		 * 			예외 발생 여부와 상관 없이 실행할 코드
		 * 		}
		 */
		
	}
	
}
