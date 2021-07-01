package 문제풀이;

import java.util.Scanner;

public class 콘솔입력스캐너 {
	
	public static void main(String[] args) {
//		숫자 1 입력 >> 200
//		숫자 2 입력 >> 100
//		앞숫자가 크다.
//		n1: 200
//		n2: 100
//		당신이 좋아하는 과목은 >> java
//		JSP로 점프
		Scanner sc = new Scanner(System.in);
		System.out.print("과목을 입력(자바, c++, python)>> ");
		String data = sc.next();
		if (data.equals("자바")) {
			System.out.println("JSP점프@@");
		} else if (data.equals("c++")) {
			System.out.println("ASP점프@@");
		} else if (data.equals("python")) { // == 주소를 비교, equals는 값을 비교!!!!! 기술 면접 때 나올수도 있음.
			System.out.println("python점프@@");
		}
		
		switch (data) {
		case "자바":
			System.out.println("JSP점프@@");
			break;
		case "c++":
			System.out.println("ASP점프@@");
			break;
		case "python":
			System.out.println("python점프@@");
			break;
		default:
			break;
		}

	}

}
