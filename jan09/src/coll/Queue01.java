package coll;

import java.util.LinkedList;
import java.util.Queue;

// (p770)
// 카톡

class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
}

public class Queue01 {

	public static void main(String[] args) {
		// Queue는 인터페이스라서 객체 생성 불가하므로 상속 받는 클래스 객체 생성하여 사용중
		Queue<Message> messagesQueue = new LinkedList<Message>(); 
		
		messagesQueue.offer(new Message("Send Mail", "홍길동"));
		messagesQueue.offer(new Message("Send SMS", "신용권"));
		messagesQueue.offer(new Message("Send KakaoTalk", "홍두깨"));
		
		while(!messagesQueue.isEmpty()) {
			Message msg = messagesQueue.poll();
			
			switch (msg.command) {
				case "Send Mail":
					System.out.println(msg.to + "님에게 메일을 보냅니다.");
				break;
					
				case "Send SMS":
					System.out.println(msg.to + "님에게 문자를 보냅니다.");
				break;
					
				case "Send KakaoTalk":
					System.out.println(msg.to + "님에게 카카오톡을 보냅니다.");
				break;
			
			}	// switch
			
		}	// while
		
	}	// main
	
}
