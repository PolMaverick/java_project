package 자바입출력;

import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		Random r = new Random(100); // seed 값, 씨앗값
		int start = r.nextInt(100); // 0-99
		int end = r.nextInt(10) + 1000; // 1000-1009, 종료값

	}

}
