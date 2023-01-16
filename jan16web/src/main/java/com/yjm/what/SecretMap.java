package com.yjm.what;

public class SecretMap {

	public static void main(String[] args) {

		String[] n = new String[5];
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		for (int j = 0; j < n.length; j++) {
			int[] nu1 = new int[5];
			String number1 = Integer.toBinaryString(arr1[j]);
			String number2 = Integer.toBinaryString(arr2[j]);
			for (int i = 0; i < number1.length(); i++) {
				nu1[nu1.length - 1 - i] = Integer
						.parseInt(number1.substring(number1.length() - (i + 1), number1.length() - i));
				System.out.println(i);
			}
			for (int i = 0; i < number2.length(); i++) {
				nu1[nu1.length - 1 - i] = nu1[nu1.length - 1 - i]
						+ Integer.parseInt(number2.substring(number2.length() - (i + 1), number2.length() - i));
			}
			n[j] = "";
			for (int i = 0; i < nu1.length; i++) {
				if (nu1[i] >= 1) {
					n[j] = n[j] + "#";
				} else {
					n[j] = n[j] + "&";
				}
			}
		}
		for (String i : n) {
			System.out.println(i);
		}

	}

}