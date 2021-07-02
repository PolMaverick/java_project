package 배열응용;

import java.util.Scanner;

public class 성적입력 {

	public static void main(String[] args) {
		// int a, b, c, d, e; 누적할 때 고정된 값일 땐 변수가 아닌 배열을 사용
		int[] grade = new int[5]; // {0, 0, 0, 0, 0}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("성적 입력>> ");
			grade[i] = sc.nextInt();
		}
		for (int x : grade) {
			System.out.println(x);
		}

	}

}
