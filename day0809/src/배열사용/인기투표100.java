package 배열사용;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 인기투표100 {

	public static void main(String[] args) {
		String[] name = { "아이유", "유재석", "BTS" }; // 이름 배열이 필요
		int[] tv = new int[3]; // 투표수 {0, 0, 0}로 초기화
		
		Scanner sc = new Scanner(System.in); // 그래픽 경우 빼고는 이런 부품을 반복문 안에 넣지 않음. 배열도 마찬가지.
		
		while (true) {
			// 사용자가 사용할 수 있도록 화면을 만들어보자.
			System.out.println("인기투표 0)아이유 1)유재석 2)BTS 3) 종료");
			System.out.print("선택번호>> ");
			int num = sc.nextInt();
			if (num == 3) {
				System.out.println("시스템을 종료합니다.");
				for (int i = 0; i < tv.length; i++) {
					System.out.println(name[i] + ": " + tv[i] + "표");
				}
//				System.out.println(name[0] + ": " + tv[0]);		
//				System.out.println(name[1] + ": " + tv[1]);
//				System.out.println(name[2] + ": " + tv[2]);
				System.exit(0); // while문에서 if문은 항상 종료부터 넣는다!!
			}
			// 해당 인덱스에 있는 배열의 값을 1 증가
			tv[num]++;
			System.out.println(name[num] + "표 득표");
			
		}

	}

}
