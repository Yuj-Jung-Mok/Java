package inner;

/*
 * 멤버 클래스와 static 클래스는 외부 클래스의 멤버 변수와 같은 위치에 선언 됩니다.
 * 또한 멤버 변수와 같은 성질을 가집니다.
 * 
 * 정적 class가 아닌 경우는 (static 선언이 없는) 멤버 클래스
 * 인스턴스 변수는 클래스 내에서 선언되지만 메소드 밖에서, 생성자 밖에서, 다른 블럭 밖에서 선언 됩니다.
 * 이경우 반드시 초기화가 필요합니다.
 * 
 * 내부 클래스는 외부 클래스의 멤버를 사용할 수 있지만
 * 외부 클래스는 내부 클래스의 멤버를 사용할 수 없습니다.
 * 
 * 또한 static 붙은 메소드 내에서는 내부 클래스의 객체 선언을 할 수 없습니다.
 */

public class MemberClass {
	private int outMember = 11;
	private static int outStatic = 155;
	
	// 외부 메소드
	void outMethod() {
		MemberInner inner = new MemberInner();
		inner.method();
	}
	
	static void outStatic() {	// 스태틱이 붙은 클래스라 인스턴스 활용 불가
		//MemberInner inner = new MemberInner();
	}

	public class MemberInner {
		int innerMember = 12;
		
		public void method() {
			System.out.println(outMember);
		}
	}
	
	public static void main(String[] args) {
		MemberClass mc = new MemberClass();
		MemberClass.MemberInner inner = mc.new MemberInner();
	}
	
}
