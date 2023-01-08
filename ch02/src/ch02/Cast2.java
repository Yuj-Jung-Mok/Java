package ch02;

public class Cast2 {

	public static void main(String[] args) {
		long l1 = 12;
		int num = (int)l1;	// 명시적 형변환
		long l2 = num;
		double d1 = l1;		// 묵시적 형변환
		long l3 = (long)d1;
		
		System.out.println("l1 = " + l1);
		System.out.println("num = " + num);
		System.out.println("l2 = " + l2);
		System.out.println("d1 = " + d1);
		System.out.println("l3 = " + l3);
	}

}
