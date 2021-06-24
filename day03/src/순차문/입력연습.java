package 순차문;

import javax.swing.JOptionPane; // 같은 패키지 안에서가 아니라면 경로를 붙여준다. 경로를 붙여주면 길어지기 때문에 import를 해주는 것

public class 입력연습 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요."); // string name = 이 없다면 입력한 이름이 RAM에 저장이 되었을 뿐.
		System.out.println(name + "님 안녕히가세요.");
		
		// 당신이 있는 강의실 호수는?
		// 당신은 709호에 있습니다.
		String unit = JOptionPane.showInputDialog("당신이 있는 강의실 호수는?");
		System.out.println("당신은 " + unit + "호에 있습니다.");
		
		// 당신의 점심 메뉴는?
		// 당신은 자장면을 먹는군요.
		String lunch = JOptionPane.showInputDialog("당신의 점심 메뉴는?");
		System.out.println("당신은 " + lunch + "을/를 먹는군요.");


	}

}
