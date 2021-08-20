package 컬렉션;

import java.util.LinkedList;

public class 냉장고 {

	public static void main(String[] args) {
		LinkedList refrig = new LinkedList();
		refrig.add("상한우유");
		refrig.add("싱싱우유");
		System.out.println(refrig);
		refrig.remove();
		System.out.println(refrig);
	}

}
