package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입 {

	public static void main(String[] args) {
		// set: 집합, 중복된 값을 허용하지 않음.
		HashSet set = new HashSet();
		set.add(100);
		set.add(200);
		set.add(100);
		System.out.println(set.size());
		System.out.println(set); // 주소가 찍혀야 하지만 값이 찍히도록 되어있다. 내용을 확인할때엔 for문 돌리지 않고 바로 확인 가능.
		
		ArrayList list = new ArrayList();
		// 많은 양의 데이터를 다룰 때, 가변, 다양한 데이터인 경우 사용
		list.add(100);
		list.add(100.33);
		list.add(true);
		list.add('a');
		list.add("감자");
		Random r = new Random();
		list.add(r); // 기본형 참조형 다 가능. object으로 되어있기 때문에 가능
		System.out.println(list);
//		System.out.println(list.get(0)); // 여기부터
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5)); // 여기까지 for문으로
		System.out.println(list.size()); // size는 length와 같은 역할
		
		for (int i = 0; i < list.size(); i++) { // length를 size로 바꿔주기
			System.out.println(i + ": " + list.get(i));
		}
		list.remove(5); // 인덱스 5번을 지워라!
		for (int i = 0; i < list.size(); i++) { // length를 size로 바꿔주기
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println(list.size());
		
		
	}

}
