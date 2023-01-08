package ch02;

public class Test3 {
	public static void main(String[] args) {
		long l1 = 10000000 * 10000000;	// 계산식에서는 int로 인식
		long l2 = 10000000L * 10000000;	// 한 쪽을 롱타입 주면 계산 시 자동으로 롱으로 인식함
		
		System.out.println("l1 : " + l1);
		System.out.println("l2 : " + l2);
		System.out.println(10000000 * 10000000 / 10000000);
		System.out.println(10000000 / 10000000 * 10000000);
	}
}
