package 순차문;

import javax.swing.JOptionPane; // 같은 패키지 안에서가 아니라면 경로를 붙여준다. 경로를 붙여주면 길어지기 때문에 import를 해주는 것

public class 입력연습3 {

	public static void main(String[] args) {
		// 오늘은 무슨 요일인가요? 목요일
		// 오늘의 날씨는 어떤가요? 더워요
		// 출력은 목요일은 더워요
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String weather = JOptionPane.showInputDialog("오늘은 날씨는 어떤가요?");
		JOptionPane.showMessageDialog(null, day + "은 " + weather);

	}

}
