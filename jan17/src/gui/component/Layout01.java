package gui.component;

//Flow Layout : 컴포넌트들이 왼쪽에서 오른쪽으로 추가되는 형태
//컨테이너의 크기가 변겨오디면 컴포넌트 크기는 고정되고
//위치가 변합니다.

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout01 extends JFrame {
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");

	public Layout01() {
		super("최상단 제목은 여기에");
		this.setLayout(new FlowLayout());
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.setSize(300, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Layout01();
	}
}