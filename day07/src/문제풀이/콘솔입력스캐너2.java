package 문제풀이;

import java.util.Scanner;

public class 콘솔입력스캐너2 {
	
	public static void main(String[] args) {
		//나이입력 >> 100									nextInt()
		//내년나이는 101세
		//키를 입력 >> 88.8								nextDouble()
		//내년 키는 98.8
		//저녁을 먹었는지 입력 (true/false) >> true 			nextBoolean()
		//배가 부르시겠군요!
		//올해의 목표는 >> 열심히 살자 						nextLine()
		//올해의 목표는 열심히 잘자!!!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.println("내년 나이는 " + (age +1) + "세");
		
		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();
		System.out.println("내년 키는 " + (height + 10));
		
		System.out.print("저녁 먹었는지 입력(true/false)>> ");
		boolean food = sc.nextBoolean();
		if (food) {
			System.out.println("배가 부르시겠군요!");
		} else {
			System.out.println("배가 고프시겠군요!");
		}
		sc.nextLine();
		
		System.out.print("올해의 목표는 >> ");
		String goal = sc.nextLine();
		System.out.println("올해의 목표는 " + goal + "!!!");
	}
		
}
