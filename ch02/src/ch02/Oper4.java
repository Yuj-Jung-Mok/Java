package ch02;

public class Oper4 {
	public static void main(String[] args) {
		// 데이터형이 다른 연산의 결과는 범위가 큰 데이터형으로 출력한다
		// 데이터형이 같은 연산의 결과는 같은 데이터형으로 출력한다
		
		System.out.println(10 % 3);	// 몫은 3 나머지는 1
		System.out.println(17 % 3);	// 몫은 5 나머지는 2
		System.out.println(25 % 6);	// 몫은 4 나머지는 1
		
		System.out.println(10 / 3);	// 몫은 3 나머지는 1
		System.out.println(17 / 3);	// 몫은 5 나머지는 2
		System.out.println(25 / 6);	// 몫은 4 나머지는 1

	}
}
