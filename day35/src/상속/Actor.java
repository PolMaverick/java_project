package 상속;

public class Actor extends Person {
	String job;
	
	public void acting() {
		System.out.println("직업은 배우입니다.");
	}

	@Override
	public String toString() {
		return "Actor [job=" + job + ", name=" + name + ", age=" + age + "]";
	}
	
}
