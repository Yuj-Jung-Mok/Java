package ch04;

public class Ex03 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{5, 5, 5, 5, 5}, 
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30},
		};
		
		// 행별 합계, 전체 합계
		int totalSum = 0;

		for(int i=0; i<arr.length; i++) {
			int rSum = 0;
			for(int j=0; j<arr[i].length; j++) {
				rSum += arr[i][j];
				totalSum += arr[i][j];
			}
			System.out.println("행별 합계 : " + rSum);
		}
		System.out.println("전체 합계 : " + totalSum);
		
	}
	
}
