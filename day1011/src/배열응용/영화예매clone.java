package 배열응용;

import java.util.Scanner;

public class 영화예매clone {

	public static void main(String[] args) {
		int[] seat = new int[10]; // 배열10자리. 변수 seat 선언
		Scanner sc = new Scanner(System.in); // 입력값 복사 부품. 변수 sc 선언. RAM에  저장해야 하니까.
		int count = 0; // 횟수 시작점. 변수 count 선언
		final int MONEY = 10000; // 변하지 않는 고정값. 변수 money 선언
		
		while (true) { // 종료 명령어 전까지 예매 처리 과정 반복문
			// UI 만들기
			System.out.println("--------------------"); // UI
			for (int i = 0; i < 10; i++) { // 반복문. 인덱스(좌석번호) 설정
				System.out.print(i + " "); // 인덱스(좌석번호) 출력
			} // for
			System.out.println(); // UI
			System.out.println("--------------------"); // UI
			// 배열 만들기
			for (int i = 0; i < seat.length; i++) { // 반복문. 배열값(선택유무)
				System.out.print(seat[i] + " "); // 배열값(선택유무) 출력
			} // for
			// 예매값 입력 만들기
			System.out.println(); // UI
			System.out.print("원하시는 좌석번호를 입력하세요 (종료는 -1) >> "); // 인덱스(좌석번호) 입력값 받기
			int num = sc.nextInt(); // 입력값 변수 선언
			if (num == -1) { // if문 시스템 종료 조건
				System.out.println("예매를 완료합니다."); // 종료 알림 출력
				int total = count * MONEY; // 총 금액. 변수 total 선언
				System.out.println("총 지불 금액은 " + total + "원 입니다."); // 총 금액값 출력
				break; // 반복문 종료
			} // if
			if (seat[num] != 1) { // if문 조건. 배열값(선택유무) 1(선택)이 아닐때
				seat[num] = 1; // 배열값(선택유무)에 1(선택)을 넣으면
				System.out.println(num + "번 예약완료."); // 예약 완료 문구 출력
				count++; // 예매 카운트 증가
				System.out.println(count + "석 예약완료"); // 총 예매 카운트 문구 출력
			} else { // 배열값(선택유무)이 1(선택)일 때
				System.out.println("이미 예약된 좌석입니다."); // 선택 되었다는 문구 출력
				System.out.println("다른 좌석을 예약해주세요."); // 다른 좌석 예약 요청 문구 출력
			} // else
		} // while
		sc.close(); // 스캐너 변수 닫기
	} // main

} // class
