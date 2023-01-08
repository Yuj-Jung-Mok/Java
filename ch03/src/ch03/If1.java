package ch03;

public class If1 {
	// arguments : 인수
	public static void main(String[] args) {
		// Integer.parseInt() :  문자열 데이터를 정수로 변경
		int score = Integer.parseInt(args[0]);
		String grade = "";
		// 90 >= A
		// 80 B
		// 70 C
		// 60 D
		// 이하 F
		if(score >= 90) {
			System.out.println("점수는 " + score + "이고, 학점은 A 입니다.");
		} else if(score >= 80) {
			System.out.println("점수는 " + score + "이고, 학점은 B 입니다.");
		} else if(score >= 70) {
			System.out.println("점수는 " + score + "이고, 학점은 C 입니다.");
		} else if(score >= 60) {
			System.out.println("점수는 " + score + "이고, 학점은 D 입니다.");
		} else {
			System.out.println("점수는 " + score + "이고, 학점은 F 입니다.");
		}
		
		
		
	}
}
