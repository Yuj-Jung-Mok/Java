package ch03;

public class For1 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		
		int i = 1;
		for(;;) {
			i++;
			if(i > 10) break;
		}
		
	}
}
