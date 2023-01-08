package ch03;

public class For2 {
	public static void main(String[] args) {
		// 1 ~ 100 까지 짝수합, 홀수합, 전체합
		int evenSum = 0, oddSum = 0, totalSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			} else if(i % 2 != 0) {
				oddSum += i;
			}
		}
		totalSum = evenSum + oddSum;
		System.out.printf("짝수합 : %d, 홀수합 : %d, 전체합 : %d", evenSum, oddSum, totalSum);
	}
}
