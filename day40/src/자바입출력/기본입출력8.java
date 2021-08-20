package 자바입출력;

import java.util.ArrayList;
import java.util.Scanner;

public class 기본입출력8 {

	public static void main(String[] args) {
		// 1. 시작할 값 입력, 종료할 값 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("시작할 값 입력 >> ");
		int first = sc.nextInt();
		System.out.print("종료할 값 입력 >> ");
		int second = sc.nextInt();
		
		int sum= 0; // 더해주는 변수 초기화
		int count = 0; // 카운트 변수 초기화
		// 4. 5의 배수의 목록
		ArrayList<Integer> list= new ArrayList<>();
		
		for (int i = first; i <= second; i++) {
			// 2. 3의 배수만 더해서 출력
			if (i % 3 ==0) {
				sum += i;
				// 3. 3의 배수의 개수
				//count++; // arraylist를 쓰면 카운트 필요 없어짐.
				// if문 안에 들어있으면 if문에 조건에 맞는 것만 카운트, for문 안에 들어있으면 for문의 조건에 맞는 것만 카운트
				list.add(i); // 4. 5의 배수의 목록
			}
		}
		// 2. 5의 배수만 더해서 출력
		System.out.println("총합계는 " + sum);
		// 3. 5의 배수의 개수
		//System.out.println("5의 배수의 개수는 " + count);
		System.out.println("5의 배수의 개수는 " + list.size());
		// 4. 5의 배수의 목록
		System.out.println(list);
		// 5. 5의 배수의 평균값
		System.out.println((float)sum / list.size());
		sc.close();
	}
}
