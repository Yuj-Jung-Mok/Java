package str;

import java.util.Arrays;
import java.util.List;

public class Str01 {

	public static void main(String[] args) {
		
		String str = "100";
		String str2 = new String("100");
		
		char ch = 'A';
		str = str + ch + 150;	// 연결
		
		System.out.println(str);
		
		int num = 100 + 150;	// 계산
		
		// 문자 + 숫자 = 문자
		// 문자 + 문자 = 문자
		// 숫자 + 문자 = 문자
		// 숫자 + 숫자 = 숫자
		
		str2 = "A" + 127;
		System.out.println(str2);
		
		str2 = 1 + 2 + 3 + "A";
		System.out.println(str2);
		
		str2 = "2" + 1 + 2 + 3 + "A";
		System.out.println(str2);
		
		str2 = "2" + (1 + 2 + 3) + "A";
		System.out.println(str2);
		
		str2 = "안녕하세요.";
		
		// 데이터를 char[] 타입으로 변환 메소드
		char[] hi = str2.toCharArray();
		System.out.println(Arrays.toString(hi));
		
		// 해당 인덱스 위치에 요소 반환
		System.out.println(str2.charAt(0));
		// 해당 요소의 인덱스 위치 반환
		System.out.println(str2.indexOf("안"));
		System.out.println(str2.indexOf("읅"));	// 없으면 -1
		
		System.out.println("==================================");
		
		List<String> hiList = Arrays.asList(str2);
		System.out.println(hiList);
		
		String str3 = new String(hi, 1, 2);
		System.out.println(str3);
		
		System.out.println("==================================");
		
		str3 = "fdkjfasfdsajkadfskjfdkjdfasjkhfdasjkhdfsakj";
		System.out.print("j가 몇개? ");
		
		char[] jChk = str3.toCharArray();
		int cnt = 0;
		for(char j : jChk) {
			if(j == 'j') cnt++; 
		}
		System.out.println(cnt);
		
		System.out.println("==================================");
		
		str3 = "Hi5";
		System.out.println(Character.isAlphabetic(str3.charAt(0)));
		System.out.println(Character.isAlphabetic(str3.charAt(1)));
		System.out.println(Character.isAlphabetic(str3.charAt(2)));
		
		System.out.println("==================================");
		
		// 알파벳 확인 여부
		System.out.println(Character.isAlphabetic('A'));
		// 숫자 확인 여부
		System.out.println(Character.isDigit('A'));
		// 대문자 확인 여부
		System.out.println(Character.isUpperCase('A'));
		// 소문자 확인 여부
		System.out.println(Character.isLowerCase('A'));
		
		System.out.println("==================================");
		
		// 해당 값 포함 여부 확인
		System.out.println(str3.contains("cat"));
		System.out.println(str3.contains("Hi"));
		
		System.out.println("==================================");
		
		// 이어 붙이기
		str3 = str3.concat("입니다.");
		System.out.println(str3);
		
		System.out.println("==================================");
		
		// 요소가 해당 값으로 끝나는지 여부 확인
		System.out.println(str3.endsWith("니다."));
		
		String email = "wjdahr125@gmail.com";
		System.out.println(email.endsWith(".com"));
		
		System.out.println("==================================");
		
		String str1 = "Hi";
		str2 = "Hi";
		System.out.println(str1 == str2);

		// 불변성, immortal
		str1 = new String("Hi");
		str2 = new String("Hi");
		System.out.println(str1 == str2);		// 객체 확인
		System.out.println(str1.equals(str2));	// 값 확인
		
		System.out.println("==================================");
		
		str1 = "안녕하세요";
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(" 날씨가 참 좋네요.");
		
		System.out.println(sb.toString());
		
		System.out.println("==================================");
		
		// 문자열 자르기
		String str4 = email.substring(email.indexOf("@") + 1, email.length());
		System.out.println(str4);
		str4 = email.substring(0, email.indexOf("@"));
		System.out.println(str4);
	}
	
}
