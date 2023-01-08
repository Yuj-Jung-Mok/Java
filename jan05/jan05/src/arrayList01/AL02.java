package arrayList01;

import java.util.ArrayList;
import java.util.List;

public class AL02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
//		list.add(10);
		// 제네릭을 지정했기 때문에 다른 타입은 넣을 수 없다.
		// list.add(11.1);
		// list.add("홍길동");
		
//		int num = list.get(0);
		
		// 리스트를 새로 만들어주세요.
		// 랜덤에서 숫자가 나오면
		// 크기 순서대로 저장하는 메소드를 만들어 주세요.
		// 랜덤은 6번만 실행해주세요. (같은 숫자는 나오지 않게해주세요)
		// [5] -> [5, 3] -> [3, 5] -> [3, 5, 9] -> [3, 5, 9, 6] -> [3, 5, 6, 9]
//		do {
//			int rand = (int)(Math.random() * 45) + 1;
//			if(list.indexOf(rand) == -1) {
//				
//				list.add(rand);
//			}
//		} while(list.size() < 6);
//		
//		System.out.println(list.size());
//		
//		for(int i = 0; i < list.size() - 1; i++) {
//			for(int j = i+1; j < list.size(); j++) {
//				if(list.get(i) > list.get(j)) {
//					int temp = list.get(i);
//					list.add(i, list.get(j));
//					list.remove(i+1);
//					list.add(j, temp);
//					list.remove(j+1);
//				}
//			}
//		}
//		
//		System.out.println(list);


		
		
		List<Integer> rList = new ArrayList<Integer>();
		for( int i = 0; i < 6; i++ ) {					// 6번 확정
			int r = (int)( Math.random() * 45 ) + 1;	// 랜덤 발생
			
			int j = 0;									// j 초기화
			if ( rList.indexOf(r) != -1 ) {				// 중복이라는 조건이면 
				i--;									// i를 줄인다.
			} else {									// 중복이 아니라면
				while ( j < rList.size() ) {			// j가 배열보다 사이즈가 작으면 계속 반복, 배열 크기만큼만 진행 벗어나면 범위 에러 발생하기 때문 
					if( r > rList.get(j) ) j++;			// 랜덤값이 배열에 있는 값보다 크면 j 증가, 아니면 0이라서 앞쪽에 추가
					else break;							// 랜덤값이 배열에 있는 값보다 작으면 if문 나가기
			}
		
		rList.add(j, r);								// 배열값 추가
		}
	}      

	System.out.println(rList);

	
	}
	
}