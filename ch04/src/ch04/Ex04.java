package ch04;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// 거스름돈 : 372,000원, 5만, 1만, 5천, 1천원
		int money = 372000;
		int[] unit = {50000, 10000, 5000, 1000};
		for(int i=0; i < unit.length; i++) {
			System.out.printf("%d원 : %d장\n", unit[i], money/unit[i]);
			money %= unit[i];
		}
		
//		int oman = money / 50000;
//		System.out.println("오만원권 : " + oman);
//		
//		money = money - (oman * 50000);
//		
//		int ilman = money / 10000;
//		System.out.println("일만원권 : " + ilman);
//		
//		money = money - (ilman * 10000);
//		
//		
//		int ocheon = money / 5000;
//		System.out.println("오천원권 : " + ocheon);
//		
//		money = money - (ocheon * 5000);
//		
//		int ilcheon = money / 1000;
//		System.out.println("천원권 : " + ilcheon);
		
		
	}
	
}
