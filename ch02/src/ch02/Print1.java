package ch02;

public class Print1 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 16);
		// 출력할 수 있는 범위 확보
		System.out.printf("%5d\n", 16);	 // 앞자리를 비우고 뒤에 값을 가져옴
		System.out.printf("%-5d\n", 16); // 뒷자리를 비우고 앞에 값을 가져옴
		System.out.printf("%05d\n", 16); // 빈 칸을 0으로 채우고 뒤에 값을 가져옴
	}

}
