package inner;

// 중첩 클래스 (Nested Class) : 클래스 속에 클래스
// 두 클래스가 밀접한 관련이 있을 때 서로 묶어주기

/*
 * 장점
 * - 내부 클래스는 외부에 노출되지 않습니다.
 * - 캡슐화, 코드의 복잡성을 줄여줍니다.
 * 
 * 종류
 * 
 * static Class
 * 		외부 클래스의 멤버 변수 선언 위치에 선언합니다.
 * 		외부 클래스의 static 멤버처럼 사용됩니다.
 * 		주로 외부 클래스의 static 멤버에서 사용될 목적으로 만듬
 * 	
 * member Class
 * 		외부 클래스의 멤버 변수 선언 위치에 선언합니다.
 * 		외부 클래스의 인스턴스 멤버처럼 사용합니다.
 * 		주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용
 * 
 * local Class
 * 		외부 클래스의 메소드나 초기화 블럭 안에서 선언합니다.
 * 		선언된 영역 내부에서만 사용 가능합니다.
 * 
 * anonymous Class
 * 		클래스 선언과 객체의 생성을 동시에 하는 이름 없는 클래스.
 * 		일회용 입니다.
 * 
 */

class AAA {

	class BBB {
		
		AAA aaa = new AAA();
		
	}
	
}

public class InnerClass {

	public static void main(String[] args) {
		
	}
	
}
