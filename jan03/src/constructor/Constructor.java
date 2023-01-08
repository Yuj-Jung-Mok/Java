package constructor;

// 생성자
/*
 * 1. 클래스의 객체 생성
 * 2. 멤버 필드 초기화
 * 3. 필요에 따라서 초기화 메소드를 실행
 * 다시 이야기하면 생성자 없이 인스턴스 발생 시킬 수 없습니다.
 * 
 * 생성자의 형식
 * 생정자는 메소드와 유사하게 생겼습니다.
 * 
 * 하지만 메소드와 기능적인 부분에서 차이가 있습니다.
 * 
 * 1. 생성자의 이름은 반드시 클래스 이름과 같아야 합니다.
 * 만약 다를 경우 일반 메소드로 인식합니다 (중요)
 * 
 * 2. 메소드가 아니기 때문에 리턴 타입이 없습니다.
 * 
 * 기본 생성자 (Default Constructor)
 * 자바에서는 모든 클래스마다 컴파일 시 기본 생성자를 제공하니다.
 * 단, 클래스에 생성자가 하나라도 있다면 제공하지 않습니다.
 * 
 * 만약 하나 이상의 생성자를 정의한다면 기본 생성자는 없습니다.
 * (생성자가 여러개 있을 수 있습니다)
 * 
 * 기본 생성자는 파라미터가 없는 생성자를 말하고
 * 이를 이용해서 생성된 객체를 기본 객체라고 합니다.
 * 또한 모든 필드값은 기본값으로 초기화 됩니다.
 */

public class Constructor {

	public Constructor() {	// 클래스명과 동일하고 리턴이 없습니다.
		System.out.println("생성자를 호출 했습니다.");
	}
	
	public void con() {
		
	}
	
	public static void main(String[] args) {

		//Constructor constructor = new Constructor();	// 기본 생성자
		Human h = new Human(20, "R2D2");
		h.sleep();
		
		Human h2 = new Human("3PO");
		
	}
	
}

class Human {
	int age;
	String name;

	public Human(String name) {	// 생성자
		this.name = name;
	}
	
	public Human(int age, String name) {
		this(name);	// 생성자 호출 : 첫줄에 등장해야 합니다.
		this.age = age;
		//this.name = name;
	}
	
	public Human(int age, String name, String ssn) {
		this(age, name);
	}
	
	public void sleep() {
		System.out.println( name + "이(가) 잡니다.");
	}
	
	public void sleep(int time) {
	}
	
	public void sleep(int time, String spot) {
	}
	// 오버로드 (p208)
	/*
	 * 같은 이름의 메소드 또는 생성자를 정의할 때 같은지를 판별하는 요소로
	 * 적용되는 기준을 메소드 혹은 생성자 시그니쳐라고 합니다.
	 * 
	 * 이 시그니쳐는 파라미터의 수, 순서, 타입 모두 같다면
	 * 같은 메소드/생성자로 인지합니다.
	 * 하나라도 다르다면 다른 메소드/생성자로 인지합니다.
	 * 
	 * 호출할 때 호출하는 파라미터를 보고 해당 메소드/생성자를 호출합니다.
	 * 이렇게 같은 이름이나 파라미터를 다르게 사용하는 기술을
	 * 메소드 오버라이드라고 합니다.
	 * (나중에 비슷한 이름으로 오버라이드도 나옵니다. 조심하세요.)
	 * 
	 * */
}