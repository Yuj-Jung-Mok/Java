package ch03;

public class If4 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		if(num < 10) {
			System.out.println("10 미만의 값 입니다.");
		} else if(num >= 10 && num < 100) {
			System.out.println("10 이상 100 미만의 값 입니다.");
		} else if(num >= 100 && num < 1000) {
			System.out.println("100 이상 1000 미만의 값 입니다.");
		} else {
			System.out.println("1000 이상의 값 입니다.");
		}
		
	}
}
