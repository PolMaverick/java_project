package 자바입출력;

import java.util.Scanner;

public class 기본입출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 콘솔과 자바프로그램간 입력스트림(입력용 연결통로)이 만들어진다.
		// 기본생성자는 클래스 이름과 동일한 이름을 가진 파라메터 없는 생성자 메서드
		// 객체 생성시 꼭 처리해야 할 것이 있으면 생성자 메서드에 정의해서 꼭 실행하도록 하는 역할
		// 변수 초기화 많이 함
		// 생성자는 대문자로 시작하는 유일한 메서드.
		// 스캐너를 바로 생성한 직후 에러의 원인) 기본생성자를 만들어주지 않았기 때문에 호출할 수 없음.
		// 기본생성자는 자동으로 생성됨.
		// 단, 다른 파라메터 있는 생성자가 없는 경우에만!!!
		// 어떤 생성자들이 있는지 알고 싶은 경우
		// 1)컨트롤+클릭 2)자동완성 기능을 사용
		// 추후 닫아줘야 자원의 효율성 측면에서 낭비가 없다.
		// 누적용은 반복문 안에 넣지 않는다. 
		//int sum; // 쓰레기 값 상태: 연산도 할 수도 없고, 출력도 안되는 상태
		int sum = 0; // 쓰레기 값 대신 처음 값 넣어주는 것, 초기화, 변수 초기화
		// 변수 초기화를 반드시 해주어야 하는 경우는?
		// 자동으로 되는 경우가 있음. (전역변수, 멤버변수는 자동초기화됨)
		// 전역변수는 클래스 전체영역에서 사용가능한 변수
		// 변수 선언의 위치에 따라 사용할 수 있는 범위가 달라짐.
		// 변수 선언이 클래스 바로 아래 되어야 전체 영역에서 사용 가능.
		// 자동으로 안되는 경우는 수동으로 초기화를 해주어야 한다. (지역변수, 로컬변수)
		// 로컬변수는 반드시 수동으로 초기화 해주어야 한다.
		
		for (int i = 0; i < 5; i++) {
			// 오늘 온도는 몇도인가요?
			// 변수에 넣어서, 30도 이상이면 너무 더워요.
			//			   그 미만이면 괜찮아요!		
			System.out.print("오늘 온도는 몇도인가요? ");
			// CPU구성(연산+제어+저장)
			// 변수에 넣어서, 30도 이상이면 너무 더워요.
			int temp = sc.nextInt(); // 모든 외부 입력은 모두다 string. nextint만 int로 변환
			//  1    3    2 -> 순서
			// 1) 변수 선언: 변수 만들어졌음.
			// 2) 입력값을 스트링으로 받아서 정수로 변환.
			// 3) 변환한 정수값을 변수에 저장함.
			if (temp >= 30) {
				System.out.println("너무 더워요");
			} else {
				System.out.println("괜찮아요");
			} 
			sum = sum + temp; //누적 // sum 에러의 이유: 초기화 하지 않아서 쓰레기 값. 아무것도 없어서 아무 것도 할 수 없으니까.
		}
		// 누적 다하고 for문 밖에다가.
		double avg = sum / 5.0; // 자바에서 정수끼리의 연산은 무조건 정수, 자바에서는 하나라도 실수이면 연산의 결과는 무조건 실수
		// double sum = 0.0; // 자바에서는 재선언이 안된다. 파이썬에서는 가능
		// double avg = (double)sum; // (바꾸고 싶은 타입)은 CPU가 RAM에 있는 것을 가져다가 type 변경!
		System.out.println("평균은 " + avg);
		sc.close();
	}

}
