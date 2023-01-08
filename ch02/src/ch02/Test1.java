package ch02;

public class Test1 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		byte b3 = (byte)(b1 + b2);	// int 10, int 20으로 넘어옴
		System.out.println("b3 : " + b3);
	}
}
