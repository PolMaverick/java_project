package 배열복습;

import java.util.Random;

public class 랜덤1000개 {

	public static void main(String[] args) {
		int[] grade = new int[1000];
		// {0, 0, 0, 0, 0, 0, 0,.....}
		// 변수개수: 1002개
		// 전체 RAM의 크기: 4012바이트
		System.out.println(grade.length + "개");
		System.out.println(grade);
		// 기본형 변수(값)의 개수: 1001개 (1000개+length)
		// 참조형 변수(주소)의 개수: 1개 (grade)
		Random r = new Random(42);
//		System.out.println(r.nextInt(100)); // 이것만이 바운더리를 설정해줄 수 있다.
//		grade[0] = r.nextInt();
//		grade[1] = r.nextInt();
//		grade[2] = r.nextInt();
//		grade[3] = r.nextInt();
//		grade[4] = r.nextInt();
		for (int i = 0; i < grade.length; i++) {
			grade[i] = r.nextInt(100);
		}
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}
		for (int x : grade) { // 더 쉬운 방법
			System.out.println(x);
		}

	}

}
