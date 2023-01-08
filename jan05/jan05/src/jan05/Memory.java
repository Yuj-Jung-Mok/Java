package jan05;

// 자바의 메모리
// 앞으로 배울 예외 처리 .. 호출 스택
/*
 * 메소드 영역 : 클래스 데이터 ( 클래스 변수 )
 * 				 프로그램 실행 중 어떤 클래스가 사용되면
 * 				 JVM은 해당 클래스 파일을 읽어서 클래스 데이터를 이곳에 저장하며 동시에 클래스 변수도 이 곳에 저장.
 * 
 * 힙 영역 : 인스턴스 ( 인스턴스 변수 (참조형) ) 
 * Heap    : 인스턴스가 생성되는 곳 입니다. 
 * 
 * 호출 스택 : 메인 메소드 ( 지역 변수 )
 * 			   메소드 작업에 필요한 메모리 공간을 제공합니다.
 * 			   메소드가 호출되면 호출 스택에 메소드 활용을 위한 메모리가 할당 됩니다.
 * 			   메모리에서 메소드가 작업을 수행하는 동안 지역 변수와 연산의 중간 결과가 저장 됩니다.
 * 			   메소드가 작업을 할당된 메모리 공간은 반환/비워집니다.
 * 			   호출 스택은 제일 상위에 있는 메소드가 지금 실행되고 있는 메소드 입니다. 나머지는 모두 대기 합니다.
 * 			   -> 언제나 호출 스택 제일 위에 있는 메소드가 실행중인 메소드 입니다.
 * 				  아래에 있는 메소드가 바로 위에 있는 메소드를 호출해서 사용중인 메소드 입니다.
 * 
 */
 
public class Memory {
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		first();
		
		System.out.println("main end");
	}

	static void first() {
		System.out.println("first start");
		second();
		System.out.println("first end");
	}
	
	static void second() {
		System.out.println("second start");
		System.out.println("second");
		System.out.println("second end");
	}
	
}
