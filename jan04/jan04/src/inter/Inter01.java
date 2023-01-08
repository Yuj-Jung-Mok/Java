package inter;

//인터페이스 (p344)
/*
 * 인터페이스 : 다른 언어에서 찾아보기 힘든 고급 기능
 * 
 * 인터페이스란?
 * 추상 클래스입니다. = 추상화
 * 추상 클래스는 추상 메소드를 가지고 있습니다.
 * 				 일반 메소드를 가지고 있습니다.
 * 
 * 인터페이스는 오직 추상 메소드만 가지고 있습니다.
 * 
 * 인터페이스 내 존재하는 메소드는 무조건 추상 메소드
 * 인터페이스 내 존재하는 변수는   무조건 상수
 * 
 * 인터페이스 속 메소드는 public abstract 메소드명으로 선언
 * 				 변수는   static final    변수명으로   선언
 * 
 * 인터페이스는 다중 상속 가능합니다.
 * 
 * class AAA { }
 * 
 * interface AAA {
 * 		static final int NUMBER = 100;
 * 		public abstract void print();
 * }
 * 
 * class Cat implements AAA {
 * 		// AAA의 미구현된 내용을 구현
 * 		@override
 * 		public void print() {
 * 			// 구현
 * 		}
 * }
 * 
 * 특징 : 인터페이스는 객체로 만들 수 있나요? 아니요. 목적이 기능 전달 목적이라 불가능
 * 
 * 주의할 점
 * 클래스에 인터페이스 상속 시 인터페이스 내 모든 추상 메소드를 구현해야 합니다.
 * 
 * 상속과 인터페이스 차이점
 * 
 * 상속 : 키워드 - extends. B라는 클래스를 상속 받아 A에 더 한다.
 * 순수 상속 : 부모로부터 모든 권한/능력 가져오기
 * 
 * 인터페이스 : 키워드 - implements. B라는 인터페이스의 기능을 A에 구현한다.
 * 권한 상속 : 비어있는 것을 가져와서 그 속을 만들기
 * 
 */

interface SayHi {
	public void sayHi();	// 추상 메소드
	public void sayBye();
}

class Start extends Object implements SayHi {
	
	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Inter01 {
	
}
