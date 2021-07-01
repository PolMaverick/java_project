package 문제풀이;

import javax.swing.JOptionPane;

public class 인기투표 {

	public static void main(String[] args) {
		int baseball = 0, soccer = 0, basketball = 0; // 변수값 초기화
		
		for (int i = 0; i < 10; i++) {
			JOptionPane.showMessageDialog(null, "가장 좋아하는 스포츠는 무엇입니까?");
			String result1 = JOptionPane.showInputDialog("야구는 1번, 축구는 2번, 농구는 3번을 적어주세요.");
			switch (result1) {
			case "1":
				baseball++;
				break;
			case "2":
				soccer++;
				break;
			case "3":
				basketball++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1, 2, 3번 중에 선택해 주세요");
				i--;
				break;
			} // switch
		} // for문
		System.out.println("야구를 좋아하는 사람: " + baseball + "명");
		System.out.println("축구를 좋아하는 사람: " + soccer + "명");
		System.out.println("농구를 좋아하는 사람: " + basketball + "명");

	} // main

} // class
