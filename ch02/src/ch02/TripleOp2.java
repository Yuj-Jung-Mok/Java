package ch02;

public class TripleOp2 {
	public static void main(String[] args) {
		int rowPerPage = 10;	// 페이지 당 글수
		int num = 243;			// 게시글 수
		// 몇 페이지가 필요할까요?
		int page = num % rowPerPage == 0 ? num / rowPerPage : num / rowPerPage + 1;
		System.out.println(page);
	}
}
