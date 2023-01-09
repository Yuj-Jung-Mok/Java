package inner;

/* p392
 * 정적 클래스 static class
 * class 앞에 static이 붙는 것이 차이점 입니다.
 * static이 붙었기 때문에 객체 생성없이 사용 가능합니다.
 * 클래스의 static 변수처럼 사용 됩니다.
 * 외부 클래스와 내부 클래스는 다르게 동작합니다.
 * 외부 클래스와 내부 클래스의 멤버가 private라도 접근 가능
 * 경로만 지정되면 단독으로 활용할 수 있습니다.
 */

class Outer {
	
	public static class Check {
		public static void test() {
			System.out.println("test");
		}
	}
	
}

public class StaticClass {

	private int outMember = 10;
	private static int outStatic = 55;
	
	public static class Inner {
		
		public static void innerMethod1() {
			System.out.println(outStatic);
		}
		
		public void innerMethod2() {
			System.out.println(outStatic);
		}
		
	} // inner class
	
	public static void main(String[] args) {
		StaticClass.Inner.innerMethod1();	// static
		
		StaticClass.Inner in = new StaticClass.Inner();	// non-static
		in.innerMethod2();
	}
	
} // static class
