package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	private JTextField nameTF, heightTF, weightTF;
	private JButton resultBtn, deleteBtn;
	private JLabel resultLb;
	
	public MyFrame() {
		setLayout(new GridLayout(5, 1));

		JPanel nameP = new JPanel();
		nameP.setLayout(new GridLayout(1, 2));
		nameP.add(new JLabel("이름"));
		nameTF = new JTextField();
		nameP.add(nameTF);
		add(nameP);
		
		JPanel heightP = new JPanel();
		heightP.setLayout(new GridLayout(1, 2));
		heightP.add(new JLabel("키"));
		heightTF = new JTextField();
		heightP.add(heightTF);
		add(heightP);
		
		JPanel weightP = new JPanel();
		weightP.setLayout(new GridLayout(1, 2));
		weightP.add(new JLabel("몸무게"));
		weightTF = new JTextField();
		weightP.add(weightTF);
		add(weightP);
		
		JPanel buttonP = new JPanel();
		buttonP.setLayout(new GridLayout(1, 2));
		deleteBtn = new JButton("초기화");
		resultBtn = new JButton("결과");
		buttonP.add(deleteBtn);
		buttonP.add(resultBtn);
		add(buttonP);
		
		JPanel resultP = new JPanel();
		resultLb = new JLabel("결과값 출력");
		resultP.add(resultLb);
		add(resultP);
		
		// 이벤트 리스너
		// 초기화 버튼
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nameTF.setText("");
				heightTF.setText("");
				weightTF.setText("");
			}
		});	// 초기화 리스너 끝
		
		// 결과값 버튼
		resultBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameTF.getText();
				double height = Double.parseDouble(heightTF.getText());
				double weight = Double.parseDouble(weightTF.getText());
				
				// 연산
	            // 표준체중(kg) = (현재신장cm - 100) X 0.9
	            // 비만도(%) = (현재체중 ÷표준체중) X 100
				
				double stdWeight = (height - 100) * 0.9;
				double bmi = (weight / stdWeight) * 100;
				
				if(bmi > 120) {
					resultLb.setText(name + "님은 비만 입니다.");
				} else if(bmi < 80) {
					resultLb.setText(name + "님은 저체중 입니다.");
				} else {
					resultLb.setText(name + "님은 정상 입니다.");
				}
				
				
			}
		});	// 결과값 리스너 끝
	}
	
}

public class GUIbmi {
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setSize(300, 300);
		frame.setTitle("비만도 계산 프로그램");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
