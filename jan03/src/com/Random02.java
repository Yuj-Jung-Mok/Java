package com;

import java.util.Random;

public class Random02 {
	public static void main(String[] args) {
		
		Random r = new Random();
		for(int i = 1; i <= 10; i++) {
			int user = r.nextInt(100) + 1;	// 0 ~ 9
			System.out.println(user);
		}
		
	}
}
