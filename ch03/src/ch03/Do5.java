package ch03;

public class Do5 {
	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		
		do {
			System.out.println(i + "단!");
			do {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}while(j <= 9);
			i++;
			j = 1;
		} while(i <= 9);
	}
}