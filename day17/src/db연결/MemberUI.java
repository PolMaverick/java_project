package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(37, 31, 115, 47);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(165, 29, 278, 51);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(37, 103, 115, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(165, 101, 278, 51);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_2.setBounds(37, 177, 115, 47);
		f.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 25));
		t3.setColumns(10);
		t3.setBounds(165, 175, 278, 51);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_3.setBounds(37, 248, 115, 47);
		f.getContentPane().add(lblNewLabel_3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 25));
		t4.setColumns(10);
		t4.setBounds(165, 246, 278, 51);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1-4에 입력된 값을 가지고 와야 함.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// member 테이블에 저장하려고 함.
				// -> 해결책. 우리가 원하는 기능을 가진 메서드를 가지고 있는 부품을 찾아야 함. 램에 가져다 놓으면 됨.
				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(id, pw, name, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입을 완료했습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "회원가입을 실패했습니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// 입력한거 지워버리자!
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton.setBounds(33, 330, 133, 102);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id 입력 받아야 함.
				String id = JOptionPane.showInputDialog("탈퇴할 ID를 입력하세요.");
				// db처리해야함.
				MemberDAO db = new MemberDAO();
				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "탈퇴를 완료했습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "탈퇴를 실패했습니다.");						
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton_1.setBounds(178, 330, 133, 102);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("회원님의 아이디를 입력해주세요.");
				String tel = JOptionPane.showInputDialog("수정하실 전화번호를 입력해주세요.");
				
				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(id, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "전화번호가 수정되었습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "아이디가 일치하지 않습니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton_2.setBounds(323, 330, 133, 102);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
