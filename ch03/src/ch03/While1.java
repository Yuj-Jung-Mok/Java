package ch03;

public class While1 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		// while문은 조건을 변경하는 식이 없으면 무한정 작업 진행, 메모리 부족으로 종료됨
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~100까지 합 : " + sum);
	}
}
