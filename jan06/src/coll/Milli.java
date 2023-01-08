package coll;

public class Milli {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 300; i++) {
			System.out.print(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\n" + (endTime - startTime));
	}
	
}
