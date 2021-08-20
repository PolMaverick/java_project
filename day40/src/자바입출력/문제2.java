package 자바입출력;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// 1. 시작할 값과 종료할 값을 입력해주세요.
		// 2. 3의 배수만 더해서 출력해주세요.
		// 3. 3의 배수의 개수를 출력해주세요.
		// 4. 만약 그 개수가 30개 이상이면 '3의 배수가 많습니다.' 출력
		//				 	  미만이면  '3의 배수가 적습니다.' 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작할 값 입력 >> ");
		int first = sc.nextInt();
		System.out.print("종료할 값 입력 >> ");
		int second = sc.nextInt();
		
		int sum= 0; // 더해주는 변수 초기화

		ArrayList<Integer> list= new ArrayList<>();
		
		for (int i = first; i <= second; i++) {
			if (i % 3 ==0) {
				sum += i;
				list.add(i);
			}
		}
		// 2. 3의 배수만 더해서 출력
		System.out.println("총합계는 " + sum);
		// 3. 3의 배수의 개수
		System.out.println("5의 배수의 개수는 " + list.size());
		// 4. 만약 그 개수가 30개 이상이면 '3의 배수가 많습니다.' 출력
		//				 	  미만이면  '3의 배수가 적습니다.' 출력
		if (list.size() >= 30) {
			System.out.println("3의 배수가 많습니다.");
		} else {
			System.out.println("3의 배수가 적습니다.");
		}
		sc.close();
	}
}
