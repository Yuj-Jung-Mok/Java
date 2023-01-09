package jan09;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		String code = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
		String[] re = code.split(" ");	// " " 기준으로 문자열을 잘라서 배열로 만듬
		
		System.out.println(Arrays.toString(re));
	}
	
}
