package 배열응용;

import java.util.Scanner;

public class 과일 {

	public static void main(String[] args) {
		/* ## 참고, 사과/바나나는 2000원씩, 포도/키위는 3000원씩
		 * ===================================================
		 *  *  좋아하는 과일은? 1)사과 2)바나나 3)포도 4) 키위 0)종료>> 1
		 * ===================================================
		 * 사과가 선택되었습니다.
		 * 
		 * ===================================================
		 *  좋아하는 과일은? 1)사과 2)바나나 3)포도 4) 키위 0)종료>> 2
		 * ===================================================
		 * 바나나가 선택되었습니다.
		 * 
		 * ===================================================
		 *  좋아하는 과일은? 1)사과 2)바나나 3)포도 4) 키위 0)종료>> 0
		 * ===================================================
		 * 시스템이 종료됩니다.
		 * 사과: 3개
		 * 바나나: 2개
		 * 포도: 1개
		 * 키위: 2개
		 * 전체 금액은 _____원입니다.
		 */
		int[] fruits = new int[4];//{0,0,0,0}
		String[] names = {"사과", "바나나", "포도", "키위"};
//		int count = 0;
		Scanner sc = new Scanner(System.in);
		final int MONEY1 = 2000;
		final int MONEY2 = 3000;

		while (true) {
			System.out.println("================================");
			System.out.println("좋아하는 과일은?");
			System.out.println("1)사과 2)바나나 3)포도 4)키위 0)종료");
			System.out.println("================================");
			System.out.print("번호를 입력하여주세요>> ");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("시스템을 종료합니다.");
				for (int i = 0; i < names.length; i++) {
					System.out.println(names[i] + ": " + fruits[i] + "개");
				}
				int total = (fruits[0] * MONEY1) + (fruits[1] * MONEY1) + (fruits[2] * MONEY2) + (fruits[3] * MONEY2);
				System.out.println("전체 금액은 " + total + "원입니다.");
				break;
			}
			if (num > 4  || num < 1) {
				System.out.println("다시 선택해주세요.");
				System.out.println();
			}else {
				fruits[num - 1]++;
				System.out.println(names[num - 1] + "가 선택되었습니다.");
				System.out.println();
//				count++;
			}
			
		} // while
		sc.close();

	} // main

} // class