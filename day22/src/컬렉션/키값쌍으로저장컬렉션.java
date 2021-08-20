package 컬렉션;

import java.util.HashMap;

public class 키값쌍으로저장컬렉션 {

	public static void main(String[] args) {
		HashMap dic = new HashMap(); // 사전이 키와 값 모두 들어간 형태
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("메론", "melon");
		System.out.println(dic); // 투스트링이 형태를 맞춰서 프린트되게 설정
		// dic.clear(); // 목록 모두 삭제
		System.out.println(dic.size());
		System.out.println(dic.get("사과"));
		dic.put("사과", "blueapple"); // 수정
		System.out.println(dic.get("사과"));
		dic.remove("메론");
		System.out.println(dic);
		

	}

}
