package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 버튼3개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개"); // f값 프레임 부품 // JFrame에 string도 넣을 수 있음. 제목같은
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 500); // f값의 프레임 사이즈 설정
		f.getContentPane().setLayout(null); // 레이아웃을 지정하지 않으면 내가 넣고 싶은 위치에 넣을 수 있다.
		
		JButton btnNewButton = new JButton("별10개");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) { // 0부터 9까지 1씩 증가 반복문
					System.out.print("*"); // 줄 바꾸지 않고 출력
				}
				System.out.println(); // 줄바꿈
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 35));
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(115, 81, 250, 63);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("커피*5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) { // 0부터 4까지 1씩 증가 반복문
					System.out.print("커피*"); // 줄 바꾸지 않고 출력
				}
				System.out.println(); // 줄바꿈
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 35));
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setBounds(115, 165, 250, 63);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("커피*우유3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) { // 0부터 2까지 1씩 증가 반복문
					System.out.println("커피*우유"); // 출력
				}
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 35));
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setBounds(115, 248, 250, 63);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("1.짱!");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i < 4; i++) { // 1부터 3까지 1씩 증가 반복문
					System.out.println(i + " : 짱!"); // 출력
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("굴림", Font.BOLD, 35));
		btnNewButton_2_1.setBackground(Color.PINK);
		btnNewButton_2_1.setBounds(115, 331, 250, 63);
		f.getContentPane().add(btnNewButton_2_1);
		f.setVisible(true); // f값 프레임이 보이게 설정
	}
}
