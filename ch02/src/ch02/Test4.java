package ch02;

public class Test4 {

	public static void main(String[] args) {
		char c1 = 'a'; // 97
		// 문자는 연산자를 만나면 문자값이 연산을 할 수 있는 ascii code의 int형으로 변경
		// 정수를 char로 변경하기 위해서는 명시적 형변환이 필요
		char c2 = (char)(c1 + 1); // int 98
		System.out.println(c2);
		// 현재 ascii의 1 증감한 ascii 값
		char c3 = ++c2;
		System.out.println(c3);
		int i1 = 'C' - 'A';
		int i2 = '2' - '0';
		
		System.out.println(i1);	// 67 - 65 = 2
		System.out.println(i2); // 50 - 48 = 2
	}

}
