package 클래스생성;

public class Car {
	// 전역변수(global, 글로벌변수) 지역변수와 차이는 자동초기화 유무, 저장위치.
	// 성질 => 변수로 만든다. 멤버변수
	// 색(color), 바퀴수(count)
	public String color; // 틀을 만드는 중이라 값을 이 시점에서는 넣지 않는다. // 자동초기화. 참조형은 null.
	public int count;  // 자동초기화, 0
	
	// 동작 => 멤버매서드
	public void run ( ) { // 매서드
		// 함수의 기능을 정의
		System.out.println("네 바퀴로 달리다.");
	}
	public void up ( ) {
		System.out.println("속도를 20씩 빨라진다.");
	}
	
}
//def run():
//print("네바퀴로 달리다.") 파이선의 문법