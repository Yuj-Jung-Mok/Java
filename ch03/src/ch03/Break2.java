package ch03;

public class Break2 {
	public static void main(String[] args) {
		
		a : for(int i = 1; i <= 10; i++) {	// a : label
			for(int j = 1; j <= 10; j++) {
				System.out.println("대박 J : " + j);
				// break는 내부의 for문만 빠져 나옴
				//if(j > 4) break;
				if(j > 4) break a;	// label a에 해당하는 반복문 종료
		
			}
			System.out.println("사건 I : " + i);
		}
		
	}
}
