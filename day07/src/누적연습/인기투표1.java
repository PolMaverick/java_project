package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {
		int yes = 0, no = 0; // 자바에선 같은 형식일때 이렇게도 가능. 따로도 가능
		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배가 고픈가요? (배고프면 1, 안고프면 2)");
			
			switch (reply) {
			case "1":
				yes++; // yes 값을 늘려줘
				break;
			case "2":
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1, 2 중에서 선택해주세요.1");
				i--; // 취소의 의미. 보정작업
				break;
			}
		} // for
		System.out.println("배고픈 사람: " + yes + "명");
		System.out.println("안고픈 사람: " + no + "명");

	}

}
