package arrayList01;

import java.util.ArrayList;
import java.util.List;

public class What03 {
	List<Integer> list;
	
	void listAdd() {
		
		list = new ArrayList<Integer>();
		for(int i = 1; i <= 20; i++) {
			list.add(i);
		}
		
		System.out.println("리스트 생성 : " + list);
	}
	
	void oddDelete() {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 != 0) {
				list.remove(i);
			}
		}
		
		System.out.println("홀수 삭제 : " + list);
	}
	
	void oddInsert() {
		int num = list.get(list.size() - 1);
		for(int i = list.size() - 1; i >= 0; i--) {
			list.add(i, num - 1);
			num -= 2;
		}
		
		System.out.println("홀수 삽입 : " + list);
	}
	
	void randomList() {
		list = new ArrayList<Integer>();
		
		while(list.size() < 6) {
			int ran = (int)( Math.random() * 45 ) + 1;
			
			if(list.indexOf(ran) == -1) {
				list.add(ran);
			}
		}
		
		System.out.println("랜덤 리스트 : " + list);
	}
	
	public static void main(String[] args) {
		
		What03 w = new What03();
		w.listAdd();
		w.oddDelete();
		w.oddInsert();
		w.randomList();
		
	}
	
}
