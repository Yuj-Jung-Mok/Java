package jan02;

	// 제어문 
	// 반복문 for, foreach, while, do~while
	// 조건문 if, switch

public class IfFor {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}
		System.out.println();

//		
//		while(1 == 2) {
//			System.out.println("*");
//		}
//		
//		do {
//			System.out.println("*");
//		} while (1 == 2);
//		
		
		int[] arr = new int[10];
		for(int i : arr) {	// 향상 for문
			System.out.print(i + " ");
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int num = 10;
		
//		if(10 < num && 15 > num) {
//			if(num == 0) {
//				if() {
//					
//				}
//			}
//		} else if() {
//			
//		} else {
//			
//		}
		
		// 스위치
		num = 5;
		switch (num) {
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
			break;
			
		case 4:
			System.out.println("4");
			break;
			
		case 5:
			System.out.println("5");
			break;

		default:
			break;
		}
		
	}
	
}
