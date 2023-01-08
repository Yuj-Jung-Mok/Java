package ch04;

public class Arr2 {
	
	public static void main(String[] args) {
		
		// 기본값 정수는 0, 실수는 0.0
		float[] f1 = new float[3];
		
		for(int i=0; i<f1.length; i++) {
			System.out.print(f1[i] + " ");
		}
		System.out.println();
		
		f1[0] = 3.75f;
		f1[1] = 6.77f;
		f1[2] = 3.14f;
		
		// 일반 for문 출력
		System.out.print("일반 : ");
		for(int i=0; i<f1.length; i++) {
			System.out.print(f1[i] + " ");
		}
		System.out.println();
		
		// 확장 for문 출력
		System.out.print("확장 : ");
		for(float i : f1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 문자형 기본값 : null
		String[] s1 = new String[3];
		
		for(int i=0; i<s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
	}
	
}
