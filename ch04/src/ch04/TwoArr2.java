package ch04;

public class TwoArr2 {
	
	public static void main(String[] args) {
	
		int[][] arr = 
			{ 
					{44, 66, 77, 88}, 
					{23,89}, 
					{77, 88, 99, 100} 
			};
		
		// 일반
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		// 확장
		for(int[] ar : arr) {
			for(int a : ar) {
				System.out.print(a + "\t");
			}
			System.out.println();
		}
		
	}
	
}
