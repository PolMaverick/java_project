package 그래픽;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 조건문로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GRAY);
		f.setSize(400, 500);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("아이디:");
		l1.setFont(new Font("굴림", Font.BOLD, 22));
		l1.setBounds(24, 54, 127, 54);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("패스워드:");
		l2.setFont(new Font("굴림", Font.BOLD, 22));
		l2.setBounds(24, 148, 127, 54);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel();
		l3.setForeground(Color.RED);
		l3.setFont(new Font("굴림", Font.BOLD, 22));
		l3.setBounds(35, 372, 153, 54);
		f.getContentPane().add(l3);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 22));
		t1.setBackground(Color.PINK);
		t1.setBounds(163, 54, 209, 54);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 22));
		t2.setColumns(10);
		t2.setBackground(Color.PINK);
		t2.setBounds(163, 148, 209, 54);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("로그인 확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = "root";
				String pw = "1111";
				
				String id2 = t1.getText();
				String pw2 = t2.getText();
				
				if (id.equals(id2) && pw.equals(pw2)) {
					JOptionPane.showMessageDialog(f, "로그인이 되었습니다.");
				} else {
					l3.setText("로그인 실패");
				}
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 22));
		b1.setBackground(Color.CYAN);
		b1.setBounds(24, 248, 164, 85);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("지우기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 22));
		b2.setBackground(Color.CYAN);
		b2.setBounds(200, 248, 164, 85);
		f.getContentPane().add(b2);
		f.setVisible(true);
	}
	
}
