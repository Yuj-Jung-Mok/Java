package ch03;

public class If5 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String msg = "";
		
		if(num == 12 || num == 1 || num == 2) {
			msg = "겨울";
		} else if(num == 3 || num == 4 || num == 5) {
			msg = "봄";
		} else if(num == 6 || num == 7 || num == 8) {
			msg = "여름";
		} else if(num == 9 || num == 10 || num == 11) {
			msg = "가을";
		} else {
			msg = "찾을 수 없습니다.";
		}
		
		System.out.println(msg);
	}
}
