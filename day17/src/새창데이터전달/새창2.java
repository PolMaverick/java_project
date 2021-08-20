package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창2 {
	public void open2(String m) { // w2.open2의 문자를 변수 string m에 저장해줘서 넣기
		JFrame f = new JFrame(m+ " 뜨는 화면!!");
		f.setSize(800, 1000);
		JButton b1 = new JButton("새창2버튼 화면 닫기");
		f.add(b1);
		b1.setBackground(Color.green);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 우측 상단에 x 누르면 닫히는 기능
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창2을 닫습니다.");
				//System.exit(0); // 프로그램 종료 방법 1
				f.dispose(); // 프로그램 종료 방법 2 - 이 프레임만 닫힘
			}
		});
		f.setVisible(true);
	}

}
