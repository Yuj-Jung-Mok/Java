package ch03;

public class If2 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		 
		if(score >= 90) {
			grade = "A";
			if(score >= 96) {
				grade += "+";
			} else {
				grade += "0";
			}
		} else if(score >= 80) {
			grade = "B";
			if(score >= 86) {
				grade += "+";
			} else {
				grade += "0";
			}
		} else if(score >= 70) {
			grade = "C";
			if(score >= 76) {
				grade += "+";
			} else {
				grade += "0";
			}
		} else if(score >= 60) {
			grade = "D";
			if(score >= 66) {
				grade += "+";
			} else {
				grade += "0";
			}
		} else {
			grade = "F";
		}
		
		System.out.println("점수는 " + score + "이고, 학점은 " + grade + " 입니다.");
	}
}
