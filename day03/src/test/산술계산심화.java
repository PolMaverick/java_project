package test;

public class 산술계산심화 {

	public static void main(String[] args) {
		int x = 111;
		int y = 222;
		// x + y; // 이런 상태에서는 ram에 저장된 x와 y의 값을 cpu로 가져오고 계산만 하고 끝난 상태. 즉, 출력하거나 저장을 해야한다.
		System.out.println("두 수의 합은 " + (x + y));
		/// System.out.println("두 수의 합은 " + x + y); 이 상태에서는 "두 수의 합은 "과 x가 하나의 스트링으로 인식하게 되어서 "두 수의 합은 111222"로 뜨게 된다.
		System.out.println("두 수의 나눗셈은 " + (x / y)); // 몫만 나오기 때문에 .5가 아닌 정수 형태로 0이 나온다.
		
		// int sum = 333; // 원랜 int sum = x + y; 이렇게 넣어줘야
		int sum = x + y; // int sum 1번 선언, = 2번, x + y 3번 -> 프로그래맹 순서는? 1번 선언부터. 3번 계산을 한다. 2번 1번에 3번을 넣는다.
		// sum / 2; 프린트를 위해 명령어를 내려줘야
		int avg1 = sum / 2;
		System.out.println("평균은 " + avg1); // 파이썬에서는 소수점이 나오지만 자바에선 소수점이 나오지 않음. 자바는 정수와 정수의 계산은 무조건 정수!!
		//실수 값을 얻고 싶으면 자바에서는 하나라도 실수면 무조건 실수의 결과!!
		
		double avg2 = sum / 2.0;
		System.out.println("평균은 " + avg2);

		// 또다른 해결책
	    int count = 2; // 일단 넣어주다보니 이걸 더 선호함
	    // sum / count; // 이러다보니 int 값으로 되어서 소수점이 안나오게 되는 상황이 자주 발생. ram에서는 변경할 수 없으니 cpu에서 강제로 바꿀 수 있다.
	    // 바꾸고 싶은 변수 앞에 '(바꾸고싶은유형)'를 붙이면 cpu에서 강제로 변경해준다. 
	    avg2 = sum / (double)count; // 이렇게 강제로 변경해는 주는 것을 캐스팅이라고 한다.
	    							// 캐스팅(casting): cpu가 원래 데이터의 타입을 다른 타입으로 강제로 변환한 것을 의미한다.
	    							// 강제로 타입변환, 강제형변환
	    System.out.println("평균은 " + avg2);
	    
	    // int x2 = 22.0;
	    double y2 = 22; // int 보다 double이 더 큰 범주. 그렇기에 int는 실수는 불가하지만 double은 정수가 가능하다.
	    
	}

}
