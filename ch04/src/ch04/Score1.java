package ch04;

public class Score1 {

	public static void main(String[] args) {
		
		String title = "성적표";
		String[] subject = {"이름", "국어", "영어", "수학", "총점", "평균"};
		String[] name = {"보검", "로제", "제니", "은우"};
		int[][] score = {{90, 80, 70}, {76, 86, 90}, {90, 78, 90}, {80, 80, 80}};
		int[] tot = new int[score[0].length];	// 3과목 이므로 tot의 갯수는 3개, 인덱스는 0, 1, 2 
		int len = 43, sum = 0, avg = 0;
		
		System.out.println(title);	// 하드 코딩 지양

		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < len; i++) {
			System.out.print("=");
		}
		System.out.println();
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];		// 이름별 합계
				tot[j] += score[i][j];	// 과목별 합계
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(sum + "\t" + (sum/score[i].length) + "\t");
			sum = 0;
		}
		
		for(int i = 0; i < len; i++) {
			System.out.print("=");
		}
		
		System.out.print("\n합계\t");
		for(int j = 0; j < tot.length; j++) {
				System.out.print(tot[j] + "\t");
				sum += tot[j];
		}
		System.out.println(sum + "\t" + ((sum / tot.length) / name.length));
		
	}
	
}
