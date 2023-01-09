package exception01;

public class Exception03 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 배열은 존재하지 않습니다.");
		}
		
		System.out.println("프로그램 종료");
	}
	
}
