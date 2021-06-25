package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요");
		
		// 2. 처리
		int yes = 28; // 어제 온도
		// int temp2 = Integer.parseInt(temp); // ram에 넣고 봐라 (선언). int로 바꿔줘야 하니 int로 선언. '27도'라고 적으면 안된다. 실제로는 숫자만 쓰도록 안내 문구 있어야. 기본데이터만 캐스팅이 가능하고 부품은 캐스팅이 안된다
		double temp3 = Double.parseDouble(temp);
		
		// int result = yes - temp2;
		double result2 = yes - temp3;
		
		// 3. 출력
		// System.out.println(result + "도 차이가 나요.");
		System.out.println(result2 + "도 차이가 나요.");
		
	} // main

} // class // 마지막에 두개의 }가 있는지 확인하고 }뒤에 main, class 주석 달아주기
