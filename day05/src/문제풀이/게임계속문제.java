package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 게임계속문제 {

	public static void main(String[] args) {
		// 2. 게임을 계속하시겠습니까? (0: 계속, 1: 종료)
		// 무한루프 사용
		// 첫번째 사람 숫자를 입력: 20
		// 두번째 사람 숫자를 입력: 10
		// 첫번째 사람 승! // 더 큰 숫자를 낸 사람이 승리!
		// 종료이면 게임을 stop!

		while (true) { // 무한루프
			String data = JOptionPane.showInputDialog("계속 하실래요? (0:계속, 1:종료)"); // 게임 진행 여부를 묻는 창
			int data2 = Integer.parseInt(data); // 입력값의 정수 변환
			if (data2 == 1) { // 입력값이 1. 종료라면
				JOptionPane.showMessageDialog(null, "게임을 중지합니다."); // 종료 메세지창
				break; // 프로그램 종료
			} else { // 입력값이 1. 종료가 아닌 0. 계속이라면
				JOptionPane.showMessageDialog(null, "게임을 계속합니다."); // 게임 진행 메세지창

				while (true) { // 무승부 무한루프. //여기서 true가 아닌 false라면 계속 무한 루프가 되기 때문
					// 게임구현해주세요.!
					String first = JOptionPane.showInputDialog("첫번째 사람 숫자를 입력해주세요.");
					// 첫번째 사람의 숫자 입력창
					String second = JOptionPane.showInputDialog("두번째 사람 숫자를 입력해주세요.");
					// 두번째 사람의 숫자 입력창
					int first2 = Integer.parseInt(first); // 첫번째 입력값의 정수 변환
					int second2 = Integer.parseInt(second); // 두번째 입력값의 정수 변환

					if (first2 > second2) { // 첫번째 입력값이 두번째 입력값보다 크다면
						JOptionPane.showMessageDialog(null, "첫번째 사람 승!"); // 첫번째 승리 메세지창
						System.exit(0); // 프로그램 종료
					} else if (second2 > first2) { // 두번째 입력값이 첫번째 입력값보다 크다면
						JOptionPane.showMessageDialog(null, "두번째 사람이 승!"); // 두번째 승리 메세지창
						System.exit(0); // 프로그램 종료
					} else { // 그외의 수, 무승부라면
						JOptionPane.showMessageDialog(null, "무승부"); // 무승부 메세지창
						JOptionPane.showMessageDialog(null, "숫자를 다시 입력해주세요"); // 숫자를 입력 요구 메세지창
						// 숫자를 입력하는 부분으로 돌아가려면 while문을 그 바로 위에 생성해주기.
					}

				}

			}

		}

	}

}
