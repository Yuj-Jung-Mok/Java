package ch03;

public class Continue2 {
	public static void main(String[] args) {
		outer : for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println("@@ J = " + j);
				//if(j > 3) continue;	// 안에 있는 j 증감으로 간다
				if(j > 3) continue outer;
				System.out.println("@@@ J = " + j);
			}
			System.out.println("@ i = " + i);
		}
	}
}
