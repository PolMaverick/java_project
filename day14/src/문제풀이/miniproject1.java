package 문제풀이;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class miniproject1 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_5;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1400, 900);
		f.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("이름 *");
		name.setBounds(61, 50, 62, 30);
		f.getContentPane().add(name);
		
		textField = new JTextField();
		textField.setBounds(166, 38, 172, 42);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(166, 116, 172, 42);
		f.getContentPane().add(textField_1);
		
		JLabel name_1 = new JLabel("주민등록번호 *");
		name_1.setBounds(61, 121, 93, 30);
		f.getContentPane().add(name_1);
		
		JLabel name_2 = new JLabel("본인인증 *");
		name_2.setBounds(61, 194, 62, 30);
		f.getContentPane().add(name_2);
		
		JLabel name_3 = new JLabel("예약대상 백신");
		name_3.setBounds(61, 262, 93, 30);
		f.getContentPane().add(name_3);
		
		JLabel name_4 = new JLabel("예약대상자 구분");
		name_4.setBounds(61, 329, 103, 30);
		f.getContentPane().add(name_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(166, 389, 172, 42);
		f.getContentPane().add(textField_5);
		
		JLabel name_5 = new JLabel("휴대폰번호 *");
		name_5.setBounds(61, 394, 93, 30);
		f.getContentPane().add(name_5);
		
		JLabel name_6 = new JLabel("국민비서");
		name_6.setBounds(69, 458, 54, 22);
		f.getContentPane().add(name_6);
		
		JLabel name_6_1 = new JLabel("알림 선택 *");
		name_6_1.setBounds(62, 480, 75, 22);
		f.getContentPane().add(name_6_1);
		
		JLabel name_6_2 = new JLabel("의료기관 및");
		name_6_2.setBounds(68, 527, 86, 22);
		f.getContentPane().add(name_6_2);
		
		JLabel name_6_1_1 = new JLabel("예약일시 선택 *");
		name_6_1_1.setBounds(61, 549, 93, 22);
		f.getContentPane().add(name_6_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(392, 116, 172, 42);
		f.getContentPane().add(textField_2);
		
		JLabel name_7 = new JLabel("-");
		name_7.setBounds(363, 121, 18, 30);
		f.getContentPane().add(name_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("네이버앱");
		rdbtnNewRadioButton.setBounds(166, 458, 121, 23);
		f.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("카톡(카카오톡)");
		rdbtnNewRadioButton_1.setBounds(314, 458, 121, 23);
		f.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("토스(toss)");
		rdbtnNewRadioButton_2.setBounds(462, 458, 121, 23);
		f.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("문자메세지");
		rdbtnNewRadioButton_3.setBounds(610, 458, 121, 23);
		f.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("수신받지 않음");
		rdbtnNewRadioButton_4.setBounds(166, 483, 121, 23);
		f.getContentPane().add(rdbtnNewRadioButton_4);
		
		JLabel name_7_1 = new JLabel("-");
		name_7_1.setBounds(363, 394, 18, 30);
		f.getContentPane().add(name_7_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(392, 389, 172, 42);
		f.getContentPane().add(textField_3);
		
		JLabel name_7_2 = new JLabel("-");
		name_7_2.setBounds(586, 394, 18, 30);
		f.getContentPane().add(name_7_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(615, 389, 172, 42);
		f.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("의료기관 찾기");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(166, 527, 172, 44);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("예약");
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(611, 527, 164, 44);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("취소");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(800, 527, 98, 44);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("휴대폰 본인인증");
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setBounds(163, 176, 238, 67);
		f.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("아이핀(i-PIN) 본인인증");
		btnNewButton_3_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1.setBounds(413, 176, 238, 67);
		f.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("공동/금융 인증서 본인인증");
		btnNewButton_3_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3_2.setBounds(660, 176, 238, 67);
		f.getContentPane().add(btnNewButton_3_2);
		f.setVisible(true);

	}
}
