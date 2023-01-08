package ch04;

public class Arr6 {
	
	public static void main(String[] args) {
		
		int[] score = {77, 88, 66, 99, 56, 87, 92};
		int sum = 0;
		float avg = 0.0f;
		
		// 총점과 평균을 출력
		for(int s : score) {
			sum += s;
		}
		avg = (float)sum / score.length;
		
		System.out.println("합계 : " + sum);
		// %.1f : 소수점 1자리
		System.out.printf("평균 : %.1f", avg);
		
	}
	
}
