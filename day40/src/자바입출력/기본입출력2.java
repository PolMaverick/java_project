package 자바입출력;

import java.util.Scanner;

public class 기본입출력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 콘솔과 자바프로그램간 입력스트림(입력용 연결통로)이 만들어진다.
		// 기본생성자는 클래스 이름과 동일한 이름을 가진 파라메터 없는 생성자 메서드
		// 객체 생성시 꼭 처리해야 할 것이 있으면 생성자 메서드에 정의해서 꼭 실행하도록 하는 역할
		// 변수 초기화 많이 함
		// 생성자는 대문자로 시작하는 유일한 메서드.
		// 스캐너를 바로 생성한 직후 에러의 원인) 기본생성자를 만들어주지 않았기 때문에 호출할 수 없음.
		// 기본생성자는 자동으로 생성됨.
		// 단, 다른 파라메터 있는 생성자가 없는 경우에만!!!
		// 어떤 생성자들이 있는지 알고 싶은 경우
		// 1)컨트롤+클릭 2)자동완성 기능을 사용
		// 추후 닫아줘야 자원의 효율성 측면에서 낭비가 없다.
		
		// 학생 4명의 1차 테스트 점수와 2차 테스트 점수를 받아서 평균을 내고 80점 이상이면 우수한 성적으로 합격입니다.
															// 60점 이상이면 합격입니다.
															// 60점 미만이면 불합격입니다.
		for (int i = 0; i < 4; i++) {
			System.out.print("1차 테스트 점수를 입력해주세요>> ");
			int grade1 = sc.nextInt();
			System.out.print("2차 테스트 점수를 입력해주세요>> ");
			int grade2 = sc.nextInt();
			int grade = (grade1 + grade2) / 2;
			if (grade >= 80) {
				System.out.println("우수한 성적으로 합격입니다.");
			} else if (grade >= 60) {
				System.out.println("합격입니다.");	
			} else {
				System.out.println("불합격 입니다.");
			} 
		}
		sc.close();
	}
}
