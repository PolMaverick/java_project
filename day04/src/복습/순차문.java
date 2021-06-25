package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 순차문은 입력 -> 처리 -> 출력의 순서
		// 1. 입력 JOptionPane과 swing까지 배움. 자동완성을 하지 않으면 import가 불가하다. 자동완성하는 습관들이기. 클릭하고 F2를 누르면 문제해결을 도와줌.
		// 모든 입력데이터는 컴퓨터는 스트링으로 읽어온다!
		// 숫자로 쓸지, 스트링 그대로 쓸지는 프로그래머가 판단한다.
		// 숫자로 써야 한다면 숫자로 변환하는 처리(함수)를 해줘야 한다.
		// 변환하는 처리 기능을 가진 부품을 찾아서 쓰면 된다. (많이 쓰이기에 망치처럼 사용)
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요"); // 함수(function)를 통해 명령어를 내리고 처리한다. 명령어는 CPU가 내리고 저장은 RAM에 한다.
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요"); // 입력되는 숫자가 계산용인지 비계산용인지 구분이 되지 않기에 모두 string으로 보관. 기본데이터만 산술이 가능하기 때문에 string은 산술 불가.

		// 2. 처리
		String result = today + "은 " + temp + "도"; // +는 string에서는 결합의 의미, 숫자에서는 연산의 의미. 1.선언 2. 대입 3. 결합하는 공간.
		
		// 3. 출력
		System.out.println(result); // result도 자동완성 가능.
		
		// temp - 1 // temp를 string으로 처리하기 때문에 산술 불가. 부품을 사용해야 한다.
	} // main

} // class // 마지막에 두개의 }가 있는지 확인하고 }뒤에 main, class 주석 달아주기
