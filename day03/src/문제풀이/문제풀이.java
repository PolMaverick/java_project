package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이 {

	public static void main(String[] args) {
		// 1. 변수에 저장: 커피개수 5잔, 커피값 5000원
		// 총 커피값을 계산하고 출력
		// 커피값이 20000을 넘으면 "할인해드릴게요." 프린트
		// 넘지 않으면 "총 커피값을 내세요."
		int cf = 5; // 커피 개수
		int cfprice = 5000; // 커피값
		int cfTotal = (cf * cfprice); // 커피 총액
		System.out.println(cfTotal); // 커피 총액 출력

		if (cfTotal > 20000) { // 커피 총액 20000이 넘는지?
			JOptionPane.showMessageDialog(null, "할인해드릴게요."); // true
		} else {
			JOptionPane.showMessageDialog(null, "총 커피 값을 내세요."); // false
		}

		// 2. 내 현재 나이를 변수에 저장 100
		// 내 내년 나이를 계산하고 출력
		// 내 내년 나이가 100세를 넘으면 "이제부터 시작",
		// 아니면 "아직 젊어요."
		int age = 100; // 현재 나이
		int nextAge = age + 1; // 내년 나이
		System.out.println(nextAge); // 내년 나이 출력

		if (nextAge >= 100) { // 내년 나이 100 이상인지?
			JOptionPane.showMessageDialog(null, "이제부터 시작"); // true
		} else {
			JOptionPane.showMessageDialog(null, "아직 젊어요."); // false
		}
		
		// 3. 생수값 1000, 생수 구매개수 2,
		// 마스크값 2000, 마스크 구매개수 3
		// 내가 지불해야할
		//  1) 생수값은 얼마?
		//  2) 마스크값은 얼마?
		//  3) 총 지불금액은 얼마?
		int water = 2; // 생수 개수
		int wtPrice = 1000; // 생수값
		int wtTotal = (water * wtPrice); // 생수 총액
		System.out.println("생수값은 " + wtTotal + "원"); // 생수 총액 출력
		
		int mask = 3; // 마스크 개수
		int mkPrice = 2000; // 마스크값
		int mkTotal = (mask * mkPrice); // 마스크 총액
		System.out.println("마스크값은 " + mkTotal + "원"); // 마스크 총액 출력
		
		int wmTotal = (wtTotal + mkTotal); // 생수 마스크 총액
		System.out.println("총 지불금액은 " + wmTotal + "원"); // 생수 마스크 총액 출력
		
		// 4. "나는 짱"을 1000번 프린트
		for (int i = 0; i < 1000; i++) { // 기준 0에서 1000번 출력. 증가
			System.out.println("나는 짱"); // 나는 짱 출력
		}
		
		// 5. 국어점수 75, 수학점수 50을 변수에 저장
		// 국어점수와 수학점수의 총합을 구해서 프린트
		// 평균을 구해서 프린트
		int kr = 75; // 국어 점수
		int ma = 50; // 수학 점수
		int grade = (kr + ma); // 국어 수학 점수 합계
		int count = 2; // 총 과목수
		double avg = grade / (double)count; // 국어 수학 점수 평균. casting
		System.out.println("국어와 수학 점수의 평균은 " + avg +"점 이다."); // 국어 수학 점수 평균 출력
		
	}
}
