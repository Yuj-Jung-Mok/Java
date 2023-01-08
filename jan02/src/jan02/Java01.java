package jan02;
// 한줄 주석 = 라인 주석
/*
 * 단락 주석 = 블럭 주석
 * */

/** 
 * 문서 주석 = doc */
// windows : EUC-KR -> MS949
// Linux, mac: UTF-8
public class Java01 {	// Java01 클래스
	public static void main(String[] args) {	// main 메소드
		System.out.println("Hi");	// 명령문
		
		// 호출
		AppleKorea appleKorea = new AppleKorea();
		appleKorea.appleKorea();
		
		print(100, "홍길동");
	}
	
	public static void print(int num, String name) {	// 파라미터
		System.out.println("PrintMethod 입니다.");
		System.out.println("들어온 값 : " + num);
		System.out.println("이름 : " + name);
	}
}

// 클래스 : 대문자로 시작 = 파스칼 표기법
// 메소드 : 소문자 시작, 뒤에오는 단어 대문자 = 카멜 표기법 
// 변수   : 소문자 시작
// 상수   : 모두 대문자, _ 붙여서 연결 = 스네이크 표기법

class AppleKorea {
	public static void appleKorea() {
		int appleKorea = 100;
		int APPLE_KOREA = 100;
	}
}