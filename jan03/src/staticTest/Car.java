package staticTest;

public class Car {
	
	private String model;
	private String color;
	private int speed;
	private int id;
	static int number = 0;
	
	// 생성자
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.id = ++number;
	}
	
	public static void main(String[] args) {
		
		Car car1 = new Car("BMW", "White", 200);
		Car car2 = new Car("BMW", "White", 200);
		Car car3 = new Car("BMW", "White", 200);
		Car car4 = new Car("BMW", "White", 200);
		Car car5 = new Car("BMW", "White", 200);
		
		System.out.println(number);
	}
	
}
