package gui.component;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// Grid
// 행과 열을 설정할 수 있음. 컴포넌트가 없음.

public class Layout03 {
	JFrame jf = new JFrame("이번에는 그리드 레이아웃");
	JButton[] jb01 = new JButton[30];
	
	public Layout03() {
		jf.setLayout(new GridLayout(15, 2));
		Container container = jf.getContentPane();
		for(int i = 0; i < jb01.length; i++) {
			jb01[i] = new JButton();
			container.add(jb01[i]);
		}
		
		jf.setSize(300, 600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Layout03();
	}
	
}
