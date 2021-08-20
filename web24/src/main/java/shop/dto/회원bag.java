package shop.dto;

public class 회원bag {
	// public String id; // 모든 패키지에서 접근 가능
	// private String id; // 해당 클래스 안에서만 접근 가능. 그러면 dto에서도 접근이 안된다. 그래서 접근은 못하지만 함수를 호출할 수 있도록 해준다.(아래)
	private String id; // default 접근 제어자, 같은 패키지내에서만 접근 가능.
	private String pw;
	private String name;
	private String tel; // == String tel = null;
	// 멤버변수, 클래스 바로 아래 선언됨!
	// 선언의 위치는 생존 범위를 결정! => 클래스 전역에서 사용에서
	// 전역변수(global, 글로벌 변수), 자동 초기화됨.
	// 참조형인 경우, null로 초기화
	
	// setx, getx(x는 id, pw, name, tel의 앞자리)로 자동완성 가능
	// 값을 넣을 때는 set변수명(); , setId();
	// 값을 꺼낼 때는 get변수명(); , getId();
	// getters/setters 라고 부른다. source에서 자동완성 가능
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "회원bag [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	

	
	
	
}
