package jan02;

import java.util.Scanner;

public class OOP01 {
	public static void main(String[] args) {
		
		// 인스턴스화 하기
		// 데이터 타입 변수명 = 값;
		int num = 10;	// 기본 타입
		
		Human human = new Human();	// 참조 타입
		Human human2 = new Human();
		Human human3 = human2;
		
		String str = new String("Hi");
		
		// 호출
		// 객체명 변수명.메소드명();
		human.sleep();
		human2.sleep();
		
		human.eat("라면");
		human2.eat("밥");
		
		human.age = 150;
		human.name = "R2D2";
		
		human2.age = 10;
		human2.name = "3PO";

		human3.age = 33;
		human3.name = "냐옹이";
		
		System.out.println(human.age + ", " + human.name);	// 객체가 생성될 때 기본값을 가져감.
		System.out.println(human2.age + ", " + human2.name);
		System.out.println(human3.age + ", " + human3.name);
		
		Animal cat = new Animal();
		Animal dog = new Animal();
		
		System.out.println(cat == dog);
		System.out.println(human2 == human3);
		
		cat.add(10, 30);
		
		cat.chChange();
		
		char ch1 = 'C'; char ch2 = 'A'; char ch3 = 'T';
		int num2 = 5;
		ch1 += num2;
		ch2 += num2;
		ch3 += num2;
		
		System.out.println(ch1 +""+ ch2 +""+ ch3);
		
	}
}

class Human {
	int age;	// 인스턴스 변수, 멤버 필드 : 정보
	String name;
	
	public void sleep() {	// 메소드 : 기능
		System.out.println("Zzz...");
	}
	
	public void eat(String thing) {
		System.out.println(thing + " 먹습니다.");
	}
}

class Animal {
	int age;
	String name, ssn, home;
	
	void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void sleep() {
		System.out.println(name + "이 잠을 잡니다.");
	}
	
	void chChange() {
		System.out.print("문자를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		char cAsc = sc.next().charAt(0);
		System.out.println( cAsc + "는 아스키 코드로 " + (int)cAsc + " 입니다.");
		
		sc.close();
	}
}