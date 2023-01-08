package ch03;

public class While3 {

	public static void main(String[] args) {
		System.out.println("구구단");
		System.out.println("===========");
		
		int i = 1, j = 2;
		while(j <= 9) {
			System.out.println(j);
			while(i <= 9) {	// 중첩 while문
					System.out.printf("%d * %d = %d\n", j, i, j * i);
				i++;
			}
			j++;
			i = 1;	// 중첩 while문 다 돌고 초기화
		}
		
	}
}