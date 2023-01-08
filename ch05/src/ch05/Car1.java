package ch05;

public class Car1 {
	// (멤버) 변수, 필드
	String color;
	int displacement;
	String name;

	// 메소드
	void speedUp() {
		System.out.println("오빠 달려!");
	}
	
	void stop() {
		System.out.println("멈춰!");
	}
	
	void prn() {
		System.out.println("색깔 : " + color);
		System.out.println("배기량 : " + displacement);
		System.out.println("이름 : " + name);
	}
	
}	