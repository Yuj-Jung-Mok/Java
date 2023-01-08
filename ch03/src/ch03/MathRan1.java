package ch03;

public class MathRan1 {
	public static void main(String[] args) {
		// Math.random();	0 ~ 1 사이의 랜덤한 실수 출력, 0 이상이고 1 미만인 실수
		// Math.random() * 100 : 0.4444 * 100 = 44.4444, 0.9999 * 100 = 99.9999, 0.0000001 * 100 = 0.00001
		// (int) (Math.random() * 100) : 44, 99, 0.		0 ~ 99
		// (int) (Math.random() * 100) + 1 : 44, 99, 0.		1 ~ 100
		int number = (int) (Math.random() * 100) + 1;
		System.out.println(number);
	}
}
