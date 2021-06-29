package 복습;

import java.util.Date;
import java.util.Random;

public class 부품사용방법 {

	public static void main(String[] args) {
		// 망치
		// 너무 자주 사용해서 RAM에 이미 들어가있음.
		// 클래스 이름으로 바로 사용 가능.
		// 하드웨어처럼 생각.
		// Integer, Double, System, JOptionpane
		// 기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고 있는지 여부
		// 함수를 가지고 있는 부품을 선택

		// 벽돌
		Date date = new Date(); // Date라는 부품을 복사해서 RAM에 변수를 만들어 저장해둔다. CPU는 모든 부품을 RAM에 가져다 놓고 조립한다.
		// Date date; => 저장된 타입 변수명; (선언)
		// 선언: RAM에 저장공간을 만드는 것.
		// Random r = new Random();
		// Scanner sc = new Scanner(System.in); // 반드시 입력밧이 있어야 사용할 수 있는 부품이 있다. 복사를 해서
		// 쓸 수 있도록 해주는 부품. System.in이 꼭 필요함.

		int hour = date.getHours(); // 숫자를 불러오는 명령과 처리는 CPU가. 사용하기 위해서 RAM에 저장공간을 만들기 위해 int hour.
		System.out.println("현재 시각은 " + hour + "시");

		System.out.println(date.getMinutes()); // 가능은 하나 바로 가져와서 프린트하고 끝
		// System.out.println(System.out.println()); // 불가능. 가져오는 값이 없어서 할 수 있는 것이 없기
		// 때문에.
		// 이처럼 명령어는 두가지 종류가 있다. 반환값이 있다 없다.
		// 함수는 반환이 있는 것이 있고, 없는 것이 있다.
		// 반환을 return이라고 부른다.
		// 반환이 있는 함수만 프린트가 가능하다.
		// f2를 눌러서 void가 있으면 반환값이 없는 경우

		// 월이 3-5월이면 봄
		// 6-8월이면 여름
		// 9-11월이면 가을
		// 나머지면 겨울
		int month = date.getMonth() + 1; // 음력으로 나오기 때문에 +1
		String result = "해당 계절이 없습니다."; // else 조건이 없을 경우 이 문구가 출력되도록 할 수 있다. 예방의 의미로. 변수의 초기화 몹시 중요!!!
		if (month >= 3 && month <= 5) { // month == 3 || month == 4 || month == 5
			result = "Spring";
		} else if (month >= 6 && month <= 8) {
			result = "Summer";
		} else if (month >= 9 && month <= 11) {
			result = "Fall";
		} else {
			result = "Winter";
		}
		System.out.println(result);

		System.out.println("====================");

		int day = date.getDay(); // 요일
		if (day == 0 || day == 6) { // if문에는 자체 break가 있다. while문은 break가 없다.
			System.out.println("주말에는 놀아요");
		} else {
			System.out.println("주중에는 달려요");
		}

		while (true) { // while문은 항상 break를 넣어줘야 멈추는 무한루프
			System.out.println("달려요!! 달려요!!");
			System.out.println("또 달려요!!");
			System.out.println("마지막 달려요!!");
			break;
		}

		switch (month) { // key 안에 간단한 연산이나 변수를 넣어줄 수 있다. 비교연산자인 if와 달리 변수로. if else가 좀 더 구체적으로 사용 가능.
		case 3:
		case 4:
		case 5: // or 조건을 사용할 수 있다.
			System.out.println("봄");
			break; // 이 break가 없으면 case와 default 둘다 뜨고 break가 걸린다.
		case 6:// 6인 경우
		case 7:
		case 8: // or 조건을 사용할 수 있다.
			System.out.println("여름");
			break; // 이 break가 없으면 case와 default 둘다 뜨고 break가 걸린다.
		case 9:// 6인 경우
		case 10:
		case 11: // or 조건을 사용할 수 있다.
			System.out.println("가을");
			break; // 이 break가 없으면 case와 default 둘다 뜨고 break가 걸린다.
		default: // else의 의미.
			System.out.println("겨울");
			break;
		}
		
		// 2월은 28일까지, 3,5,7,8,10,12는 31일까지, 나머지는 30일 //가장 많은 것을 default에 두는 것이 좋다.
		// switch는 정수(int), 문자1, String만 변수일 수 있다. 실수는 지원하지 않음.
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
			
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지");
			break;

		default:
			System.out.println("30일까지");
			break; // else의 의미일 경우 마지막 break는 제거해도 무방
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
