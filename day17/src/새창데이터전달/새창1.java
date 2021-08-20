package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창1 {
	public void open1(String m) { // w1.open1의 문자를 변수 string m에 저장해줘서 넣기
		JFrame f = new JFrame("새창1화면");
		f.setSize(500, 500);
		JButton b1 = new JButton(m +" 새창1버튼 화면 닫기");
		f.add(b1);
		b1.setBackground(Color.pink);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 우측 상단에 x 누르면 닫히는 기능
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창1을 닫습니다.");
				//System.exit(0); // 프로그램 종료 방법 1
				f.dispose(); // 프로그램 종료 방법 2 - 이 프레임만 닫힘
			}
		});
		f.setVisible(true);
	}

}
