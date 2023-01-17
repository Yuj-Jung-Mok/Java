package jan17;

import java.util.ArrayList;
import java.util.List;

// 다중작업
// Thread 클래스를 상속하거나
// Runnable 인터페이스를 구현하는 방법

public class Thread04 implements Runnable{
	int seq;
	
	public Thread04(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println(seq + " Run start!");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(seq + " Run end...");
	}
	
	public static void main(String[] args) {
		System.out.println("main 시작");
		
		List<Thread> list = new ArrayList<Thread>();
		
		for(int i = 0; i < 20; i++) {
			Thread t = new Thread(new Thread04(i));
			t.start();
			list.add(t);
		}
		
		for(int i = 0; i < list.size(); i++) {
			Thread t = list.get(i);
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main 종료");
	}
	
}
