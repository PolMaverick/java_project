package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		// 반복은 유한으로 할 것인지(for문) 무한으로 할것인지(while문)
		while (true) { // 네이버 서버나 카톡같이 무한 루프로 돌아갈 때. 유한 루프로 만들어 줄때 시작점, 조건, 증감을 넣어주면 된다
			System.out.println("나는 계속 돌아요.");
			String q = JOptionPane.showInputDialog("중단하실래요x");
			if (q.equals("x")) {
				// break;
				System.exit(0); 
			}
		}

	}

}
 