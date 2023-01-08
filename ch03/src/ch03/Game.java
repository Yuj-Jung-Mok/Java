package ch03;

// import : 데이터 읽는 Scanner 도구를 가져와서 사용하는 것
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1 ~ 100 사이의 랜덤한 정수
		int number = (int) (Math.random() * 100) + 1;
		
		int num = 0, cnt = 0;
		
		do {
			System.out.println("숫자를 맞춰보세요.");
			
			num = sc.nextInt();
			cnt++;
			
			if(num > number) {
				System.out.println("작은 수를 입력하세요.");
			} else if (num < number) {
				System.out.println("큰 수를 입력하세요.");
			}
		} while(num != number);
		
		System.out.printf("숫자 %d를 %d번에 맞췄습니다.", number, cnt);
		sc.close();
	}
}
