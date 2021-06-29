package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {
		String food = "스파게티";
		
		switch (food) {
		case "떡볶이": // 변수가 String이니 case도 String. 형식을 맞춰야 한다.
			System.out.println("분식집으로");
			break;
		//우동: 일식집, 짜장: 중국집, 아니면: 집에서
		case "우동": // 변수가 String이니 case도 String. 형식을 맞춰야 한다.
			System.out.println("일식집으로");
			break;
		case "짜장": // 변수가 String이니 case도 String. 형식을 맞춰야 한다.
			System.out.println("중국집으로");
			break;
		default:
			System.out.println("집에서");
		}
		
		
		//함수를 이용해 string에서 char 하나를 추출해낼 수 있다. 위치값 = index
		String ssn = "980201-1037514"; // 계산을 하지 않고, 자리수가 없기 때문에. // 언어에서 r을 제외하곤 숫자 카운트에 있어 0부터 시작
		
		char gender = ssn.charAt(7); // CPU에서 '1'을 추출 // char는 기본데이터이기 때문에 비교 연산자 가능. string은 안된다.
		// switch문으로
		switch (gender) {
		case '1': // int가 아닌 char이기 때문에 꼭!!!!! '' 붙여준다.
		case '3': // 다른
			System.out.println("남자입니다.");
			break;
		
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;

		default:
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		// if~else문으로 : char는 비교 연산자 가능.
		if (gender == '1' || gender == '3') { // int가 아닌 char이기 때문에 꼭!!!!! '' 붙여준다.
			System.out.println("남자입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		} else
			System.out.println("잘못입력하셨습니다.");
		
	}

}
