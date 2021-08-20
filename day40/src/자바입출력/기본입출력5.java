package 자바입출력;

import java.util.Scanner;

public class 기본입출력5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] grade = { 0, 0, 0, 0, 0 };
		// int[] grade = new int[5]; // 위와 이 코드가 같다. 배열은 자동 초기화!
		// 횟수를 정하고 반복하고자 하는 경우에는 카운트 초기값, 반복할 조건, 증가값, 종료시점
		int i2 = 0; //카운트 초기값
		while (true) { // 반복할 조건, i2 < 5 라고 하면 밑에 break 필요 없음
			System.out.print("오늘 온도는 몇도인가요? ");
			int temp = sc.nextInt();
			if (temp >= 30) {
				System.out.println("너무 더워요");
			} else {
				System.out.println("괜찮아요");
			} 
			grade[i2] = temp;
			sum = sum + temp; // sum += temp;
			i2++; // 증가값
			if (i2 ==5) { // while(true)인 경우 종료시점을 명시해주어야 한다.
				break;
			}
		}
		double avg = sum / 5.0; // 
		System.out.println("평균은 " + avg);
		System.out.println("---------------");
		for (int i = 0; i < grade.length; i++) { // for 문을 이용해 배열찍어주기
			System.out.print(grade[i] + " ");
		}
		sc.close();
	}
}
