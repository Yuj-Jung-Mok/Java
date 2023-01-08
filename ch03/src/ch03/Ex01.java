package ch03;

public class Ex01 {
	public static void main(String[] args) {
		int sum1 = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum1 += i;
			}
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for(int i=1; i<=10; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if((i+j) == 6) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
