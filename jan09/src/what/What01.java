package what;

import java.io.*;

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
//		if(right == 0) {
//			throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다.");
//		}
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		if(right == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		
		try {
			System.out.print("계산 결과는 ");
			System.out.print(this.left / this.right);
			System.out.print(" 입니다.");
		} catch (Exception e) {
			System.out.println("\n\n e.getMessage() : " + e.getMessage());	// 간단한 형태의 예외 정보
			System.out.println("\n\n e.toString() : " + e.toString());		// 어떤 형태인지 예외 정보
			System.out.print("\n\n e.printStackTrace() : ");				// 현재 에러 상황 예외 정보
			e.printStackTrace();
		}
		
		System.out.println("Divide End");
	}
}

class A {
	private int[] arr = new int[3];
	
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	public void z(int first, int second) {
		
		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException e");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");
		} catch (Exception e) {
			System.out.println("Exception e");
		} finally {
			System.out.println("finally");
		}
	}
}

class B {
	void run() throws FileNotFoundException, IOException {
		BufferedReader br = null;
		String input = null;
		
		br = new BufferedReader(new FileReader("/Users/yjm/java/temp.txt"));
		
			input = br.readLine();
		
		System.out.println(input);
	}
}

class C {
	void run() throws FileNotFoundException, IOException {
		B b = new B();
		b.run();
	}
}

public class What01 {

	public static void main(String[] args) {
		
		// exam1
		Calculator cal = new Calculator();
		cal.setOprands(10, 0);
		
		try {
			cal.divide();	
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("구분선--------------");
		
		// exam2
		A a = new A();
		a.z(10, 1);
		a.z(1, 0);
		a.z(2, 1);
		
		System.out.println("구분선--------------");
		
		// exam3
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
