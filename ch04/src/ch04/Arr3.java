package ch04;

public class Arr3 {

	public static void main(String[] args) {
		// 정수 배열 5개 선언 1 ~ 10 사이의 정수를 랜덤하게 대입
		int[] i1 = new int[5];
		// 일반 반복문
		System.out.print(" 1 : ");
		for(int i=0; i<i1.length; i++) {
			i1[i] = (int)(Math.random() * 10) + 1;
			System.out.print("arr[" + i + "] : " + i1[i] + ". ");
		}
		System.out.println();
		
		// 확장 반복문
		System.out.print(" 2 : ");
		for(int i : i1) {
			i = (int)(Math.random() * 10) + 1;
			System.out.print(i + " ");
			
		}
		System.out.println();
	}
	
}
