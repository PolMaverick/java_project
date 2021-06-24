package test;

public class test {

	public static void main(String[] args) {
		//	프로젝트 day03
		//	1) 패키지명 복습
		//	2) 클래스명 복습1
		//	 오늘을 나타내는 정보를 기본데이터를 이용해서 저장하고 출력해보세요.
		//	 - 오늘 온도 26.2
		//	   어제 온도 27.5
		//	 - 오늘 온도와 어제 온도가 동일한지 프린트
		//	 - 어제 온도보다 오늘 온도가 높은지도 프린트
		int classNo = 8; // 1b
		double totemp = 26.2; // 4b
		char day = '목'; // 2b
		boolean food = false; // b
		String lunch = "1층 가서 생각해보자."; // 12x2바이트 = 24바이트. 부품을 쓰면 바이트가 급격히 늘어남.
		
		System.out.println("오늘 온도는 " + totemp + "도");
		System.out.println("오늘 수업 수는 " + classNo);
		System.out.println("오늘은 " + day +"요일");
		System.out.println("아침 먹었나요 " + food);
		System.out.println("점심 어떻게 하지? " + lunch);
		System.out.println(totemp == 27.5);
		System.out.println(totemp > 27.5);
		//오늘 온도 29.2로 번경하여, 어제의 온도보다 낮은지?
		
		totemp = 29.2; // 왜 변경할 땐 선언을 따로 안해주는지? 이미 결정이 나서 값만 바꾸어 줄 땐 또 추가로 선언할 필요가 없다.
		System.out.println(totemp < 27.5);
	}

}
