package 데이터;

public class 기본데이터 {

	public static void main(String[] args) {
		// 컴퓨터에서 다루는 기본데이터 종류
		// 문자 (1글자)
		// char gender -> 선언! -> 자바는 선언할 때 데이터의 타입이 결정한다. char, int, double를 통해
		char gender; // 저장공간에 들어갈 데이터의 유형(ex:char) + 저장공간의 이름(ex: gender)
		// 숫자 (정수)
		int age;
		// 숫자 (실수)
		double temp;
		
		// =연산자는 대입, 할당 => 저장공간에 값을 넣는 것.
		gender = '남'; // 한글자이기 때문에 싱글 따옴표
		age = 100; // 정수는 소수점 넣으면 에러
		temp = 25.5;
		
		// 출력. 사용자 관점에서 친절하게 출력해야 한다.
		// + : 결합연산자
		System.out.println("성별: " + gender); // "를 넣었을 땐 gender 라고만 뜬다. 저장공간(변수)에는 "를 붙이지 않는다.
		System.out.println("나이: " + age);
		System.out.println("온도: " + temp);
		
		
	}

}
