package 배열문제풀이;

import java.util.Iterator;
import java.util.Scanner;

public class 전화번호스트링배열 {

	public static void main(String[] args) {
		// 전화번호입력>>    011-245-1234  
		// 1) 양쪽 공백을 제거하시오.
		// 2) -을 기준으로 분리해내시오. (String[])
		// 3) 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지면 KT
		// 4) 두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
		// 5) 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
		//		                      아니면 유효하지 않은 전화번호
		
		Scanner sc = new Scanner(System.in); // 스캐너 부품
		System.out.print("전화번호 입력>> "); // 입력창 출력
		String num = sc.next(); // 입력값 스트링 변수 선언
		
		String num2 = num.trim(); // 입력값의 공백 제거(비파괴함수)
//		System.out.println(num2); // 확인용 출력
		
		String[] num3 = num2.split("-"); // 입력값을 "-"로 분리(비파괴함수)
//		System.out.println(num3[0]); // 확인용 출력
//		System.out.println(num3[1]); // 확인용 출력
//		System.out.println(num3[2]); // 확인용 출력
		
		if (num3[0].equals("011")) { // 첫째 문자열이 011과 같을 때
			System.out.println("SK"); // SK 출력
		} else if (num3[0].equals("019")) { // 첫째 물자열이 091와 같을 때
			System.out.println("LG"); // LG 출력
		} else { // 그외
			System.out.println("KT"); // KT 출력
		}
		
		if (num3[1].length() >= 4) { // 두번째 문자열의 길이가 4이상일 때
			System.out.println("최신폰"); // 최신폰 출력
		} else { // 그외
			System.out.println("올드폰"); // 올드폰 출력
		}
		
		String num4 = num2.replace("-", ""); // 입력값의 -를 무공백으로 대체(비파괴함수)
//		System.out.println(num4); // 확인용 출력
		if (num4.length() >= 10) { // 입력값의 길이가 10 이상일 때
			System.out.println("유효한 전화번호"); // 유효한 전화번호 출력
		} else { // 그외
			System.out.println("유효하지 않은 전화번호"); //유효하지 않은 전화번호 출력
		}
		sc.close();	// 스캐너 종료
	} // main

} // class
