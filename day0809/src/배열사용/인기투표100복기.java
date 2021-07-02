package 배열사용;

import java.util.Scanner;

public class 인기투표100복기 {
// 순서, 의미
	public static void main(String[] args) {
		String[] name = { "아이유", "유재석", "BTS" }; // 1, 목록을 알고 있는 이름의 배열
		int[] tv = new int[3]; // 2, 목록을 알 수 없는 숫자의 배열
		
		Scanner sc = new Scanner(System.in); // 3, 입력을 받는 스캐너 부품
		
		while (true) { // 12, 종료 전까지 반복
			System.out.println("인기투표 1.아이유 2.유재석 3.BTS 4.종료"); // 4, 출력
			System.out.print("선택번호>> "); // 5, 출력
			int num = sc.nextInt(); // 6, 입력 int값 받는 변수 num
			if (num == 4) { // 7, 종료인 3을 받았을 때
				System.out.println("투표를 종료합니다."); // 9, 출력
				for (int i = 0; i < tv.length;  i++) { // 10, 반복문
					System.out.println(name[i] + ": " + tv[i] + "표"); // 11, 누적 득표 출력
				}
				System.exit(0); // 8, 프로그램 종료
			} 
			tv[num - 1]++; // 13, 득표 누적
			System.out.println(name[num - 1] + " 득표"); // 14, 출력
		} // while
		
	} // main

} // class
