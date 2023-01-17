package gui;

import java.awt.Button;
import java.awt.Frame;

// GUI : 그래픽 유저 인터페이스
// CLI : 커맨드 라인 인터페이스

/*
 * AWT 	 :  실행 운영체제의 특징을 따라 화면을 구성합니다.
 * 		    운영체제마다 다른 화면
 * 			Button
 * 
 * SWING :  자바 영역에서 사용하는 look and feel을 적용하여
 * 			모든 운영 체제가 같은 모습을 가지게 함
 * 			JButton
 * 
 * FX	 :	RIA를 디자인하고 만들어 테스트, 디버그, 배포까지 가능한 
 * 			일련의 그래픽과 미디어의 통합 패키지
 * 
 * 용어
 * 
 * Container 컨테이너	  :	자바에서 창 역할
 * 							1개 이상의 컨테이너 위에 컨테이너가 올라가서 화면 구성을 합니다.
 * 							frame, window, panel, dialog, applet
 * 
 * Component 컴포넌트	  :	실제로 컨테이너 위에 올려져
 * 							화면 구성을 담당합니다.
 * 							Button, TextField, TextArea, List
 * 
 * LayoutManager 레이아웃 :	컴포넌트의 자리 배치 방법
 * 							FlowLayout, BoardLayout, GridLayout ... 
 * 
 * 상속을 받을 때는 많이 사용하는 요소를 상속 받는 것이 좋습니다.
 * 화면 생성은 프로그램 초기에 이뤄져야 하므로 주로 생성자에서 작업합니다.
 * 
 * = 지금까지 배웠던거 다 나옵니다.
 * 
 * Container 위에 Component 추가할 때
 * 컨테이너.add(컴포넌트)
 * 
 * 크기 지정
 * 프레임.setSize(int x, int y)
 * 
 * 컨테이너 보이기
 * 프레임.visible(true);
 */

public class GUI01 {
	Frame frame = new Frame("프레임");
	Button button = new Button("클릭해주세요");
	
	public void createFrame() {
		frame.add(button);			// 버튼을 프레임에 붙이기
		frame.setSize(300, 600);	// 크기 지정 가로, 세로
		frame.setVisible(true);		// 화면에 보여주기
	}
	
	public static void main(String[] args) {
		GUI01 gui01 = new GUI01();
		gui01.createFrame();
	}
	
}
