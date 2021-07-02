package 배열응용;

import java.util.Random;

public class 랜덤입력 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] grade = new int[100];

		// 랜덤한 값 하나 만들어서 배열의 특별한 인덱스에 저장하는 것을 반복
		for (int i = 0; i < grade.length; i++) {
			grade[i] = r.nextInt(101);
		}
		for (int x : grade) {
			System.out.println(x);
		}
		
		

		

	}

}
