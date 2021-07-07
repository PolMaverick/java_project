package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("영화예매 그래픽버전");
		f.setSize(570, 730);

		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200]; // {0, 0, 0,...} for문 안에 배열이나 누적은 초기화가 되니 넣으면 안됨!!!!!
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i + 1 + ""); // 또는 String.valueOf(0); //jbutton 안에는 스트링만 가능. int 불가. 1) (0 + ""); 2) 스트링을 인트로 바꿔준다. String.valueOf(0);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					int index = Integer.parseInt(s); // 타입 맞춰주는 작업
					seat[index] = 1; // []안은 int만 가능한데 s는 string이기 때문에 타입에러가 발생. 윗줄에 s를 int로 바꿔주기.
					JOptionPane.showMessageDialog(f, index + "번 선택됨.");
					// 버튼을 비활성화!!!
					b.setEnabled(false);
					b.setBackground(Color.red);
				}
			});
			f.add(b);
		}
		// 결제하기 버튼을 누르면
		// 1) 배열 안에 1이 몇개인지 세서 - count 위치를 어디에?
		// 2) 금액 10000원씩 계산 후에
		// 3) 결제금액 알려주세요.
		// 4) 몇번 좌석을 예약했는지 출력
		
		JButton b2 = new JButton("<<<<<< 결제하기 >>>>>>");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 배열의 1을 찾아서 개수를 세라.
				// 2. 개수 곱하기 10000원을 해서 금액을 구해라.
				// 3. 출력
				int count = 0; // count 변수를 버튼 밖으로 빼면 인식을 못함
				final int MONEY = 10000;
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
					}
				}
				// 1로 예약된 자리가 어디인지 누적. 많이 사용하는 방법!!!!!!!!!
				String sum = ""; // ""는 공백을 넣어준다는 의미, null과 같은 개념이지만 나중에 결합할 때 null+i+"번'으로 출력이 되기 때문에 ""로 대체
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						sum = sum + i +"번 "; // 선택된 좌석이 누적되는 과정!!!!!!!!!!!!!!!!! 추후 스플릿할 예정이라면 감안해서 ,같은 기호를 넣어준다.
					}
				}
				int payment = (count * MONEY);
				JOptionPane.showMessageDialog(f, "선택된 좌석: " + sum);
				JOptionPane.showMessageDialog(f, "총 결제금액은 " + payment + "원입니다.");
			}
		});
		b2.setBackground(Color.yellow);
		f.add(b2);
		
		f.setVisible(true);

	}

}
// getSource() 주소를 가져오고 싶을 때