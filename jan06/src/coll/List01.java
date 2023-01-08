package coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List : 순서가 있어요, 중복 허용
// Set  : 순서가 없어요, 중복 비허용
// Map<Key, Value> : 순서가 없어요, (Key) 중복 비허용


// 시리얼키 만들기
// W269N-WFGWX-YVC9B-4J6C9-T83GX 형식

public class List01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		// add(E) : 마지막 인덱스에 요소 추가
		// add(index, E) : 해당 인덱스에 요소 추가
		list.add(0, 150);
		System.out.println("리스트 : " + list);
		
		// remove(index) : 해당 인덱스 요소 제거
		// clear() : 리스트 초기화
		
		// set(index, E) : 해당 인덱스 요소 변경
		// indexOf(E) : 해당 요소가 있는 인덱스 번호 출력, 없으면 -1
		int cnt = list.indexOf(150);
		System.out.println("요소 인덱스 확인 : " + cnt);
		
		// contains : 해당 요소가 있는지 여부 확인 (참, 거짓)
		System.out.println("요소 확인 : " + list.contains(150));
		
		// get(index) : 해당 인덱스 요소 반환
		System.out.println("가져오기 : " + list.get(0));
		
		// isEmpty() : 리스트 공백 여부 확인
		System.out.println("공백 여부 : " + list.isEmpty());
		
		////
		
		// [150, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		int i = 1;
		while(list.size() <= 10) {
			list.add(i++);
		}
		System.out.println("리스트 : " + list);
		
		// 객체.hasNext();
		// 해당 이터레이션(Iteration)이 다음 요소를 가지고 있으면 true, 없으면 false
		// 객체.next();
		// 다음 요소를 반환함.
		
		// iterator
		Iterator<Integer> it = list.iterator();
	
		// 출력할 데이터 요소 확인
		System.out.print("Iterator : ");
		while(it.hasNext()) {
			System.out.print(it.next() + " "); // 출력
		} 
		System.out.println();
		
		List<String> key =new ArrayList<String>();
		key.add("123-456-789");
		key.add("111-222-333");
		key.add("444-555-666");
		
		System.out.println(key);

		
		
	}
	
}