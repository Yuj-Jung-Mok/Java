package jan11;

import java.util.Arrays;

class Trip {
	private int pCnt;	// 사람 수
	private int sCnt;	// 차 몇 인승
	
	Trip(int pCnt, int sCnt) {
		int carCnt = pCnt % sCnt == 0 ? pCnt / sCnt : (pCnt / sCnt) + 1;
		int pSheet = pCnt % sCnt == 0 ? sCnt : pCnt % sCnt;
		
		System.out.println("인원은 " + pCnt + ", 필요한 차 댓수는 " + carCnt + ", 마지막 차의 탈 인원은 " + pSheet);
	}
}

public class Car {
	public static void main(String[] args) {
		// args의 존재
		System.out.println(Arrays.toString(args));
		// 자장면 파스타 딸기 = 스페이스바로 구분
		Trip t = new Trip(20, 4);
	}
}