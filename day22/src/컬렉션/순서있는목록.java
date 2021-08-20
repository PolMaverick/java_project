package 컬렉션;

import java.util.ArrayList;
import javax.swing.JFrame;

public class 순서있는목록 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(22.22);
		list.add(true);
		list.add('남');
		list.add(new JFrame());
		System.out.println(list.size());
		System.out.println(list); // 원랜 주소가 나와야 하지만 값이 나온 이유는 toString으로 오버라이딩 되어있기 때문이다.
		System.out.println(list.get(0)); // 첫번째 값
		System.out.println(list.get(5)); // 여섯번째 값
		list.add("목요일");
		System.out.println(list.size());
		list.remove(5);
		list.remove("홍길동"); // 오버로드 되어있어서 가능
		// list.remove(new Integer(100)); //100값을 삭제
		System.out.println(list.size());
		System.out.println(list.get(0)); // 기존 0번이던 "홍길동이 삭제되어서 1번이 0번으로
		list.add(0, "김길동"); // 0번 앞에 김길동을 add
		System.out.println(list);
		list.set(0, "홍길동");
		System.out.println(list);
		
	}

}
