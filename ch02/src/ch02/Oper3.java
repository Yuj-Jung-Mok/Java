package ch02;

public class Oper3 {
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		int result1 = 2 * --x + 3 * ++y;
		// (2 * 4) + (3 * 6) = 8 + 18
		
		int result2 = 2 * x-- + 3 * y++;
		// (2 * 4) + (3 * 6) = 8 + 18
		
		System.out.println("x : " + x); // 3
		System.out.println("y : " + y); // 7
		
		//System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}
}
