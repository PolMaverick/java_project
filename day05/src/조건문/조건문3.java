package 조건문;

import javax.swing.JOptionPane;

public class 조건문3 {

	public static void main(String[] args) {
		// ++, --; 증감연산자, RAM의 변수 값을 1씩 감소/증가 시켜주는 것 처리
		// for (시작값, 조건식; 증감식)
		for (int i = 0; i < 3; i++) {
		// for (int i = 0; i < 3; i=i+1)
			
			// 1. 입력
			// 데이터를 입력 받아서 처리해보세요.!
			String data = JOptionPane.showInputDialog("당신의 점수를 입력하세요.");
			int grade = Integer.parseInt(data);
			
			// 2. 처리
			String result = null;
			
			if (grade >= 90) {
				result = "A학점";
			}else if (grade >= 80) {
				result = "B학점";
			}else if (grade >= 70) {
				result = "C학점";
			}else {
				result = "F학점";
			}
			
			// 3. 출력
			System.out.println("당신의 학점은 " + result + " 입니다.");
		} // for

	} // main

} // class
