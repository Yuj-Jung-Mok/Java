package jan13;

import java.util.List;
import java.util.Scanner;

import sql.MemberDAO;
import sql.MemberDTO;

public class MemberManager {
	MemberDAO dao = new MemberDAO();

	public void selectMember() {
		List<MemberDTO> list = dao.listPrint();
		
		for (MemberDTO memberDTO : list) {
			System.out.printf("%d	%s	%d	%s\n", memberDTO.getMember_no(), memberDTO.getMember_name(),
					memberDTO.getMember_age(), memberDTO.getMember_email());
		}
	}
	
	public void insertMember(Scanner sc) {
		MemberDTO dto = new MemberDTO();
		
		System.out.println("회원을 추가합니다.");

		System.out.print("이름을 입력하세요 : ");
		dto.setMember_name(sc.next());
		
		System.out.print("나이를 입력하세요 : ");
		dto.setMember_age(sc.nextInt());
		
		System.out.print("전화번호를 입력하세요 : ");
		dto.setMember_tel(sc.next());
		
		System.out.print("이메일을 입력하세요 : ");
		dto.setMember_email(sc.next());
		
		int result = dao.insertMember(dto);
		System.out.println("처리 결과 : " + result);
	}
	
	public void deleteMember(Scanner sc) {
		MemberDTO dto = new MemberDTO();
		
		selectMember();
		
		System.out.print("삭제할 번호를 입력하세요 : ");
		dto.setMember_no(sc.nextInt());
		
		int result = dao.deleteMember(dto);
		System.out.println("처리 결과 : " + result);
	}
	
	public void updateMember(Scanner sc) {
		MemberDTO dto = new MemberDTO();
		
		selectMember();

		System.out.print("수정할 번호를 입력하세요 : ");
		dto.setMember_no(sc.nextInt());
		
		int result = 0;
		
		System.out.print(dto.getMember_no() + "번을 수정합니다. 맞습니까? (맞으면 1번, 틀리면 2번) : ");
		if (sc.nextInt() == 1) {
			System.out.print("이름을 입력하세요 : ");
			dto.setMember_name(sc.next());
			
			System.out.print("나이를 입력하세요 : ");
			dto.setMember_age(sc.nextInt());
			
			System.out.print("전화번호를 입력하세요 : ");
			dto.setMember_tel(sc.next());
			
			System.out.print("이메일을 입력하세요 : ");
			dto.setMember_email(sc.next());
			
			result = dao.updateMember(dto);
			System.out.println("처리 결과 : " + result);
		} else {
			System.out.println("취소 되었습니다.");
		}
	}

	public static void main(String[] args) {
		
		MemberManager m = new MemberManager();
		
		Scanner sc = new Scanner(System.in);
		int key = 0;

		while (key != 5) {
			System.out.println("===========================회원관리 프로그램===========================");
			System.out.println("1. 리스트	2. 추가		3. 삭제		4. 수정		5. 종료");
			System.out.print("사용할 기능의 숫자를 입력해주세요 : ");
			key = sc.nextInt();
			System.out.println();

			switch (key) {
			case 1: // 리스트
				m.selectMember();
				break;

			case 2: // 추가
				m.insertMember(sc);
				break;

			case 3: // 삭제
				m.deleteMember(sc);
				break;

			case 4: // 수정
				m.updateMember(sc);
				break;

			case 5: // 종료
				System.out.println("===========================프로그램 종료===========================");
				break;

			default:
				System.out.println("해당 숫자의 기능은 없습니다.");
				break;
			}
			
			System.out.println();
		}

		sc.close();
	}

}
