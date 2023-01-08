package ch02;

public class Cast3 {
	public static void main(String[] args) {
		double d1 = 11.3;
		int i1 = (int)d1;
		float f1 = (float)d1;
		double d2 = f1;
		
		System.out.println("d1 = " + d1);
		System.out.println("i1 = " + i1);
		System.out.println("f1 = " + f1);
		System.out.println("d2 = " + d2);
	}
}
