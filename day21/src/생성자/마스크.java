package 생성자;

public class 마스크 {
	// 속성 => 멤버 변수
	// 색, 가격
	// 멤버 변수는 자동 초기화
	String color; // 참조형 변수는 null
	int price; // 기본형 변수는 0
	
	// 객체생성시 클래스 이름과 동일한 것이 있으면 자동 호출.
	// 객체생성시 넣어줘야 하는 처음값을 넣어주기 위해 사용.
	// 생성자 메서드 => 생성자
	public 마스크(String c, int p) {
		color = c;
		price = p;
	}
	
	// 동작 => 멤버메서드
	public void cover() {
		System.out.println("마스크쓰다.");
	
	}
	
	public String toString() { // 일일히 color price 찍기 번거로우니 toString을 return해서 주소가 아닌 내용이 찍히도록
		return color + " " + price;
	}
}
