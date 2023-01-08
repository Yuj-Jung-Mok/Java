package ch04;

public class TwoArr4 {

	public static void main(String[] args) {
	
		String[] major = {"국어", "영어", "수학", "총점", "평균"};
		int[][] score = { {77, 88, 99}, {76, 68, 92}, {88, 77, 55}, {23, 99, 77} };
		
		for(int i = 0; i < major.length; i++) {
			System.out.print(major[i] + "\t");
		}
		System.out.println("\n===================================");
		
		for(int i=0; i<score.length-1; i++) {
			int sum = 0;
			float avg = 0;
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[j][i];
				System.out.print(score[j][i] + "\t" );
			}
			avg = (float) sum / (score[0].length);
			System.out.println(sum + "\t" + avg);
			System.out.println();
		}
	}
	
}
