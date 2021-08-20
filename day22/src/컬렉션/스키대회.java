package 컬렉션;

import java.util.ArrayList;

public class 스키대회 {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		System.out.println(ski.size());
		ski.remove("송스키"); // index로도 삭제 가능
		System.out.println(ski);
		System.out.println(ski.size());
		
		for (int i = 0; i < ski.size(); i++) { // 등수와 함께 찍기 위해선 for문과 i가 필요
			System.out.println(i + 1 + "등: " + ski.get(i)); // i가 0부터 시작이라 +1. 인덱스 i값에 따라 값 찍어주기.
		}
		
		for (Object o : ski) { // i값이 필요 없이 그냥 다찍어 줄때 for-each
			System.out.println(o);
		}
	}

}
