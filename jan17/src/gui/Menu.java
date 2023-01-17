package gui;

import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Menu {
	JFrame jf = new JFrame("메뉴 만들어보기");
	JTextArea textArea = new JTextArea("입력하세요", 5, 10);
	JScrollPane jScrollPane = new JScrollPane(textArea);
	
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu helpMenu = new JMenu("Help");
	
	// 생성자
	public Menu() {
		fileMenu.add(new JMenuItem("새 파일 열기"));
		fileMenu.getItem(0).setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK));
		fileMenu.add(new JMenuItem("저장하기"));
		fileMenu.add(new JMenuItem("다른 이름으로"));
		fileMenu.addSeparator();	// 구분선
		fileMenu.add(new JMenuItem("종료"));
		
		helpMenu.add(new JMenuItem("이 프로그램은"));
		helpMenu.add(new JMenuItem("만든 사람"));
		
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		
		jf.setJMenuBar(menuBar);
		jf.add(jScrollPane, "Center");
		
		jf.setSize(300, 600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Menu();
	}
}
