package ch04;

public class Arr1 {

	public static void main(String[] args) {
//		int kim = 70, park = 88, choi = 92;
//		int[] score = { 70, 88, 92 };	// [] 배열
		int[] score; 			// 배열 선언. int score[];
		score = new int[5];		// 배열 생성. score (메모리에 공간 확보해논 곳)에 정수형 배열 공간 5개를 생성해라
				// 0, 1, 2, 3, 4 (인덱스 : 0부터 시작)
		
		int[] i1 = new int[4]; 		// 배열 선언과 생성을 동시에 함
		int[] i2 = {12, 67, 88};	// 배열 선언과 생성, 값 대입
		
		System.out.print("배열 score : ");
		for(int i=0; i<5; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		
		// 배열명.length : 배열의 갯수
		System.out.print("배열 i1 : ");
		for(int i=0; i<i1.length; i++) {
			System.out.print(i1[i] + " ");
		}
		System.out.println();
		
		// 배열명.length : 배열의 갯수
		System.out.print("배열 i2 : ");
		for(int i=0; i<i2.length; i++) {
			System.out.print(i2[i] + " ");
		}
		System.out.println();
		
		// 확장 for문 : 데이터를 하나씩 옮겨서 실행 더이상 옮길 데이터가 없으면 종료
		System.out.print("확장 for문 : ");
		//    변수 : 배열명
		for(int i : i2) {
			System.out.print(i + " ");
		}
		
	}
	
}
