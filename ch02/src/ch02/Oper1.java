package ch02;

public class Oper1 {
	public static void main(String[] args) {
		int i1 = 5;
		// ++가 앞에 있으면 1을 증가하고 값을 대입
		int i2 = ++i1;
		
		// ++가 뒤에 있으면 값을 대입 후 1을 증가
		int i3 = i1++;
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
	}
}
