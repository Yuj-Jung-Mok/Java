package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI02 {
	JFrame frame = new JFrame("프레임");
	JButton button = new JButton("클릭");
	
	public void createJFrame() {
		frame.add(button);
		frame.setSize(300, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		GUI02 gui02 = new GUI02();
		gui02.createJFrame();
	}
}
