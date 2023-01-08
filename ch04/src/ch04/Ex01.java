package ch04;

public class Ex01 {
	
	public static void main(String[] args) {

		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum = 0, avg = 0;
		// max를 초기화할 때 큰 값으로 하면 비교가 곤란한 경우 발생
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.printf("합계 : %d, 평균 : %d\n", sum, avg);
		System.out.printf("최대 : %d, 최소 : %d", max, min);
		
		System.out.println();
		System.out.println("=======================");
		
		
		sum = 0; avg = 0; max = score[0]; min = score[0]; // 다시 초기화
		
		for(int sc : score) {
			if(max < sc) {
				max = sc;
			} else if (min > sc) {
				min = sc;
			}
			sum += sc;
		}
		avg = sum / score.length;
		System.out.printf("합계 : %d, 평균 : %d\n", sum, avg);
		System.out.printf("최대 : %d, 최소 : %d", max, min);
	}
	
}
