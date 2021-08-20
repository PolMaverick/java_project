package 생성자;

public class 통장 {
	// 멤버변수
	String name;
	String ssn;
	int money;
	
//	public 통장() {
		// 생성자 중에서 입력값이 없는 생성자 - 기본생성자(default constructor)
		// 다른 생성자가 하나도 없으면 자동 생성. 그래서 은행.java에서 new 통장();이 에러가 안뜨는 것.
		// 묵시적으로 만들어져서 묵시적 생성자
//	} // 밑에 자동생성으로 생성자를 만들어 주면 자동생성해주지 않아서 new 통장();에서 에러가 된다.
	
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	
	// 멤버메서드
	public void 입금하다() {
		System.out.println("입금하다.");
	}
	
	// 오버라이드(재정의): 원래 메서드가 있던 것을 똑같은 형태로 다시 한번 정의해주면 원래 있었던 메서드가 다시 정의한 메서드로 덮어써짐.
	// 위로 올라타다(오버라이드)
	// 오버로딩(다형성. 동일한 메서드명 사용가능)과 비교 자주 나옴
	@Override // 오버라이드. 표시의 의미. 지워도 그만
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	// @ : xxxx@gmail.com (at, -에)
	//     @overrice(Annotation, 표시)
	
}
