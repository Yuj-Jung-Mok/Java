package ch02;

public class LogicalOp1 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 7;
		boolean b1 = i1 > i2, b2 = i1 < i2;
		System.out.println("b1 && b2 = " + (b1 && b2));
		System.out.println("b1 || b2 = " + (b1 || b2));
		// ! : 반대, t => f, f => t
		System.out.println("!b1 = " + (!b1));
		System.out.println("!b2 = " + (!b2));
	}
}
