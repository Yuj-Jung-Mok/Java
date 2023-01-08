package ch02;

public class ByteCast1 {
	public static void main(String[] args) {
		// 강제 형변환하면 프로그램에 에러는 없지만 결과가 쓰레기가 될 수 있다.
		byte b1 = (byte)128; // -128 ~ 127
		byte b2 = (byte)256;
		System.out.println(b1);
		System.out.println(b2);
	}
}
