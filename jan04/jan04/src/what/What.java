package what;

// 혹시 이거 될까요?
// 인스턴스를 하나만 만들기
// 컨트롤 + 쉬프트 + L : 단축키 전체 리스트

public class What {

	public static void main(String[] args) {
		// static 안 붙은 메소드는 객체 생성 후에 실행해야 합니다.
		// static 붙은 메소드는 객체 없이 클래스명.메소드명으로 실행.
		
		// 생성자 선언을 private로 막아놓았기 때문에 인스턴스 생성이 불가합니다.
		// 그러면 생성하기 위해선 static으로 생성해서 클래스에 직접 접근해서 인스턴스 생성 메소드로 객체를 생성한다.
		Human h1 = Human.getInstance(); 
		Human h2 = Human.getInstance();
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1 == h2);
	}
	
}

class Human {	// (p243)
	
	// 클래스로 부르기 위해 ( 인스턴스 생성 위함인데 인스턴스로 부르는 건 말이 안되서 )
	
	// 변수 : 인스턴스를 하나만 생성하기 위함 (객체 생성은 휴먼 클래스 내부에서 밖에 못함)
	private static Human human = new Human();
	
	// 생성자 : Human 클래스 외부에서 생성하지 못하게 막아놓기 위함  (객체 생성은 휴먼 클래스 내부에서 밖에 못함)
	private Human() {}
	
	// 메소드 : 클래스로 호출하기 위함 (위에 선언해논 변수를 반환해서 모든 인스턴스 생성 시 동일한 주소 참조)
	public static Human getInstance() {
		return human;
	}

}