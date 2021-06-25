package 순차문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 정리문제2 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 334);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 21, 77, 39);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 83, 77, 39);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 26));
		t1.setBounds(98, 13, 174, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 26));
		t2.setColumns(10);
		t2.setBounds(98, 75, 174, 47);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nb1 = t1.getText(); // 숫자 1 입력값
				String nb2 = t2.getText(); // 숫자 2 입력값
				
				double nb3 = Double.parseDouble(nb1); // 숫자 1 실수 변환
				double nb4 = Double.parseDouble(nb2); // 숫자 2 실수 변환
				
				double add = (nb3 + nb4); // 실수 3과 4의 더하기
				System.out.println(add); // 더하기 출력
				
				JOptionPane.showMessageDialog(f, "숫자 1과 2의 더하기는 " + add + "입니다.");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(12, 152, 127, 57);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nb1 = t1.getText(); // 숫자 1 입력값
				String nb2 = t2.getText(); // 숫자 2 입력값
				
				double nb3 = Double.parseDouble(nb1); // 숫자 1 실수 변환
				double nb4 = Double.parseDouble(nb2); // 숫자 2 실수 변환
				
				double sub = (nb3 - nb4); // 실수 3과 4의 빼기
				System.out.println(sub); // 빼기 출력
				
				JOptionPane.showMessageDialog(f, "숫자 1과 2의 빼기는 " + sub + "입니다.");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(145, 152, 127, 57);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("곱하기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nb1 = t1.getText(); // 숫자 1 입력값
				String nb2 = t2.getText(); // 숫자 2 입력값
				
				double nb3 = Double.parseDouble(nb1); // 숫자 1 실수 변환
				double nb4 = Double.parseDouble(nb2); // 숫자 2 실수 변환
				
				double multi = (nb3 * nb4); // 실수 3과 4의 곱하기
				System.out.println(multi); // 곱하기 출력
				
				JOptionPane.showMessageDialog(f, "숫자 1과 2의 곱하기는 " + multi + "입니다.");
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_2.setBounds(12, 219, 127, 57);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("나누기");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nb1 = t1.getText(); // 숫자 1 입력값
				String nb2 = t2.getText(); // 숫자 2 입력값
				
				double nb3 = Double.parseDouble(nb1); // 숫자 1 실수 변환
				double nb4 = Double.parseDouble(nb2); // 숫자 2 실수 변환
				
				double div = (nb3 / nb4); // 실수 3과 4의 나누기
				System.out.println(div); // 나누기 출력
				
				JOptionPane.showMessageDialog(f, "숫자 1과 2의 나누기는 " + div + "입니다.");
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_3.setBounds(145, 219, 127, 57);
		f.getContentPane().add(btnNewButton_3);
		f.setVisible(true);
	}

}
