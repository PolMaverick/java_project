package 자바입출력;

import java.util.Scanner;

public class 기본입출력3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] grade = { 0, 0, 0, 0, 0 };
		// int[] grade = new int[5]; // 위와 이 코드가 같다. 배열은 자동 초기화!
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 온도는 몇도인가요? ");
			int temp = sc.nextInt();
			if (temp >= 30) {
				System.out.println("너무 더워요");
			} else {
				System.out.println("괜찮아요");
			} 
			grade[i] = temp;
			sum = sum + temp; // sum += temp;
		}
		double avg = sum / 5.0;
		System.out.println("평균은 " + avg);
		System.out.println("---------------");
		for (int i = 0; i < grade.length; i++) { // for 문을 이용해 배열찍어주기
			System.out.print(grade[i] + " ");
		}
		sc.close();
	}
}
