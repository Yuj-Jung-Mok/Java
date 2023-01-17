package com.yjm.what;

class Test {

	public int setRand() { // 랜덤 숫자 발생
		int n = (int) (Math.random() * 16) + 1;

		return n;
	}

	public int[] setArr(int n) { // 배열 생성
		int[] map = new int[n];

		// 데이터 추가하기
		for (int i = 0; i < n; i++) {
			map[i] = (int) (Math.random() * (Math.pow(2, n - 1)));
		}
		return map;
	}

	public String getBinaryCode(int[] map, int n) {
		String code = "";

		// 데이터 최대 길이수만큼 만들고 저장
		for (int i = 0; i < n; i++) {

			int data_len = Integer.toBinaryString(map[i]).length();
			for (int j = 0; j < n - data_len; j++) {
				code += "0";
			}

			code += Integer.toBinaryString(map[i]) + " ";
		}

		return code;
	}
	
	public String[] getTreasureMap(String binaryCode1, String binaryCode2, int n) {
		String[] result = new String[n];
		String[] s1 = binaryCode1.split(" ");
		String[] s2 = binaryCode2.split(" ");
		
		for(int i = 0; i < n; i++) {
			String data = "";
			for(int j = 0; j < s1[i].length(); j++) {
				int data1 = Integer.parseInt(s1[i].charAt(j) + "");
				int data2 = Integer.parseInt(s2[i].charAt(j) + "");
				
				if(data1 == 1 || data2 == 1) {
					data += "#";
				} else {
					data += "&";
				}
				result[i] = data;
			}
		}
		
		return result;
	}
	
}

public class What01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		int n = t1.setRand();
		
		int[] map1 = t1.setArr(n);
		int[] map2 = t1.setArr(n);
		
		String bCode1 = t1.getBinaryCode(map1, n);
		String bCode2 = t1.getBinaryCode(map2, n);
		
		String[] result = t1.getTreasureMap(bCode1, bCode2, n);
		
		System.out.println("1번 : " + bCode1);
		System.out.println("2번 : " + bCode2);
		
		System.out.println();
		
		for(String s : result) {
			System.out.println(s);
		}
		
		int num1 = 9; // 1001
		int num2 = 5; // 0101
		int result1 = num1 | num2;
		System.out.println(Integer.toBinaryString(result1));
	}
	
}