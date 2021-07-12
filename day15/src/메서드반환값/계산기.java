package 메서드반환값;

public class 계산기 {
	// 성질: 멤버변수
	// 동작: 멤버 메서드(이게 포인트)
	// cal.add(100, 200);
	// 이걸 기능 정의라고 한다. 함수정의, 메서드 정의 라고도 한다.
	// x, y는 지역변수(add 안에서만 사용 가능)
	// 메서드 사용(호출, call, 콜)
	// 매서드 안에서 값을 전달할 목적으로 생성되는 변수
	// x, y: 매개 변수(parameter, 파라메터)라고 부른다, 2개 (int x, int y)
	// void: 없다라는 의미, 반환값이 없다.
	public int add(int x, int y) { // return과 void는 절대 같이 나오면 안된다. 리턴할 타입을 적는다.
		int result = x + y;
		System.out.println("합은 " + result);
		return result;
	}
}
