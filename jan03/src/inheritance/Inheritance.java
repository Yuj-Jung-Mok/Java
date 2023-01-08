package inheritance;

// 상속 : 상위 클래스의 내용을 하위 클래스가 자신의 것처럼 사용하는 것

// 상위 클래스 / 부모 클래스,  			  / 슈퍼 클래스
// 하위 클래스 / 자식 클래스, 파생 클래스 / 서브 클래스

// 연결 : class 자식 클래스 extends 부모 클래스 {}

class Animal {
	int age;
	String name;
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("동물이 탄생했습니다.");
	}
}

class Human extends Animal {
	String ssn;	// 주민등록번호
	
	public Human(int age, String name, String ssn) {
		super(age, name);	// 부모 생성자 호출
		this.ssn = ssn;
	}
	
	// 주민번호 앞자리만
	public void myInfo() {
		System.out.println("내 주민등록번호는 " + ssn + "입니다.");
	}
	
}

class NewHuman extends Human {
	public NewHuman(int age, String name, String ssn) {
		super(age, name, ssn);
	}
	
	@Override	// 어노테이션
	public void myInfo() {
		super.myInfo();
		//System.out.println("내 주민등록번호는 " + ssn.substring(0, 6) + " 입니다.");
	}
}

class Dog extends Animal {
	public Dog(int age, String name) {
		super(age, name);
	}

	public void sound() {
		System.out.println("Bow Wow");
	}
}

class HoundDog extends Dog {

	public HoundDog(int age, String name) {
		super(age, name);
	}	
}

public class Inheritance {

	public static void main(String[] args) {
		
		Human human = new Human(0, "3PO", "840410-1485221");
		Dog dog = new Dog(0, "POP");
		HoundDog hdog = new HoundDog(0, "뽀삐");
		NewHuman nHum = new NewHuman(12, "A", "980803-1234567");
		
		System.out.println(human.age + ", " + human.name);
		System.out.println(dog.age + ", " + dog.name);
		System.out.println(hdog.age + ", " + hdog.name);
		human.myInfo();
		nHum.myInfo();
		
	}
	
}
