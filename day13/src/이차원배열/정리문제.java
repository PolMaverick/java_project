package 이차원배열;

import java.util.Random;

public class 정리문제 {

	public static void main(String[] args) {
		// 1. 랜덤한 값을 1-100
		// 2. 4*5에 넣으세요.
		// 3. 전체를 프린트
		
		Random r = new Random();
		int[][] n1 = new int[4][5];
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				n1[i][j] = r.nextInt(100) + 1;
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
