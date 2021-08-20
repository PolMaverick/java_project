package 상속;

public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();
		sMan.name = "클라크"; // Person거
		sMan.age = 1000; // Person거
		sMan.power = 3000; // Man거
		sMan.fly = true; // SuperMan거
		
		System.out.println(sMan);
		sMan.think();
		sMan.tool();
		sMan.run();
		sMan.space();

	}

}
