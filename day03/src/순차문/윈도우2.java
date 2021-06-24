package 순차문;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 윈도우2 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame(); // RAM에 선언만 한 상태
		f.setSize(500, 500); // 아직 세팅만 한 상태
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("HY강B", Font.PLAIN, 16));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저를 누르셨군요");
				JOptionPane.showMessageDialog(f, "저를 누르셨군요"); // (위치, 텍스트) 위치 지정을 하지 않으면 화면 가운데에 뜸.
			}
		});
		btnNewButton.setBounds(153, 93, 169, 55);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("또 누르셨군요");
				JOptionPane.showMessageDialog(f, "또 누르셨군요");
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBounds(153, 158, 169, 55);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 16));
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setBounds(121, 272, 249, 37);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(27, 278, 93, 25);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(27, 324, 93, 25);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 16));
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(121, 319, 249, 37);
		f.getContentPane().add(textField_1);
		
		
		f.setVisible(true); // 갤러그 게임 창 만들 때도 이렇게 생성. visible은 위의 설정들만 보여주기 때문에 맨 마지막에 위치해야!

				
	}
}
