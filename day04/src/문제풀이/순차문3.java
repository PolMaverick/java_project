package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		// 숫자1입력: 333
		// 숫자2입력: 222
		// 두 숫자를 정수로 변환해서
		// 더하기의 결과 출력
		// 빼기의 결과 출력
		
		// 순서: 숫자 1과 2의 입력 창 생성(jop.input) - 스트링 nb 선언 - 스트링을 int로 변환(inte.parse) - int로 innb 선언 - 더하기와 빼기 산술 - int로 result 선언 - 출력
		
		String nb1 = JOptionPane.showInputDialog("숫자 1 입력"); // 입력창 생성 후 숫자 1 스트링 선언
		String nb2 = JOptionPane.showInputDialog("숫자 2 입력"); // 입력착 생성 후 숫자 2 스트링 선언
		
		int innb1 = Integer.parseInt(nb1); // 스트링 nb1을 int로 변환
		int innb2 = Integer.parseInt(nb2); // 스트링 nb2를 int로 변환
		
		int result = (innb1 + innb2); // int 1과 2의 더하기값
		int result2 = (innb1 - innb2); // int 1과 2의 빼기값
		
		System.out.println("숫자 1과 숫자 2를 더하면 " + result + " 입니다."); // result의 출력
		System.out.println("숫자 1과 숫자 2를 뻬면 " + result2 + " 입니다."); // result2의 출력
		
	} // main

} // class // 마지막에 두개의 }가 있는지 확인하고 }뒤에 main, class 주석 달아주기
