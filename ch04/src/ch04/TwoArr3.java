package ch04;

public class TwoArr3 {

	public static void main(String[] args) {
		
		int[][] a = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		int sum = 0;
		
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
				sum += a[i][j];
			}
			System.out.println(sum);
			sum = 0;	// 초기화 해주지 않으면 이전 값과 누적됨
		}
		
	}
	
}
