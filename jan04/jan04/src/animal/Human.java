package animal;

public class Human extends Animal {
	private String ssn;
	final static int NUM = 101;
	static int check = 500;
	
	// 생성자
	
	// 메소드
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		int len = ssn.length();
		ssn = ssn.replace("-", ""); //앞의 문자를 뒷 문자로 교체
		
		if(ssn.length() < 13) {
			// 모자란 자리수만큼 *로 입력해서 저장하기
			for(int i = 1; i <= 13 - len; i++) {
				ssn += "*";
			}
		}

		this.ssn = ssn;
	}
	
	int add(int n1, int n2) {
		return n1 + n2;
	}
	
	@Override
	public void sound() {
		//super.sound();
		System.out.println("아!");
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		
		// static 변수의 경우 클래스명.변수명으로 하자
		Human.check = 5000;
		//human.check = 5000;	// 가능하지만 사용하지 말자
		//human.NUM = 15015;	// 불가능
		
		int result = human.add(15, 30);
		human.setSsn("980803");
		System.out.println(human.getSsn());
		// 부모 = 자식
		Object h = new Human();
		Animal h2 = new Human();
	}
	
}