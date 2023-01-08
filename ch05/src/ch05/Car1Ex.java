package ch05;

public class Car1Ex {
	
	public static void main(String[] args) {
		
		// 선언 : 클래스명 객체명(참조변수명, reference 변수명) = 생성();
		Car1 myCar = new Car1();	// 선언과 생성

		// 멤버변수를 사용 시 객체명.멤버변수명;
		myCar.color = "빨강";
		myCar.displacement = 2000;
		myCar.name = "소나타";
		
		// 메소드를 사용 시 객체명.메소드명();
		myCar.speedUp();
		myCar.stop();
		myCar.prn();
		
		Car1 yourCar = new Car1();
		
		yourCar.color = "노랑";
		yourCar.name = "말두타";
		yourCar.speedUp();
		yourCar.stop();
		yourCar.prn();
		
		System.out.println("이름 : " + myCar.name);
		
	}
	
}
