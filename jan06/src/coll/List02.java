package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// List + Map

public class List02 {

	public static void main(String[] args) {
		// 외부
		List<Map<String, Object>> board = new ArrayList<Map<String, Object>>();

		// 내부
		Map<String, Object> ele = new HashMap<String, Object>();

		// 데이터 저장
		ele.put("no", 5);
		ele.put("title", "제목 입니다.");
		ele.put("writer", "poseidon");
		ele.put("data", "2023-01-05");

		board.add(ele);

		ele = new HashMap<String, Object>(); // 같은 이름의 객체

		ele.put("no", 6);
		ele.put("title", "집에 가고싶어요");
		ele.put("writer", "가나다라마바사");
		ele.put("data", "2023-01-06");

		board.add(ele);

		ele = new HashMap<String, Object>(); // 같은 이름의 객체

		ele.put("no", 7);
		ele.put("title", "숙제는 없어요");
		ele.put("writer", "지나가는");
		ele.put("data", "2023-01-07");

		board.add(ele);
		
		ele = new HashMap<String, Object>(); // 같은 이름의 객체

		ele.put("no", 8);
		ele.put("title", "회식하고 싶어요");
		ele.put("writer", "강남역7번출구");
		ele.put("data", "2023-01-08");

		board.add(ele);
		
		// [ { no=5, data=2023-01-05, writer=poseidon, title=제목 입니다. }, ...  ]
		// System.out.println(board);
		System.out.println("번호\t\t제목\t\t\t글쓴이\t\t\t날짜");
		System.out.println("--------------------------------------------------------------------------");
		for(int i=0; i<board.size(); i++) {
			System.out.print(board.get(i).get("no") + "\t\t");
			System.out.print(board.get(i).get("title") + "\t\t");
			System.out.print(board.get(i).get("writer") + "\t\t");
			System.out.print(board.get(i).get("data") + "\n");
		}
	}

}
