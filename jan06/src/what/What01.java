package what;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class What01 {

	public static void main(String[] args) {

		
		
	}
	
}

class Lotto {
	int i = 0;
	List<Integer> list = new ArrayList<Integer>();
	
	void getLotto() {
		while(i < 6) {
			int rNum = (int) (Math.random() * 45) + 1;
			
			if(list.get(i) != list.get(rNum))
				i++;
		}
	}
	
}

class MakeMap {
	
	Map<String, Object> map = new HashMap<String, Object>();
	
}

class MakeSet extends MakeMap {
	
	Set<String> set = map.keySet();
	
}

class MakeList extends MakeSet {
	
	List<String> list;
	
}

interface ShowList {
	void getList();
	void getIterator();
}

class Make extends MakeList implements ShowList{
	
	void setList(int num) {
		for(int i = 1; i <= num; i++) {
			map.put(i+"번", i + "번 데이터");
		}
	}
	
	@Override
	public void getList() {
		list = new ArrayList<String>(set);
		
		for(String key : list) {
			System.out.println("key : " + key + ", data : " + map.get(key));
		}
	}
	
	@Override
	public void getIterator() {
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key : " + key + ", data : " + map.get(key));
		}
	}
	
}