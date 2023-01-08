package ch04;

public class Arr5 {
	
	public static void main(String[] args) {
		String[] fruits = {"산딸기", "판딸기", "죽은딸기", "알카리딸기", "뱀딸기"};
		
		for(int i=0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println("================");
		
		// 확장
		for(String s : fruits) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("================");
		
		// 일반
		for(int i=fruits.length - 1; i>=0; i--) {
			System.out.print(fruits[i] + " ");
		}
	}
	
}
