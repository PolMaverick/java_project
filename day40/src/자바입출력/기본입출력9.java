package 자바입출력;

import java.util.Random;

public class 기본입출력9 {

	public static void main(String[] args) {
		// 1. 만든 문제 풀어서 올려주세요!
		// 2. Random 클래스를 이용하여
		//    시작할 값(0~), 종료값(1000~)을 발생시키고
		//    3의 배수만 더해보세요
		// hint) r.nextint(10); 0-9
		//		 r.nextint(10) + 1; 1-10
		
		Random r = new Random(10);
		int r1 = r.nextInt(100); // 0~99 시작값
		int r2 = r.nextInt(100) + 1000; // 1000-1099 종료값
		int sum = 0;
		for (int i = r1; i < r2; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("시작값은 " + r1);
		System.out.println("종료값은 " + r2);
		System.out.println("3의 배수만 더한 값은 " + sum);
	}

}
