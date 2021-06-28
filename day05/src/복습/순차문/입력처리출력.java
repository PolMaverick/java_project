package 복습.순차문;

import javax.swing.JOptionPane;

public class 입력처리출력 {

	public static void main(String[] args) { // main + ctrl + space bar = main 생성
		// 1. 입력 (타이핑 뿐만이 아니라 데이터를 가져오는 것도 입력이다.)
		String hobby = JOptionPane.showInputDialog("당신의 취미는?"); // 부품(class)만 대문자. // 자동완성에서 명령어 끝에 string이 있다. string으로 입력하라는 의미.
		String when = JOptionPane.showInputDialog("언제하시나요?"); // when은 많은 문법에서는 도구로 쓰이는데 자바에서는 쓰이지 않아서 변수로 사용 가능.
		String time = JOptionPane.showInputDialog("몇시간이나 하시나요?");
		
		// 2. 처리 - 출력보단 변수에 넣어두는 것이 호용이 더 크다
		String result = (when + "에 " + hobby + "을/를 하시는군요.");
		// string을 int로 변환해주는 처리. 기본형이 아니기 때문에 부품을 사용하여 변환해야 한다. Integer.parseInt()
		int time2 = Integer.parseInt(time);

		
		// 3. 출력
		// System.out.println(result);
		JOptionPane.showMessageDialog(null, result); // 변수에 저장할 것이 없기 때문에 변수 선언을 하면 에러가 뜬다. 자동완성에서 명령어 끝에 void가 있으면 저장할 것이 '없다'는 뜻.
		if (time2 >= 3) { // 비교연산자의 결과는 항상 boolean(논리데이터, true/false)
			JOptionPane.showMessageDialog(null, hobby + "을/를 오래 하시군요.");
			// 조건이 true일 때 실행되는 부분
		} else {
			JOptionPane.showMessageDialog(null, hobby + "을/를 짧게 하시는군요.");
			// 조건이 false일 때 실행되는 부분
		}		
		
		
	}

}
