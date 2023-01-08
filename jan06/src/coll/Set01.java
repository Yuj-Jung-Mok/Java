package coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set interface (p733)
// 순서 없음, 중복 없음

public class Set01 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(2);
		set.add(5);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(7);
		set.add(8);
		set.add(10);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(10));
		System.out.println(set.toArray());
		
		for(Integer i : set) {
			System.out.print(i + " ");
		}
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.print(integer + " ");
		}
		System.out.println();
		
		// 로또 만들기
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
			int ran = (int) (Math.random() * 45) + 1;
			lotto.add(ran);
		}
		
		System.out.println(lotto);
		
	}
	
}
