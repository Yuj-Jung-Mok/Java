package ch03;

// 모든 switch문은 if문으로 변경 가능
// if문은 switch로 변경 안될수도 있다

public class Sw5 {
	public static void main(String[] args) {

		int score = Integer.parseInt(args[0]);
		String grade = "";
		
		switch (score / 10) {
			// 90 ~ 100 A
			case 10: case 9:
				grade = "A";
				break;
			
			// 80 B
			case 8:
				grade = "B";
				break;
			// 70 C
			case 7:
				grade = "C";
				break;
				
			// 60 D
			case 6:
				grade = "D";
				break;
				
			// 미만 F
			case 5: case 4: case 3: case 2: case 1: case 0:
				grade = "F";
				break;
				
			default:
				System.out.println("올바른 점수를 입력해주세요.");
				break;
		}
		
		System.out.printf("점수는 %d 입니다. 학점은 %s 입니다.", score, grade);
	}
}
