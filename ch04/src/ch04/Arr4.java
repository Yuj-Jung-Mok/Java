package ch04;

public class Arr4 {
	
	public static void main(String[] args) {
		
		int[] i1 = {56, 78, 88, 92, 66};		// 선언 생성 대입을 동시에 처리
		int[] i2;
		i2 = new int[] {56, 78, 88, 92, 66};	// 정상
		//i2 = {56, 78, 88, 92, 66}; 			// 에러 (객체를 생성을 하고 만들어 줘야함)
		int[] i3 = new int[] {56, 78, 88, 92, 66};
		
		// i1 for
		for(int i=0; i<i1.length; i++) {
			if(i==0) {
				System.out.print("일반 for : ");
			}
			System.out.print(i1[i] + " ");
		}
		
		System.out.println();
		
		// i2 확장 for
		int cnt = 0;
		for(int i : i2) {
			if(cnt == 0) {
				System.out.print("확장 for : ");
			}
			System.out.print(i + " ");
			cnt++;
		}
	}
	
}