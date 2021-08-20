package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {
	public void open3(String m) { 
		JFrame f = new JFrame("로그인 되었습니다.");
		f.setLocationRelativeTo(null); // 창 가운데에 띄우기
		f.setSize(100, 100);
		JButton b1 = new JButton(m);
		f.add(b1);
		b1.setBackground(Color.green);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 우측 상단에 x 누르면 닫히는 기능
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "창을 닫습니다.");
				//System.exit(0); // 프로그램 종료 방법 1
				f.dispose(); // 프로그램 종료 방법 2 - 이 프레임만 닫힘
			}
		});
		f.setVisible(true);
	}

}
