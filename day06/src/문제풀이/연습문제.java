package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 연습문제 {

	public static void main(String[] args) {
		// 1. 사원번호 입력: 기103
		// 사원번호 중 첫글자가 '기'인 경우 '기획부이군요'
		//				    '인'인 경우 '인사부군요'
		//				    '개'인 경우 '개발부군요'
		// 사원 번호 중 두번째 글자가 '1' 또는 '2' 경우 '임원'
		//                          '3'인 경우 '부장'
		//                          '4' 또는 '5'인 경우 '평사원'
		//                          나머지는 '해당 직급이 없음'
		String idn = JOptionPane.showInputDialog("사원번호를 입력하세요."); // 사원번호의 변수명 idn
		char dep = idn.charAt(0); // idn의 첫째자리, 부서. 변수명 dep
		char pos = idn.charAt(1); // idn의 둘째자리, 직급. 변수명 pos
		
		switch (dep) { // 부서 case 중 일치하는 값을 찾아 해당 명령어 처리
		case '기': // '기'의 경우
			System.out.println("기획부입니다."); // 기획부 출력
			break; // 멈춤
			
		case '인': // '인'의 경우
			System.out.println("인사부입니다."); // 인사부 출력
			break; // 멈춤
			
		case '개': // '개'의 경우
			System.out.println("개발부입니다."); // 개발부 출력
			break; // 멈춤

		default: // 그 외의 경우
			System.out.println("없는 부서입니다."); // 무소속 출력
			break; // 멈춤
		}
		
		switch (pos) { // 직급 case 중 일치하는 값을 찾아 해당 명령어 처리
		case '1': // '1'의 경우
		case '2': // '2'의 경우
			System.out.println("임원입니다."); // 임원 출력
			break; // 멈춤
			
		case '3': // '3'의 경우
			System.out.println("부장입니다."); // 부장 출력
			break; // 멈춤
			
		case '4': // '4'의 경우
		case '5': // '5'의 경우
			System.out.println("평사원입니다."); // 평사원 출력
			break; // 멈춤

		default: // 그 외의 경우
			System.out.println("해당 직급이 없습니다."); // 직급무 출력
			break; // 멈춤
		}
		
		
		
		// 2. 나이를 입력: 2살
		// => 태어난 연도는 2020년(Date 이용)
		// 태어난 시각: 10
		// => 오전에 태어나셨군요( 오전, 오후, 밤, 새벽...)
		String age1 = JOptionPane.showInputDialog("몇살입니까?"); // 나이 입력값을 age1에 저장 // 태어난 연도는 올해년도 - 나이 + 1
		int age2 = Integer.parseInt(age1); // 입력된 string을 정수 변환
		
		Date date = new Date(); // date를 부품으로 RAM에 저장 // 자동 임포트: ctrl + shf + o, f2
		int year1 = date.getYear() + 1900; // 올해 연도
		
		int year2 = (year1 - age2 + 1); // 올해 연도와 나이로 태어난 해 계산 함수 // 모든 함수 명령어가 있는 것은 아니다. 직접 함수를 만들어줘야 한다.
		System.out.println(year2); // 태어난 해 출력

		String time = JOptionPane.showInputDialog("몇시에 태어났습니까?"); // 태어난 시간 입력값을 time에 저장
		int time2 = Integer.parseInt(time); // 입력된 스트링을 정수 변환
		
		if (time2 < 12) { // 입력값이 12보다 작다면 // 구간 같은 경우 switch는 사용하지 않는다.
			System.out.println("오전에 태어났습니다."); // 오전 출생 출력
		} else if (time2 < 20) { // 입력값이 20보다 작다면
			System.out.println("오후에 태어났습니다.");// 오후 출생 출력
		} else if (time2 < 24) { // 입력값이 24보다 작다면 // 맨위로 가면 안된다. 넓은 범위부터 시작하면 거기서 break. 좁은 범위부터 적어서 내려오며 커져야. 
			System.out.println("밤에 태어났습니다."); // 밤 출생 출력
		} else // 그 외의
			System.out.println("새벽에 태어났습니다."); // 새벽 출생 출력
	}

}
