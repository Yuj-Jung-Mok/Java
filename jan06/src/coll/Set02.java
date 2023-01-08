package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Set02 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("김길동");
		set.add("최길동");
		set.add("박길동");
		set.add("홍길도");
		set.add("이길도");
		set.add("최길동");
		
		System.out.println(set.size());
		System.out.println(set);
		
		// Set을 List로 변환
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
		
		Collections.sort(list);
		for(String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
	}
	
}
