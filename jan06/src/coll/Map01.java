package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Map<K, V> : key는 중복 불가 (덮어쓰기), value는 중복 가능 (p740)

public class Map01 {

	public static void main(String[] args) {
		// E, T, K, V
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 저장 put(K, V)
		map.put("홍길동", 12);
		map.put("김길동", 30);
		map.put("이길동", 20);
		map.put("박길동", 10);
		map.put("최길동", 50);
		map.put("홍길동", 100);
		
		System.out.println(map);
		
		Map<String, String> map2 = new HashMap<String, String>();
		
		map2.put("1번", "1");	// 사전 형태라고도 불립니다.
		map2.put("2번", "2");
		map2.put("3번", "3");
		map2.put("4번", "4");
		map2.put("5번", "5");
		
		// 출력 get(K);
		System.out.println(map.get("이길동"));
		System.out.println(map.get("없는거"));	// 존재하지 않는 키를 호출하면 null 출력
		
		// 키, 값 유무 확인
		System.out.println(map.containsKey("이길동"));
		System.out.println(map.containsKey("이길동1"));
		
		System.out.println(map.containsValue(100));
		System.out.println(map.containsValue(2000));
		
		// 삭제 remove(K)
		System.out.println(map.remove("이길동"));	// 키를 지우면 값을 반환
		System.out.println(map);
		
		// 크기 size()
		System.out.println(map.size());
		
		// 1. map -> set -> list
		// Set<String> map2Set = map.keySet();	// 키만 뽑아 Set 형태로 변경
		// System.out.println(map2Set);
		List<String> set2List = new ArrayList<String>(map.keySet());
		System.out.println(set2List);
		
		for(int i = 0; i < set2List.size(); i++) {
			System.out.print("Key : " + set2List.get(i));
			Integer value = map.get(set2List.get(i));	// 따로 추출해논 키값으로 Map.get(키값)을 진행하여 출력합니다.
			System.out.println(", Value : " + value);
		}
		
		// map2 출력
		set2List = new ArrayList<String>(map2.keySet());
		for(String k : set2List) {
			System.out.println( "Key : " + k + ", Value : " + map2.get(k));
		}
		
		// 1. map -> set === iterator
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key : " + key + ", Value : " + map.get(key));
		}
		
	}
	
}