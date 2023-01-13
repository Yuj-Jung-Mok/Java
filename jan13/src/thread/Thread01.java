package thread;

// Thread
/*
 * 다중 작업 : 두 가지 일을 동시에 수행하는 것
 * 자바는 Thread 클래스, Runnable 인터페이스를 상속해 사용합니다.
 * run() 이것으로 start()를 실행합니다.
 * 이미 만들어졌으니 불러다 쓰기만 하면 됩니다.
 * 
 * 책 576p
 * 운영 체제에서는 실행중인 하나의 애플리케이션을 프로세스
 * 사용자가 애플리케이션을 실행하면 운영체제로부터 실행에 필요한 메모리를 할당받아 애플리케이션의 코드를 실행하는데 이것이 프로세스 입니다.
 * 하나의 애플리케이션은 다중 프로세스를 만들기도 합니다.
 * 예를 들어 chrome 브라우저를 두 개 실행했다면 두 개의 chrome 프로세스가 실행된 것 입니다.
 * 
 * 멀티 태스킹 = 다중 작업
 * 두 가지 이상의 작업을 동시에 처리하는 것.
 * 인터넷을 하면서 노래를 듣고 카톡하는 것 = 멀티 태스킹
 * 
 * 만약 다중작업이 안된다면
 * 하나의 프로세스만 가동하기 때문에 다른 작업을 할 수 없음
 * 
 * 왜 쓰레드라는 것을 만들었을까?
 * 하나의 작업을 동시에 수행하려고 할 때 여러 개의 프로세스를 띄워서 실행하면 각각 메모리를 할당해주어야 한다.
 * 그에 반해 쓰레드를 하나 추가하면 더 적은 메모리를 점유한다.
 * 
 * 어떤 작업을 할 때 단일 쓰레드로 실행하는 것보다는 다중 쓰레드로 실행하는 것이 시간이 더 적게 걸린다.
 *
 * 쓰레드를 생성하는 방법
 * 1. Thread 클래스를 상속 받아서 사용 = 확장
 * 2. Runnable 인터페이스를 사용하는 것 = 구현
 */
public class Thread01 extends Thread {

	@Override
	public void run() {
		System.out.println("쓰레드 시작");
	}

	public static void main(String[] args) {
		Thread01 th = new Thread01();
		th.start();
	}

}
