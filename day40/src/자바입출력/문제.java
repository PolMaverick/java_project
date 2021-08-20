package 자바입출력;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// 1. 4명의 나이를 입력 받으세요.
		// 2. 20대는 화이자, 30대는 얀센, 40대는 AZ, 나머지 연령대는 모더나. 해당 나이에 맞는 백신 출력
		// 3. 입력 받은 나이의 평균을 구하세요.
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] age = { 0, 0, 0, 0 };
		for (int i = 0; i < 4; i++) {
			System.out.print("당신의 나이는 어떻게 됩니까? ");
			int age2 = sc.nextInt();
			if (age2 >= 20 && age2 < 30) {
				System.out.println("당신은 화이자 접종 대상자입니다.");
			} else if (age2 >= 30 && age2 < 40) {
				System.out.println("당신은 얀센 접종 대상자입니다.");
			} else if (age2 >= 40 && age2 < 50) {
				System.out.println("당신은 AZ 접종 대상자입니다.");
			} else {
				System.out.println("당신은 모더나 접종 대상자입니다.");
			} 
			age[i] = age2;
			sum = sum + age2;
		}
		double avg = (double)sum / 4;
		System.out.println("평균은 " + avg);
		sc.close();
	}
}