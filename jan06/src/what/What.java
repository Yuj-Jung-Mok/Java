package what;

public class What {
	
	public static void main(String[] args) {
		// 문자열 압축
		String data = "aaabbcccccca";
		int len = data.length();
		int cnt = 1;
		String result = "";
		
		for(int i = 1; i < len; i++) {
			if(data.charAt(i-1) == data.charAt(i)) {
				System.out.println("1");
				cnt++;
			} else {				
				System.out.println("2");
				result += cnt + "" + data.charAt(i-1);
				cnt = 1;
			}
			if(i == len - 1) {	
				result += cnt + "" + data.charAt(i);
				System.out.println(result);
			} 
		}
		
		System.out.println(result);
	}
}