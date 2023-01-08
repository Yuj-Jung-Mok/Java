package ch02;

public class Oper2 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 5;
		// ++ / -- 부호가 앞에 있으면 1을 증감한 후에 연산
		//				뒤에 있으면 연산 후에 1 증가
		int result = 2 * ++i1 + (3 - i2--) * 2;
		// (2 * 6) + ((3 - 5) * 2) = 8 
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println(result);
	}
}
