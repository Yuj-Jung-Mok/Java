package gui.component;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout02 {

	JFrame frame = new JFrame("보더레이아웃");
	JButton jbtn1 = new JButton("버튼1");
	JButton jbtn2 = new JButton("버튼2");
	JButton jbtn3 = new JButton("버튼3");
	JButton jbtn4 = new JButton("버튼4");
	JButton jbtn5 = new JButton("버튼5");
	
	public Layout02() {
		frame.add(jbtn1, BorderLayout.NORTH);
		frame.add(jbtn2, BorderLayout.SOUTH);
		frame.add(jbtn3, BorderLayout.EAST);
		frame.add(jbtn4, BorderLayout.WEST);
		frame.add(jbtn5, BorderLayout.CENTER);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Layout02();
	}
	
}
