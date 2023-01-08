package test;

import java.util.Arrays;

public class Calc {

	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		int result = calc.add(10, 30);
		System.out.println(result);
		
		String result1 = calc.print("홍길동");
		System.out.println(result1);
		
		int[] Array = calc.makeArray(4, 100);
		System.out.println(Arrays.toString(Array));
	}
	
	// 문제 : 파라미터 int 타입 2개 받습니다.
	// 앞 숫자는 시작 숫자, 뒤 숫자는 끝 숫자 입니다.
	// for문을 돌려 값을 배열에 저장하세요.
	// makeArray(4, 8) --> [4 ... 8]
	
	int[] makeArray(int n1, int n2) {
		int[] numArray = new int[(n2 - n1) + 1];
		for(int i=n1; i <= n2; i++) {
			numArray[i-n1] = i;
		}
		return numArray;
	}
	
	String print(String name) {
		return "입력하신 이름은 " + name + "입니다.";
	}

}
