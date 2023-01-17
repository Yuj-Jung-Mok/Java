package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOption extends JFrame {

	public JOption() {
		super("JOption 사용 예제");
		JOptionPane.showConfirmDialog(this, "성공했습니다");
		System.out.println(JOptionPane.showConfirmDialog(this, "선택하세요"));
		//Y = 0, N = 1, 취소 = 2
		System.out.println(JOptionPane.showConfirmDialog(this, "name : "));
		
		setSize(300, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JOption();
	}
	
}
