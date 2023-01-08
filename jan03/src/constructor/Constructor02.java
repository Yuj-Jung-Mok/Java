package constructor;

public class Constructor02 {
	
	public static void main(String[] args) {
		
	}
	
}

class Calc {
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
	public void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	public void add(int num1, double num2) {
		System.out.println(num1 + num2);
	}
}