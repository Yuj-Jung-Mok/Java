package ch04;

public class TwoArr1 {

	public static void main(String[] args) {
		
		int[][] test;
		test = new int[2][3];
		
		test[0][0] = 100;	// 0행
		test[0][1] = 200;
		test[0][2] = 300;
		// 1행 초기화 끝
		test[1][0] = 500;	// 1행
		test[1][1] = 600;
		test[1][2] = 700;
		// 2행 초기화 끝
		
		for(int i=0; i < test.length; i++) {
			for(int j=0; j < test[i].length; j++) {	// test[i].length : i번째 행의 열의 갯수
				System.out.print(test[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		
		for(int[] te : test) {
			for(int t : te) {
				System.out.print(t + "\t");
			}
			System.out.println();
		}
	}
	
}
