package 상속;

//Person 클래스를 확장(상속, 재사용)해서 Man클래스를 정의하겠다
//			 Man extends Person
public class Man extends Person{
	// 멤버변수 2개
	// 멤버메서드 2개
	
	int power;
	
	// 생성자가 하나도 정의되어 있지 않으면, 기본 생성자가 자동으로 만들어진다.
//	public Man() { <- 눈에 보이진 않음
//	}
	public void run() {
		System.out.println("빨리 달리다. ");
	}

	@Override // 부모클래스로 부터 받은 메서드를 덮어써버림. 오버라이드, overwrite
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
}
