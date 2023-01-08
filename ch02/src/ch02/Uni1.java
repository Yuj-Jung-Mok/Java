package ch02;

public class Uni1 {

	public static void main(String[] args) {
		// %s 문자열, %d 정수, %c 문자
		System.out.printf("문자 %c의 유니코드는 %d \n", 'A', (int)'A');
		System.out.printf("문자 %c의 유니코드는 %d \n", 'a', (int)'a');
		System.out.printf("문자 %c의 유니코드는 %d \n", '0', (int)'0');
		System.out.printf("문자 %c의 유니코드는 %d \n", 'A' + 1, (int)('A' + 1) );
	}

}
