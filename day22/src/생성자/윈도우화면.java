package 생성자;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame("생성자 테스트");
		f.setSize(300, 300);
		JButton b = new JButton("나는 버튼");
		f.add(b);
		
		JButton b2 = new JButton("나는 버튼2");
		f.add(b2);
		
		Font font = new Font("궁서체", Font.BOLD, 50);
		b.setFont(font);
		b2.setFont(font);
		
//		b.setFont(new Font("궁서체", Font.BOLD, 50)); // 위와 아래 모두 똑같다. font라는 주소가 들어간 것이고 값이 new Font("궁서체", Font.BOLD, 50)이기 때문
		b.setFont(new Font("굴림체", Font.BOLD, 50)); // 이번에만 굴림체로 해주는 방법
		
		
		f.setVisible(true);
		
	}

}
