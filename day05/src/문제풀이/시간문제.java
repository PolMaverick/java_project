package 문제풀이;

import java.util.Date;

public class 시간문제 {

	public static void main(String[] args) {
		// 시간을 구해보세요.
		// 10시 전이면 굿모닝
		// 15시 전이면 굿애프터눈
		// 20시 전이면 굿이브닝
		// 나머지는 굿나잇
		Date date = new Date(); // date 부품을 만들어 RAM에 저장
		
		int hr = date.getHours(); // 시간을 정수 변환
		if (hr <= 10) { // 10시 이전이라면
			System.out.println("Good Morning!"); // 굿모닝 출력
		}else if (hr > 10 && hr <= 15) { // 10-15시 사이라면
			System.out.println("Good Afternoon!"); // 굿애프터눈 출력
		}else if (hr > 15 && hr <= 20) { // 15-20시 사이라면
			System.out.println("Good Evening!"); // 굿이브닝 출력
		}else { // 그 외의 시간이라면
			System.out.println("Good Night!"); // 굿나잇 출력
		}
		
		// 요일이 토/일이면 쉬어요.
		// 나머지 요일이면 달려요.
		int day = date.getDay(); // 요일 정수 변환
		if (day == 0 || day == 6) { // 토/일요일이라면
			System.out.println("쉬어요"); // 쉬어요 출력
		}else { // 그외의 요일이라면
			System.out.println("달려요"); //달려요 출력
		}
		
		// 월이 3-5월이면 봄
		// 6-8월이면 여름
		// 9-11월이면 가을
		// 나머지면 겨울
		int season = date.getMonth(); // 계절 정수 변환
		if (season >= 3 && season <= 5) { // 3-5월이라면
			System.out.println("Spring"); // 봄 출력
		}else if (season >= 6 && season <= 8) { // 6-8월이라면
			System.out.println("Summer"); // 여름 출력
		}else if (season >= 9 && season <= 11) { // 9-11월이라면
			System.out.println("Fall"); // 가을 출력
		}else { // 그외의 월이라면
			System.out.println("Winter"); // 겨울 출력
		}
		
	}

}
