package 순차문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 정리문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 128, 0));
		f.setSize(400, 526);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 33, 115, 29);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 215, 0));
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(155, 26, 217, 45);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(165, 42, 42));
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(155, 159, 217, 45);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 166, 115, 29);
		f.getContentPane().add(lblNewLabel_1);
		
		t3 = new JTextField();
		t3.setBackground(new Color(0, 128, 128));
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setColumns(10);
		t3.setBounds(155, 284, 217, 45);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(12, 292, 115, 29);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t4 = new JTextField();
		t4.setBackground(new Color(0, 128, 128));
		t4.setFont(new Font("굴림", Font.BOLD, 20));
		t4.setColumns(10);
		t4.setBounds(155, 353, 217, 45);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel_1_2 = new JLabel("수학 점수");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(12, 360, 115, 29);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				// 버튼을 클릭했을 때 자동으로 이 함수가 실행
				// 버튼을 클릭했을 때 처리 내용을 넣으면 됨
				String s1 = t1.getText(); // 먹고 싶은 음식 입력값
				String s2 = "아메리카노";
				String s3 = "쥬스";
				String s4 = "블랙티";
				
				System.out.println(s1.equals(s2));  // 입력 값이 아메리카노와 같은지
				System.out.println(s1.equals(s3));  // 입력 값이 쥬스와 같은지
				System.out.println(s1.equals(s4));  // 입력 값이 블랙티와 같은지
				
				if (s1.equals(s2) || s1.equals(s3) || s1.equals(s4)) { // 아메리카노, 쥬스 , 블랙티 중 1
					JOptionPane.showMessageDialog(f, "카페로 가세요."); // T
				} else {
					JOptionPane.showMessageDialog(f, "레스토랑을 가세요."); // F
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 16));
		btnNewButton.setBounds(12, 84, 360, 45);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String age1 = t2.getText(); // 올해 나이 입력값
				int age2 = Integer.parseInt(age1); // 입력값 정수로 변환
				int age3 = (age2 + 1); // 내년 나이
				
				System.out.println(age3);
				
				JOptionPane.showMessageDialog(f, "나의 내년 나이는 " + age3 +"살 입니다.");
			}
		});
		btnNewButton_1.setBounds(12, 214, 360, 45);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("두과목 점수의 평균은?");
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String kr = t3.getText(); // 국어 점수 입력값
				String ma = t4.getText(); // 수학 점수 입력값
				
				double kr2 = Double.parseDouble(kr); // 국어 점수 실수로 변환
				double ma2 = Double.parseDouble(ma); // 수학 점수 실수로 변환
				double grade = (kr2 + ma2); // 국어 수학 점수 총합
				int count = 2; // 과목수
				
				double avg = grade / count; //국어 수학 평균 점수
				System.out.println(avg);

				JOptionPane.showMessageDialog(f, "두과목의 평균 점수는 " + avg + "점 입니다.");
			}
		});
		btnNewButton_1_1.setBounds(12, 420, 360, 45);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);
	}
}
