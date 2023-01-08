package jan02;

public class Array01 {
	
	public static void main(String[] args) {
		int[] s = {1, 3, 4, 5, 6,  8, 13, 17, 20};
		int total, num1 = 0, num2 = 0;
		int min = 100;

		String data = "";
		
		for(int i = 0; i < s.length - 1; i++) {
			total = s[i+1] - s[i];
			
			if(total < min) {
				min = total;
				num1 = s[i];
				num2 = s[i+1];
				data = "{" + num1 + ", " + num2 + "}";
			} else if(total == min) {
				data += ", {" + s[i] + ", " + s[i+1] + "}";
			}
		}
		
		System.out.println(data);
	}
	
}
