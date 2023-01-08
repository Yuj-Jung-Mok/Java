package staticTest;

// static 키워드
/*
 * static은 정적이라는 의미가 있습니다.
 * 정적은 클래스가 로드되는 시점, 동적은 로드된 클래스가 실행된 이후.
 * 
 * 이 중 객체는 동적 데이터
 * 
 * 정적 멤버 : 인스턴스를 만들지 않고 사용할 수 있는 멤버, 하나만 생성되고 모든 객체가 공유함.
 * 클래스명.멤버명 호출
 * 클래스에 의지.
 *
 * 
 * 인스턴스 멤버 : 인스턴스 생성 시 별도의 변수 기억 공간을 가지고 객체마다 각각 다른 값을 가짐.
 * 인스턴스명.멤버명 호출
 * */

public class Static01 {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {

		add(10, 30);		// 같은 클래스 내부 시 클래스명 제거 가능
		Calc.add(10, 20);	// 클래스명.메소드명();
		
		
		// 객체 생성 후 사용 (static 없을 경우)
		Calc calc = new Calc();
		calc.div(20, 10);
		
		Calc.num = 10;
		
	}

}

class Calc {
	public int number;
	static int num;
	
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
		num = num1 + num2;		// static : static 붙은 변수 호출
		//number = num1 + num2; // static : non-static 호출 불가
		//div(10, 200);
	}
	
	public void div(int num1, int num2) {
		System.out.println(num1 / num2);
		num = num1 + num2;		// non-static : static 붙은 변수 호출
		number = num1 + num2;	// non-static : non-static 호출 가능
		add(10, 50);			 
	}
	
}

/*
 * 주의사항
 * 객체가 생성되지 않은 상태에서 호출되는 메소드.
 * 객체 안에서만 존재하는 인스턴스 변수들은 사용할 수 없습니다.
 * 정적 변수와 지역 변수만 사용 가능합니다.
 * 
 * 
 * 정적 메소드에서 인스턴스 메소드를 호출하면 에러가 납니다.
 * 인스턴스 메소드도 객체가 생성 되어야만 사용할 수 있기 때문입니다.
 * 
 * 정적 메소드에서 정적 메소드를 호출하는 것은 가능합니다.
 * 정적 메소드는 this 키워드를 사용할 수 없습니다, this 키워드는 인스턴스가 사용 가능합니다.
 * 
 * 정적 메소드는 정적 메소드를 호출할 수 있습니다.
 * 
 * final 붙은 상수는 수정 불가, 객체를 만들지 않고 사용하면 좋습니다. 그래서 static을 붙입니다.
 * */