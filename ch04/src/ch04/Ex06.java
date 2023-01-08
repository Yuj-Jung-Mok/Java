package ch04;

public class Ex06 {

	public static void main(String[] args) {
		
		// 각 행별 합계, 최대, 최소 : 전체 합계, 전체 최대, 전체 최소
		int[][] score = {{67, 78, 98}, {78, 98, 65}, {78, 56, 90}};
		String[] name = {"보검", "로제", "제니"};
		int sum = 0, tot = 0, max = 0, min = 100, tMax = 0, tMin = 100;
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t최대\t최소\t");
		System.out.println("===================================================");
		
		for(int i=0; i<score.length; i++) {
			tot = 0; max = 0; min = 100;
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				tot += score[i][j];

				if(score[i][j] > max) max = score[i][j];
				if(score[i][j] < min) min = score[i][j];
				if(max > tMax) tMax = max;
				if(min < tMin) tMin = min;
				
				System.out.print(score[i][j] + "\t");
			}
			
			System.out.println(tot + "\t" + max + "\t" + min);
		}
		
		System.out.printf("\n총계: %d, 전체 최대 : %d, 전체 최소 : %d", tot, tMax, tMin);
	}
	
}
