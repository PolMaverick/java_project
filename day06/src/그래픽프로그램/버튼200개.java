package 그래픽프로그램;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼200개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나는 버튼 200개");
		f.setSize(800, 800);
		FlowLayout flow = new FlowLayout(); // RAM에 저장만 된 상황.
		f.setLayout(flow); // f에 순서대로 붙도록 한다.
		for (int i = 1; i < 251; i++) { // 반복문(for문) 이용해 자동 생성되게 한다.
			JButton b1 = new JButton(i + "번"); // i값은 자동증감되니까
			f.add(b1); // 버튼을 판에 올린다는 개념
		}
		f.setVisible(true);

	}

}
