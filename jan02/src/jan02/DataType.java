package jan02;

public class DataType {
	public static void main(String[] args) {
		// 알고 있는 데이터 타입 중 
		/*
		 * 정수
		 * byte
		 * short
		 * int
		 * long
		 * 
		 * 실수
		 * float
		 * double
		 * 
		 * 문자 타입
		 * char
		 * 
		 * 논리타입
		 * boolean
		 */
		
		// 정수
		byte bNum = 127;	// 초기화 = 리터럴
		bNum = (byte) 256250;	// 캐스팅 = 값 절삭이 발생
		System.out.println("    " + bNum);
		
		short sNum = bNum;	// 프로모션
		System.out.println(sNum);
		
		bNum = (byte)sNum;
		System.out.println(bNum);
		
		sNum = (short) 32768;
		System.out.println(sNum);
		
		int iNum = sNum + bNum + 125652;
		// 자바에서 사용하는 모든 숫자는 int 사용
		long lNum = 2147483647L; // 표식자 : L, D, F
		System.out.println(lNum);
		
		iNum = (int) lNum;
		sNum = (short) iNum;
		bNum = (byte) sNum;
		
		System.out.println(bNum);
		
		// 실수
		float fNum = 3.14F;	// 실수 기본 타입은 double
		double dNum = fNum;
		
		iNum = 3;
		dNum = 127;
		System.out.println(dNum);
		
		iNum = (int) fNum;
		System.out.println(iNum);  // 3
		
		// byte 1 -> short 2 -> int 4 -> long 8 -> float 4 -> double 8
		
		// 문자 타입
		char ch = '가';
		System.out.println(ch);
		
		ch = 'A';
		ch = '@';
		ch = 80;	// ascii code
		System.out.println(ch);
		
		ch = '\uAD81';	// unicode
		System.out.println(ch);
		
		int iNum02 = 014;	// 8진법
		System.out.println(iNum02);
		
		int iNum03 = 0xC;	// 16진법 : 0 1 2 3 4 5 6 7 8 9 A B C D E F (16)
		System.out.println(iNum03);
		
		int iNum04 = 0b01100;	// 2진법
		System.out.println(iNum04);
		
		
		// 2진법 8진법 16진법 12 출력
		System.out.println(Integer.toBinaryString(12));	// 12 > 2진법
		System.out.println(Integer.toOctalString(12));	// 12 > 8진법
		System.out.println(Integer.toHexString(12));	// 12 > 16진법
		
		// 불리언
		boolean bool = false;
		bool = true;
		System.out.println(1 == 2);
		System.out.println(true == true);
		System.out.println(bool == true);
		System.out.println(bool = !false);
		System.out.println(bool != false);
		System.out.println(bool == !!!!!!!!!!!false);
		
		
	}
}
