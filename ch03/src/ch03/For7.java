package ch03;

public class For7 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {	//for6
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {	//for5
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
