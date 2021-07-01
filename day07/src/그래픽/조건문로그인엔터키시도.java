package 그래픽;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 조건문로그인엔터키시도 {
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
		
		t2.addKeyListener(new KeyAdapter() { // 엔터 이벤트 코드
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				//System.out.println(arg0.getKeyChar());
				int key = arg0.getKeyCode();
				if(key == KeyEvent.VK_ENTER) { // 동작을 실행시켜야 하는데 어떻게?
					String s1 = t1.getText();
					String s2 = t2.getText();
					System.out.println(s1);
					System.out.println(s2);
//				if (.equals() && .equals()) { // equals로 연결을 어떻게 해야 하는지?
//						 					  // 로그인 확인, b1과 연결을 어떻게 해야 하는지? 
//					} else {
//						
//					}
				}
			}
		});
		
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
