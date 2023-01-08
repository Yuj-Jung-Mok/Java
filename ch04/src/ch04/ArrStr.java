package ch04;

public class ArrStr {

	public static void main(String[] args) {
		
		for(String ar : args) {		// " " 문자열, ' ' 문자 
			System.out.print("배열 : " + ar + ". ");
		}
		
		System.out.println("====================");
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
	
}
