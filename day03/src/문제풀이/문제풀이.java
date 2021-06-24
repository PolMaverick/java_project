package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이 {

	public static void main(String[] args) {
		// 1. 변수에 저장: 커피개수 5잔, 커피값 5000원
		// 총 커피값을 계산하고 출력
		// 커피값이 20000을 넘으면 "할인해드릴게요." 프린트
		// 넘지 않으면 "총 커피값을 내세요."
		int cf = 5;
		int cfprice = 5000;
		int cfTotal = (cf * cfprice);
		System.out.println(cfTotal);

		if (cfTotal > 20000) {
			JOptionPane.showMessageDialog(null, "할인해드릴게요.");
		} else {
			JOptionPane.showMessageDialog(null, "총 커피 값을 내세요.");
		}

		// 2. 내 현재 나이를 변수에 저장 100
		// 내 내년 나이를 계산하고 출력
		// 내 내년 나이가 100세를 넘으면 "이제부터 시작",
		// 아니면 "아직 젊어요."
		int age = 100;
		int nextAge = age + 1;
		System.out.println(nextAge);

		if (nextAge >= 100) {
			JOptionPane.showMessageDialog(null, "이제부터 시작");
		} else {
			JOptionPane.showMessageDialog(null, "아직 젊어요.");
		}
		
		// 3. 생수값 1000, 생수 구매개수 2,
		// 마스크값 2000, 마스크 구매개수 3
		// 내가 지불해야할
		//  1) 생수값은 얼마?
		//  2) 마스크값은 얼마?
		//  3) 총 지불금액은 얼마?
		int water = 2;
		int wtPrice = 1000;
		int wtTotal = (water * wtPrice);
		System.out.println("생수값은 " + wtTotal + "원");
		
		int mask = 3;
		int mkPrice = 2000;
		int mkTotal = (mask * mkPrice);
		System.out.println("마스크값은 " + mkTotal + "원");
		
		int wmTotal = (wtTotal + mkTotal);
		System.out.println("총 지불금액은 " + wmTotal + "원");
		
		// 4. "나는 짱"을 1000번 프린트
		for (int i = 0; i < 1000; i++) {
			System.out.println("나는 짱");
		}
		
		// 5. 국어점수 75, 수학점수 50을 변수에 저장
		// 국어점수와 수학점수의 총합을 구해서 프린트
		// 평균을 구해서 프린트
		int kr = 75;
		int ma = 50;
		int grade = (kr + ma);
		int count = 2;
		double avg = grade / (double)count;
		System.out.println("국어와 수학 점수의 평균은 " + avg +"점 이다.");
		
	}
}
