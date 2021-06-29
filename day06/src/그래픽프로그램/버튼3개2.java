package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개"); // f값 프레임 부품 // JFrame에 string도 넣을 수 있음. 제목같은
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 500); // f값의 프레임 사이즈 설정
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(12, 10, 460, 163);
		f.getContentPane().add(b);
		
		JLabel m = new JLabel("");
		m.setBounds(12, 183, 460, 268);
		f.getContentPane().add(m);
		
		ImageIcon base = new ImageIcon("base.png");
		ImageIcon basket = new ImageIcon("basket.png");
		b.setIcon(base);
		m.setIcon(basket);
		
		
		f.setVisible(true); // f값 프레임이 보이게 설정
	}
}
