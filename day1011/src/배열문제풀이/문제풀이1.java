package 배열문제풀이;

import java.util.Scanner;

public class 문제풀이1 {

	public static void main(String[] args) {
		// 1. 정수 5개 크기의 배열을 만들어서
		//    10, 20, 30, 40, 50을 순서대로 넣는다.
		//    첫번째값과 세번째값을 더해서 프린트
		// int[] num = {10, 20, 30, 40, 50};
		// System.out.println(num[0] + num[2]);
		
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자입력>> ");
			num[i] = sc.nextInt();
		}
		System.out.println(num[0] + num[2]);
		sc.close(); // stream(연결통로)을 닫아라!
		}

}
