package ch04;


public class BubbleSort1 {

	public static void main(String[] args) {
		
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		int imsi = 0;
		
		// 선택 정렬
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j <score.length - (i+1); j++) {
				if(score[j] > score[j+1]) {
					imsi = score[j];
					score[j] = score[j+1];
					score[j+1] = imsi;
				}
			}
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
	}
	
}
