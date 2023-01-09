package jan09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AtoM {
	
	Map<Character, String> morseMap = new HashMap<Character, String>();
	
}

public class Morse {

	public static void main(String[] args) {
		
		Scanner sc = null;
		String user = null;
		char[] ch = null;
		
		sc = new Scanner(System.in);
		
		System.out.println("모스 부호로 변경할 문장을 입력하세요.");
		System.out.print("입력  >>  ");
		
		user = sc.nextLine();
		user = user.toUpperCase();	// 대문자로 변경
		//user.toLowerCase();		// 소문자로 변경
		System.out.println(user);
		
		ch = user.toCharArray();	// 배열로 변경
		System.out.println(Arrays.toString(ch));	// [H, E, 공백, L, L, O]
		
		// 모스 부호로 변경
		for(int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		sc.close();
	}
	
}
