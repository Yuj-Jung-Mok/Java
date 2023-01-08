package ch02;

public class CompOp1 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 7;
		// 모든 연산자 중 대입 연산자가 마지막에 실행
		boolean b1 = i1 == i2;
		System.out.println(b1);
		
		b1 = i1 != i2;
		System.out.println(b1);
		
		b1 = i1 > i2;
		System.out.println(b1);
		
		b1 = i1 >= i2;
		System.out.println(b1);
		
		b1 = i1 < i2;
		System.out.println(b1);
		
		b1 = i1 <= i2;
		System.out.println(b1);
	}
}
