package 새창데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("main창 여기서 시작!");
//		f.setLocationRelativeTo(null); // 창 가운데에 띄우기???
		f.setSize(577, 678);
		Font font = new Font("궁서", Font.BOLD, 45);
		JButton b1 = new JButton("로그인 처리");
		b1.setBounds(122, 251, 328, 73);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id1 = "root";
				String pw1 = "pass";
				String id2 = t1.getText();
				String pw2 = t2.getText();
				if (id1.equals(id2) && pw1.equals(pw2)) { // if 조건문을 main2에 해도 되고 새창3에 해도 무방. 설계하기 나름
					새창3 w3 = new 새창3();
					w3.open3("완성");
				} else {
					JOptionPane.showMessageDialog(f, "아이디와 비밀번호가 다릅니다.");
				}
			}
		});
		JButton b2 = new JButton("결정");
		b2.setBounds(136, 508, 283, 73);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = t3.getText();
				int temp2 = Integer.parseInt(temp);
				if (temp2 > 30) { // if 조건문을 main2에 해도 되고 새창4에 해도 무방. 설계하기 나름
					새창4 w4 = new 새창4();
					w4.open4("폭염");
				} else {
					새창4 w4 = new 새창4();
					w4.open4("견딜만해요!");
				}
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		b1.setFont(font);
		b2.setFont(font);
		b1.setBackground(Color.green);
		b2.setBackground(Color.yellow);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(69, 73, 58, 45);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.BOLD, 30));
		lblPw.setBounds(69, 151, 58, 45);
		f.getContentPane().add(lblPw);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(160, 65, 247, 61);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(160, 143, 247, 61);
		f.getContentPane().add(t2);
		
		JLabel lblPw_1 = new JLabel("오늘의 온도");
		lblPw_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblPw_1.setBounds(69, 420, 177, 45);
		f.getContentPane().add(lblPw_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(248, 412, 159, 61);
		f.getContentPane().add(t3);
		
		f.setVisible(true);

	}
}
