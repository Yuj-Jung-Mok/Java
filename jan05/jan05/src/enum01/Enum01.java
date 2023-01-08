package enum01;

// Enum : 열거 타입
/*
 * 열거한 데이터만 쓸 수 있습니다.
 * 같은 값은 가질 수 없습니다.
 * enum은 클래스명하고 중복할 수 없습니다.
 */
enum Week {
	월요일, TUE, WED, TUH, FRI, SET, SUN;
}

public class Enum01 {
	public static void main(String[] args) {
		Week week = Week.월요일;
		
		// 레코드는 16 버전 이상.
		
		// 데이터형 추론 기능은 10 버전 이상. 지역변수, 초기화, Null 초기화 불가, 배열 불가
		var number = 10;
		System.out.println(number);
		
		var name = "홍길동";
		String str = name;
		System.out.println(str);
	}
}
