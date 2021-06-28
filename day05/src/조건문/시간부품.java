package 조건문;

import java.util.Date;

public class 시간부품 {

	public static void main(String[] args) {
		// 25년된 Date 부품
		Date date = new Date(); // RAM에 저장되어서 계속 사용 가능한 부품
		
		int hr = date.getHours(); // 취소선은 이클립스에서 최신 부품이 아니기 때문에 붙은 것. 사용해도 무방
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hr + "시" + min + "분" + sec + "초");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1; // 음력으로 나오기 때문에 + 1 을 해줘야 한다.
		int today = date.getDate();
		System.out.println(year + "년" + month + "월" + today + "일");
		
		int day = date.getDay(); // 요일이 숫자로 나오는 이유는 각 언어가 다르기 때문에
		System.out.println(day);
		
		if (day == 0) {
			System.out.println("일요일");
		}else if (day == 1) {
			System.out.println("월요일");
		}else if (day == 2) {
			System.out.println("화요일");
		}else if (day == 3) {
			System.out.println("수요일");
		}else if (day == 4) {
			System.out.println("목요일");
		}else if (day == 5) {
			System.out.println("금요일");
		}else if (day == 6) {
			System.out.println("토요일");
		}

	}

}
