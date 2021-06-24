package 순차문;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		JFrame f = new JFrame(); // RAM에 선언만 한 상태
		f.getContentPane().setBackground(Color.GRAY);
		f.setSize(500, 500); // 아직 세팅만 한 상태
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나의 일기장");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(156, 27, 208, 70);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<<<<<<<<<<<<<<<<<<< 오늘의 일기작성을 시작합니다.>>>>>>>>>>>>>>>>>>>");
		lblNewLabel_1.setBounds(0, 121, 484, 32);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("번호");
		lblNewLabel_2.setBounds(10, 163, 31, 26);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("날짜");
		lblNewLabel_2_1.setBounds(10, 199, 31, 26);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("제목");
		lblNewLabel_2_2.setBounds(10, 235, 31, 26);
		f.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("내용");
		lblNewLabel_2_2_1.setBounds(10, 323, 31, 26);
		f.getContentPane().add(lblNewLabel_2_2_1);
		
		textField = new JTextField();
		textField.setText("번호를 입력하세요");
		textField.setBounds(48, 163, 406, 26);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("날짜를 입력하세요");
		textField_1.setColumns(10);
		textField_1.setBounds(48, 200, 406, 26);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("제목을 입력하세요");
		textField_2.setColumns(10);
		textField_2.setBounds(48, 238, 406, 26);
		f.getContentPane().add(textField_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("내용을 입력하세요");
		textArea.setBackground(Color.PINK);
		textArea.setBounds(48, 274, 406, 127);
		f.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.setBounds(58, 411, 114, 32);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.setBounds(191, 411, 114, 32);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("임시저장");
		btnNewButton_2.setBounds(329, 411, 114, 32);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true); // 갤러그 게임 창 만들 때도 이렇게 생성. visible은 위의 설정들만 보여주기 때문에 맨 마지막에 위치해야!

				
	}
}
