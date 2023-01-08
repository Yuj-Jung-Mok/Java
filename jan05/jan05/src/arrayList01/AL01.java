package arrayList01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// 랩퍼 클래스 생각하고 할 컬렉션

public class AL01 {

	public static void main(String[] args) {
		// 배열은 갯수를 정해야하지만, List는 자동으로 크기가 지정됨.	int[] arr = new int[10];
		// <> 제네릭 : 내부 타입 요소 지정. 자바 1.5에서 추가.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 값 추가 .add();
		list.add(150);
		list.add(110);
		list.add(100);
		list.add(99);
		list.add(85);
		list.add(75);
		
		// 값 출력
		System.out.println(list);
		
		// .get(index);
		System.out.println(list.get(0));	// 150
		System.out.println(list.get(1));	// 110
		System.out.println(list.get(2));	// 100
		System.out.println(list.get(3));	// 99
		System.out.println(list.get(4));	// 85
		System.out.println(list.get(5));	// 75
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Integer integer : list) {
			System.out.println(integer);
		}
		
		// .size();
		System.out.println(list.size());	// 6
		
		// list의 마지막 데이터 출력
		System.out.println( list.get( list.size() - 1 ) );	// 75
		
		// 1 ~ 20까지 짝수만 순서대로 저장해주세요.
		ArrayList<Integer> list2 =new ArrayList<Integer>();
		for(int i=1; i<=20; i++) {
			if(i % 2 == 0) list2.add(i);
		}
		
		System.out.println(list2);
		
		System.out.println(list2.remove(0));	// remove는 지워지는 배열의 값을 보여줌
		
		System.out.println(list2);
		
		list.clear();	// 	리스트 초기화
		System.out.println(list.size());	// 0
		
		for(int i = 1; i <= 20; i++) {
			list.add(i);
		}
		
		// 홀수만 지우고 짝수만 남기기
		for(int i=0; i<list.size(); i++) {
			System.out.print("List : " + list.size() + " ");
			if(list.get(i) % 2 != 0) System.out.println( list.remove(i) );
		}
		
//		// R 타입 값 비교 시
//		System.out.println(iNum3.equals(127));		// 같으면 true, 다르면 false
//		System.out.println(iNum3.compareTo(126));	// 같으면 0, 앞 숫자가 크면 1, 뒤 숫자가 크면 -1
		
//		// 값 원하는 위치에 넣기
//		// list.add(0, 100);
//		
//		// 값이 있는지 확인 여부 (참 거짓)
//		list.contains(20);
//		System.out.println(list.contains(20));
//		
//		// 값이 비어 있는지 확인 여부
//		list.isEmpty();
//		System.out.println(list.isEmpty());
//		
//		// 값 순서 섞기
//		Collections.shuffle(list);
//		System.out.println(list);
//		
//		// 정렬
//		Collections.sort(list);
//		System.out.println(list);
//		
//		// 역순 정렬
//		Collections.sort(list, Collections.reverseOrder());
//		System.out.println(list);
//		
//		// 있으면 값의 위치를 반환, 없다면 -1 반환
//		list.indexOf(10);
//		System.out.println(list.indexOf(10));
		
		System.out.println("--------------");
		
		System.out.println(list);
		
		// 배열 번호는 0번부터 하기 때문에 size() - 1로 최종 인덱스 가져오고, 가져온 값(20)에서 -1하여 19를 담았다.
		int num = list.get( list.size()-1 ) - 1;
		
		for(int i=list.size() - 1; i >= 0; i--) {
			list.add(i, num);
			num -= 2;
		}
		
		System.out.println(list);
	}
	
}
