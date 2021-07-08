package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;

public class 알고리즘과제 {

	public static void main(String[] args) {
		// 1. 동계 올림픽 피겨 순위
		// 1위: 김연아
		// 2위: 김영아
		// 3위: 김양아
		// 4위: 김용아
		// 4위가 반칙을 하여 탈락함.
		// 전체명단을 다시 프린트.
		ArrayList list = new ArrayList();
		list.add("김연아");
		list.add("김영아");
		list.add("김양아");
		list.add("김용아");
		// System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "위: " + list.get(i));
		}
		System.out.println();
		
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "위: " + list.get(i));
		}
		System.out.println();
		
		// 2. 아침에 가방에 넣은 물건들. 가방이 무거워지면 안되니까
		// 하나씩만 넣으려고 함
		// 내 가방은 같은 물건이 하나 이상 들어가지 않음.
		// 실제로 내가 넣은 것: 휴지, 휴대폰, 불펜, 휴지
		// 내 가방에 들어간 물건의 개수와 물건들을 쓰시오
		HashSet set = new HashSet();
		set.add("휴지");
		set.add("휴대폰");
		set.add("볼펜");
		set.add("휴지");
		System.out.println("내 가방에 들어간 물건의 개수: " + set.size() + "개");
		System.out.println("내 가방에 들어간 물건: " + set);
	}

}
