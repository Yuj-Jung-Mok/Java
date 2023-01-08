package coll;

// java.util.*로 하면 필요한 것만 가져옵니다.
import java.util.*;

/*
 * List : 중복 허용, 순서 있음
 * Set : 중복 비허용, 순서 없음
 * Map : key, value로 저장하고 key는 순서/중복이 없음
 */

// Map (p746)

public class Map02 {

	public static void main(String[] args) {
		// 아이디, 패스워드
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("poseidon", "01234567");
		map.put("test", "test");
		map.put("test01", "test0101");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");

			System.out.print( "아이디 : ");
			String id = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else System.out.println("비밀번호가 일치하지 않습니다.");
			} else System.out.println("존재하지 않는 아이디 입니다.");
		}	// while
		
		sc.close();
	}
	
}
