package 상속;

public class TenMillion extends Actor {
	boolean tenMillion;
	
	public void audience() {
		System.out.println("천만관객을 찍은 영화의 배우입니다. ");
	}

	@Override
	public String toString() {
		return "TenMillion [tenMillion=" + tenMillion + ", job=" + job + ", name=" + name + ", age=" + age + "]";
	}
}
