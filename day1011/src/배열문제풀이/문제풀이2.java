package 배열문제풀이;

import java.util.Scanner;

public class 문제풀이2 {

	public static void main(String[] args) {
		// 2. 스트링 3개 크기의 배열을 만들어서
		//    자바, 스프링, JSP를 순서대로 넣는다.
		//    => "자바 보다는 스프링"로 출력
		// String[] lang = {"Java", "Spring", "JSP"};
		// System.out.println(lang[0] + " 보다는 " + lang[1]);
		String[] lang = new String[3];
		// 배열은 자동 초기화 {null, null, null} 참조형은 null로
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lang.length; i++) {
			System.out.print("과목입력>> ");
			lang[i] = sc.next(); // 스트링은 그냥 next
		}
		System.out.println(lang[0] + " 보다는 " + lang[1]);
		sc.close();
	}

	
	// s2[0]: 주소!!!
	// String 변수는 원래 주소가 들어가 있지만
	// 내부적으로 그 주소가 가르키는 char들을 프린트 되도록 조정이 되어있는 상태이.
}
