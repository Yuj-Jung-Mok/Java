package gui.component;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//AWT -> OS에 맞춰서 움직이기 때문에 OS이미지를 가져옴 - 느림
//Swing -> JVM에서 이미지를 가져오기 때문에 빠름.JAVA에서 가져옴
//SWT = JavaFX -> 보다 짧고 효율적으로 그래픽을 사용하기 위해서 나옴
public class Layout04 {

   public static void main(String[] args) {
      JFrame jf = new JFrame();
      jf.setSize(800, 600); //사이즈
      jf.setTitle("최종 정리"); //타이틀
      
      //layout
      GridLayout gl = new GridLayout(3, 2, 10,10);
      jf.setLayout(gl);
      
      //jlabel : 글자만 사용할 수 있는 객체
      final JLabel jl = new JLabel("이름");
      jl.setText("이름은?");
      jf.add(jl);
      
      //button
      final JButton jb = new JButton();
      jb.setText("버튼");
      jf.add(jb);
      
      JFileChooser jfc = new JFileChooser();
      jf.add(jfc);
      
      final JTextField jtf = new JTextField();
      jf.add(jtf);
      
      //이벤트처리 : 이벤트가 일어나는 객체에 Listener를 지정해서 사용합니다.
      jb.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            jl.setText("버튼 누름");//만약 버튼이 눌렸으면 Jlabel에 이 글씨가 써짐
            jl.setForeground(Color.GRAY);//배경색 바꾸기
            jl.setBackground(Color.black);
            jb.setForeground(Color.CYAN);//버튼의 배경색 바꾸기
         }
      });
      
      JPanel jp = new JPanel();
      jp.setLayout(new GridLayout(1, 2));
      
      JButton jbtn = new JButton();
      jbtn.setText("버튼 두 개짜리");
      jp.add(jbtn);//버튼1
      
      jp.add(new JButton());//버튼2
      
      jf.add(jp);
      
      jf.setVisible(true);
      
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}