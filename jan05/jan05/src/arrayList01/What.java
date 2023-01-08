package arrayList01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class What {

	public static void main(String[] args) {

		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2); 
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);

		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);

		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);

		// 부분 집합
		//System.out.println(A.containsAll(B)); // false
		//System.out.println(A.containsAll(C)); // true

		// b를 a에 다 합친다. (합집합)
		//A.addAll(B);
		
		// a와 b가 가지고 있는 값만 출력한다. (교집합)
		//A.retainAll(B);
		
		// 차집합, a가 가지고 있고, b가 가지고 있으면 그 값을 빼고 a를 출력한다.
		A.removeAll(B);
		
		Iterator hi = (Iterator) A.iterator();

		while (hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		
		////////////////////////
		
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iteratorUsingForEach(a);
		
	}
	
	public static void iteratorUsingForEach(HashMap hashMap) {
		Set<Map.Entry<String, Integer>> entries = hashMap.entrySet(); 
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	public static void iteratorUsingIterator(HashMap hashMap) {
		Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() + " : " + entry.getKey());
		}
	}

}
