package 컬렉션;

import java.util.HashMap;

public class 휴대폰단축키 {

	public static void main(String[] args) {
		HashMap hk = new HashMap();
		hk.put("1", "엄마");
		hk.put("2", "아빠");
		hk.put("3", "친구");
		hk.put("4", "동생");
		System.out.println(hk);
		System.out.println(hk.get("2"));
	}

}
