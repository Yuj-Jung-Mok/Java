package ch03;

public class Sw3 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		String msg = "";
		switch (num) {
			case 12: case 1: case 2:
				switch (num) {
					case 12: msg = "초"; break;
					case 1: msg = "찐"; break;
					case 2: msg = "늦"; break;
				}
				msg += "겨울";
				break;
				
			case 3: case 4: case 5:
				switch (num) {
					case 3: msg = "초"; break;
					case 4: msg = "찐"; break;
					case 5: msg = "늦"; break;
				}
				msg += "봄";
				break;
				
			case 6: case 7: case 8:
				switch (num) {
					case 6: msg = "초"; break;
					case 7: msg = "찐"; break;
					case 8: msg = "늦"; break;
				}
				msg += "여름";
				break;
				
			case 9: case 10: case 11:
				switch (num) {
					case 9: msg = "초"; break;
					case 10: msg = "찐"; break;
					case 11: msg = "늦"; break;
				}
				msg += "가을";
				break;
				
			default:
				msg = "올바른 월을 입력 해주세요.";
				break;
		}
		
		System.out.println(msg);
		
	}

}
