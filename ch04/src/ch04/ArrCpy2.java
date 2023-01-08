package ch04;

import java.util.Arrays;

public class ArrCpy2 {

	public static void main(String[] args) {
		
		int[] arr1 = {34, 56, 67, 88, 92};
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		int[] arr4 = new int[10];
		int[] arr5 = new int[10];
		
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.arraycopy(arr1, 0, arr3, 3, arr1.length);	// arr3의 인덱스 3번째부터 5개를 채운다.
		System.arraycopy(arr1, 2, arr4, 2, 3);				// arr1의 인덱스 2번째 값부터 시작해서 arr4의 인덱스 2번째부터 값을 3개 채운다. 
		System.arraycopy(arr1, 1, arr5, 3, 4);

		arr1[2] = 200;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
	}
	
}
