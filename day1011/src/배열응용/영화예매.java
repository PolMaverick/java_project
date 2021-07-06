package 배열응용;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		int[] seat = new int[10];
		// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}. (누적)배열은 반복문에 들어가있으면 안된다. 새로 리셋이 되니까. 그래서 주로 맨 위에 위치
		Scanner sc = new Scanner(System.in); // 부품도 반복문 안에 들어갈 필요가 없다.
		int count = 0;
		final int MONEY = 10000; // 항상 똑같은 수가 들어가는 변수(상수). 매번 변하지 않은 값(상수)는 final을 붙여 변경불가능으로 변수를 만들어준다. 변수명은 모두 대문자!!!!
		//int money = 12000; 을 넣어도 절대 변하지 않는다.
		
		while (true) { // while문은 언제나 t/f
			// UI 만들어주기
			System.out.println("--------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			// 배열 만들어주기
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			// 예매 입력값 넣어주기
			System.out.println();
			System.out.print("원하는 자리 번호 입력(종료-1)>> ");
			int no = sc.nextInt(); // 0번 입력
			if (no == -1) {
				System.out.println("예약 시스템 종료합니다.");
				int total = count * MONEY;
				System.out.println("당신의 지불 금액은 " + total + "원 입니다.");
				break; //System.Exit(0);은 밑을 모두 끝내버리니까 while문에서 break;로 바꿔줘서 sc.close();를 언리쳐블 에러를 제거해준다.
			}  
			// 예약처리하기 전에 이미 그 자리가 예약된 자리인지 확인해야한다.
			// 확인방법을 정해봅시다.!
			// 0번을 입력했으면 배열의 인덱스 0번 자리를 1로 변경해서 예약완료를 저장해두자.
			if(seat[no] != 1) {
				seat[no] = 1;
				System.out.println(no + "번 예약완료.");
				count++; // 카운트가 seat[no]의 횟수를 인식해주는 것은 자동적으로 연결된 것이 아니고 프로그래머가 코딩의 위치를 정해줬기 때문. 따라서 상황에 따라 코드가 꼬여 다른 변수까지 카운트가 될 수 있다.
				System.out.println(count + "석 예약됨.");
			} else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 선택해주세요.");
			}
			System.out.println();
		}
		sc.close(); 
		
		// 예약된 자리를 배열에 1이 들어간 개수를 세어도 구할 수 있음.
		// 1. 지금까지 배열에 저장된 값들 중 1이 몇개인지 세어보세요.!
		// {1, 1, 1, 0, 0, 0, 0, 0, 0, 0}
		int count2 = 0;
		for (int j = 0; j < seat.length; j++) { // 값이 많으면 for문
			if (seat[j] == 1) {
				count2++;
			}
			
		}
		System.out.println(count2 + "자리 예약됨.");
		
		// 2. 1로 예약된 자리가 어디인지 프린트. 많이 사용하는 방법.
		String sum = "";
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				//System.out.println(i + "번 자리");
				sum = sum + i + "번 ";
			}
		}
		System.out.println("예약된 자리 목록: " + sum);
		
	}

}
