package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽clone {

	public static void main(String[] args) {
		JFrame f = new JFrame("영화예매시스템"); // 창 f 생성 부품
		f.setSize(570, 730); // 창 사이즈 설정

		FlowLayout flow = new FlowLayout(); // 버튼 순서대로 해주는 부품 선언
		f.setLayout(flow); // 정렬을 하라고 flow에게 명령

		int[] seat = new int[200]; // 좌석버튼을 위해 200개 배열을 위한 변수 선언
		for (int i = 0; i < 200; i++) { // 버튼 200개
			JButton b1 = new JButton(i + 1 + ""); // 좌석 버튼 생성 부품
			b1.addActionListener(new ActionListener() { // 버튼 반응

				@Override
				public void actionPerformed(ActionEvent e) { // 버튼을 누를 때마다 나타는 반응
					String s = e.getActionCommand(); // 액션 String으로 받아오기
					int index = Integer.parseInt(s); // 받아온 String, int로 변환. index에 넣기 위해
					seat[index] = 1; // 선택된 버튼(인덱스)을 1로
					JOptionPane.showMessageDialog(f, index + "번 좌석 선택"); // 좌석 선택 알림창
					b1.setEnabled(false); // 이미 선택된 좌석 다시 선택 못하게
					b1.setBackground(Color.black); // 선택된 좌석 색깔 검은색으로
				}
			});
			f.add(b1); // 창 f에 버튼 더하기
		}

		JButton b2 = new JButton("예매 선택 완료"); // 결제 버튼 생성 부품
		b2.addActionListener(new ActionListener() { // 버튼 반응

			@Override
			public void actionPerformed(ActionEvent e) { // 버튼을 누를 때마다 나타나는 반응
				int count = 0; // 카운트 초기화
				final int MONEY = 10000; // 좌석값 변수 고정
				for (int i = 0; i < seat.length; i++) { // 선택된 좌석 카운트 위한 반복문
					if (seat[i] == 1) { // 좌석이 선택되었을 때
						count++; // 카운트
					}
				}
				
				String sum = ""; // 공백. null과 같은 개념이지만 나중에 결합할 때를 위해 ""
				for (int i = 0; i < seat.length; i++) { // 선택된 좌석 리스트를 위한 반복문
					if (seat[i] == 1) { // 좌석이 선택되었을 때
						sum = sum + i + "번 "; // 좌석 번호를 위한 변수 선언
					}
				}
				JOptionPane.showMessageDialog(f, "선택 좌석: " + sum); // 선택 좌석 리스트 알림창
				
				int total = (count * MONEY); // 총 금액 산출
				String vip = JOptionPane.showInputDialog(f, "VIP 회원이십니까? 회원이면 1번, 아니면 2번을 입력해주세요"); // 회원 여부 창
				int vip2 = Integer.parseInt(vip); // 회원 여부 String에서 int로 변환
				if (vip2 == 1) { // 회원이라 입력 받았을 때
					String id = JOptionPane.showInputDialog(f, "아이디를 입력해주세요."); // 아이디 입력창
					String pw = JOptionPane.showInputDialog(f, "패스워드를 입력해주세요."); // 패스워드 입력창
					String id2 = "root"; // 아이디
					String pw2 = "pass"; // 패스워드
					if (id.equals(id2) && pw.equals(pw2)) { // 아이디와 패스워드가 일치할 때
						JOptionPane.showMessageDialog(f, "로그인 되었습니다."); //로그인 알림창
						int discount = total / 5 * 4; // 할인 금액 산출
						JOptionPane.showMessageDialog(f, "총 결제 금액은 " + discount + "원입니다."); // 할인 금액 알림창
					} else { // 아이디와 패스워드가 일치하지 않을 때
						JOptionPane.showMessageDialog(f, "회원이 아닙니다."); // 비회원 알림창
						JOptionPane.showMessageDialog(f, "총 결제 금액은 " + total + "원입니다."); // 할인 전 총 금액 알림창
					}
				} else if (vip2 == 2) { // 비회원이라 입력 받았을 때
					JOptionPane.showMessageDialog(f, "총 결제 금액은 " + total + "원입니다."); // 할인 전 총 금액 알림창
				} else { // 회원 비회원 입력이 아닐 때
					JOptionPane.showMessageDialog(f, "회원 여부를 확인해주세요."); // 회원 여부 확인 알림창
				}
			}
		});
		b2.setBackground(Color.gray); // 버튼 배경색 회색으로
		f.add(b2); // 창 f에 버튼 더하기
		f.setVisible(true); // 창 f에 보이도록
	} // main
} // class
