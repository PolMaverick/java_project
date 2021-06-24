package 순차문;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame(); // RAM에 선언만 한 상태
		f.setSize(1000, 800); // 아직 세팅만 한 상태
		JButton b1 = new JButton();
		JButton b2 = new JButton(); // 벽돌을 2개 만들어 놓은 것. 이 상태에서는 만들어 놓기만 했기에 실행해도 나타나지 않음.
		b1.setText("나는 첫번째 버튼");
		b2.setText("나는 두번째 버튼");
		f.add(b1);
		f.add(b2);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setVisible(true); // 갤러그 게임 창 만들 때도 이렇게 생성. visible은 위의 설정들만 보여주기 때문에 맨 마지막에 위치해야!

				
	}

}
