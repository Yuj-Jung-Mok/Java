package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1 ~ 45 중 랜덤한 숫자 6장 맞추기
		int[] lotto = new int[6];
		int imsi = 0;
		
		System.out.print("몇 개의 데이터를 고정 시킬까요 : ");
		int num = sc.nextInt();
		
		for(int i=0; i < num; i++) {
			System.out.print("원하는 번호를 입력하세요 : ");
			lotto[i] = sc.nextInt();
			for(int j=i-1; j >= 0; j--) {	// 현재값과 바로 앞에 값 비교 ~ 0 까지
				if(lotto[j] == lotto[i]) {
					i--;	// i번째 추가한 로또 취소
					break;	// 취소
				}
			}
		}
		
		//
		
		for(int i=num; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;	// 같은 값이 또 들어갈 수 있음
			for(int j=i-1; j >= 0; j--) {	// 현재값과 바로 앞에 값 비교 ~ 0 까지
				if(lotto[j] == lotto[i]) {
					i--;	// i번째 추가한 로또 취소
					break;	// 취소
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					imsi = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = imsi;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		sc.close();
	}
	
}
