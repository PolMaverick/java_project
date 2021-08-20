package 파일시스템;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 그래픽일기장 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame("일기장");
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(600, 650);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("일기장");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel.setBounds(27, 26, 194, 52);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 날짜");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(27, 105, 194, 52);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 제목");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setBounds(27, 194, 194, 52);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("오늘의 내용");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_3.setBounds(27, 282, 194, 52);
		f.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(233, 99, 313, 66);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(233, 188, 313, 66);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setBounds(233, 279, 313, 192);
		f.getContentPane().add(t3);
		
		JButton b1 = new JButton("파일에 일기 저장");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String today = t1.getText();
					String title = t2.getText();
					String content = t3.getText();
					FileWriter file = new FileWriter(today + "의 일기.txt");
					file.write(today + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close();
					JOptionPane.showMessageDialog(f, "일기가 등록되었습니다.");
				} catch (IOException e1) {
					System.out.println("파일을 저장하는 동안 에러가 발생함");
				}
			}
		});
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setFont(new Font("굴림", Font.BOLD, 50));
		b1.setBounds(42, 496, 504, 84);
		f.getContentPane().add(b1);
		
		f.setVisible(true);
	}
}
